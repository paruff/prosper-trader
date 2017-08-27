package org.llap.prosper.trader.services.system;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import yahoofinance.histquotes.HistoricalQuote;
import yahoofinance.histquotes.Interval;

public class s1 {
// markets;
	BigDecimal position;
	BigDecimal entry;
	BigDecimal exit;
	BigDecimal stop;
//	tatics;
	
public List<HistoricalQuote> getHistory(String symbol, Integer back) throws IOException{
	
	Calendar from = Calendar.getInstance();
	Calendar to = Calendar.getInstance();
	from.add(Calendar.YEAR, back); // from 1 year ago

	Stock stock = YahooFinance.get(symbol);
	List<HistoricalQuote> stockHistQuotes = stock.getHistory(from, to, Interval.DAILY);

return stockHistQuotes;

	}

}

