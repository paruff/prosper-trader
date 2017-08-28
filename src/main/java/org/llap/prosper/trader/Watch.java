package org.llap.prosper.trader;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import yahoofinance.histquotes.HistoricalQuote;
import yahoofinance.histquotes.Interval;

public class Watch {
//	Watch(String symbol) throws IOException {
//		Calendar from = Calendar.getInstance();
//		Calendar to = Calendar.getInstance();
//		from.add(Calendar.YEAR, -1); // from 1 year ago
//
//		Stock stock = YahooFinance.get(symbol);
//	    stockHistQuotes = stock.getHistory(from, to, Interval.DAILY);
//	}

	public int getWatchId() {
		return watchId;
	}
	public void setWatchId(int watchId) {
		this.watchId = watchId;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	public BigDecimal getQuote() throws IOException{

		Stock stock = YahooFinance.get(symbol);
		BigDecimal price = stock.getQuote(true).getPrice();
		return price;
	}

	public BigDecimal getEntry() throws IOException {
		Calendar from = Calendar.getInstance();
		Calendar to = Calendar.getInstance();
		from.add(Calendar.YEAR, -1); // from 1 year ago

		Stock stock = YahooFinance.get(symbol);
		List<HistoricalQuote> stockHistQuotes = stock.getHistory(from, to, Interval.DAILY);

		// 52 week high
		// entry = Collections.max((Collection<? extends T>) stockHistQuotes);
		Stock aStock = YahooFinance.get(symbol);
		BigDecimal max = aStock.getQuote(true).getPrice();

		// int max = Integer.MIN_VALUE;
		for (int i = stockHistQuotes.size()-entryDays; i < stockHistQuotes.size(); i++) {
			if (stockHistQuotes.get(i).getHigh().compareTo(max) > 0) {
				max = stockHistQuotes.get(i).getHigh();
			}
		}
		return max;
		
	}
	
	public BigDecimal getExit() throws IOException {
		Calendar from = Calendar.getInstance();
		Calendar to = Calendar.getInstance();
		from.add(Calendar.YEAR, -1); // from 1 year ago

		Stock stock = YahooFinance.get(symbol);
		List<HistoricalQuote> stockHistQuotes = stock.getHistory(from, to, Interval.DAILY);


		Stock aStock = YahooFinance.get(symbol);
		BigDecimal min = aStock.getQuote(true).getPrice();

		for (int i = stockHistQuotes.size()-exitDays; i < stockHistQuotes.size(); i++) {
			if (stockHistQuotes.get(i).getLow().compareTo(min) < 0) {
				min = stockHistQuotes.get(i).getLow();
			}
		}
		return min;
		
	}
	
	public int getSize() throws IOException {
		Calendar from = Calendar.getInstance();
		Calendar to = Calendar.getInstance();
		from.add(Calendar.YEAR, -1); // from 1 year ago

		Stock stock = YahooFinance.get(symbol);
		List<HistoricalQuote> stockHistQuotes = stock.getHistory(from, to, Interval.DAILY);

		size = stockHistQuotes.size();
		return size;
		
	}
	
	private int watchId;
	private String symbol;
	private double quote;
	private BigDecimal entry;
	private int size;
	List<HistoricalQuote> stockHistQuotes;
	
	private static int entryDays = 55;
	private static int exitDays= 20;
	private static int stopATR = 5;
	

}
