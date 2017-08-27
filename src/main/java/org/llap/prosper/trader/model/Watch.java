package org.llap.prosper.trader.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Watch {
	
	public int getWatchId() {
		return watchId;
	}
	public void setWatchId(int watchId) {
		this.watchId = watchId;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	/*public String getCompanyNmae() {
		return companyNmae;
	}
	public void setCompanyNmae(String companyNmae) {
		this.companyNmae = companyNmae;
	}*/
	@Id
	private int watchId;
	private String symbol;
//	private String companyNmae;

}
