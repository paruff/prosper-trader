package org.llap.prosper.trader.models;

	import javax.persistence.*;
	import java.util.Date;

	@Entity
	@Table(name = "position")
	public class Position {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    @Column(nullable = false, length = 300)
	    private String symbol;

	   /* @Column(nullable = false)
	    private Date purchaseDate = new Date();*/

	    private double purchasePrice;
	    
	    private int purchaseShares;

/*	    @Column(nullable = true)
	    private Date saleDate = new Date();

	    private double salePrice;
	    
	    private int saleShares;
	    */
	    
	     public Position() {}

	     public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getSymbol() {
			return symbol;
		}

		public void setSymbol(String symbol) {
			this.symbol = symbol;
		}

		/*public Date getPurchaseDate() {
			return purchaseDate;
		}

		public void setPurchaseDate(Date purchaseDate) {
			this.purchaseDate = purchaseDate;
		}
*/
		public double getPurchasePrice() {
			return purchasePrice;
		}

		public void setPurchasePrice(double purchasePrice) {
			this.purchasePrice = purchasePrice;
		}

		public int getPurchaseShares() {
			return purchaseShares;
		}

		public void setPurchaseShares(int purchaseShares) {
			this.purchaseShares = purchaseShares;
		}

		public Position(int id, String symbol,  double purchasePrice) {
	          this.id = id;
	          this.symbol = symbol;
//	          this.purchaseDate = purchaseDate;
	          this.purchasePrice = purchasePrice;
	          
	    }

	     @Override
	     public String toString() {
	         return "position{" +
	            "id=" + id +
	            ", symbol='" + symbol + '\'' +
	//            ", purchase date='" + purchaseDate + '\'' +
	            ", purchase price=" + purchasePrice + '\'' +
	            ", purchase shares=" + purchaseShares +
	            '}';
	    }

		public String getPositionId() {
			// TODO Auto-generated method stub
			return null;
		}
	}