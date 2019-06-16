package java_20190613;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class CoinCrawling {
	public static void main(String[] args) {
		String url = "https://coinmarketcap.com/currencies/bitcoin/historical-data/?start=20180613&end=20190613";
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
		} catch (Exception e) {
		}
		
		
		Elements headElements = doc.select (".table-responsive .table thead tr");
		
		
		
		Elements bodyElements = doc.select (".table-responsive .table tbody tr");
		

	}

}
