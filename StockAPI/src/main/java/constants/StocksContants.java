/**
 * 
 */
package constants;

public interface StocksContants {
	
	public String URL = "http://finance.google.com/finance/info?client=ig&q=NASDAQ%3AAAPL,%20AMZN,%20MSFT,%20JWN,%20JCP,%20M,%20GOOGL,%20FB,%20TSLA,%20SNE,%20SSNLF";
	public String DB_DRIVER = "com.mysql.jdbc.Driver";
	public String DB_CONNECTION = "jdbc:mysql://fetchdb.cdnb2rvsplfi.us-west-2.rds.amazonaws.com:3306/stocks?useSSL=false";
	public String DB_USER = "fetchUser";
	public String DB_PASSWORD = "adcfetchservice";
	public String BUYSELL_STOCKS_QUERY = "SELECT ticker,price,counter FROM Stocks WHERE ticker = ?";
	public String TICKER = "ticker";
	public String PRICE = "price";
	public String COUNTER = "counter";


}
