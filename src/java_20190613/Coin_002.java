package java_20190613;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Coin_002 {
	public static void main(String[] args) {
		
	String url = "https://coinmarketcap.com/currencies/bitcoin/historical-data/?start=201806012&end=20190613";
	Document doc = null;
	
	try {
		doc = Jsoup.connect(url).get();
	} catch (IOException e) {
		// TODO: handle exception
	}
	
	Elements elements = doc.select(".table-responsive");
	
	String title = elements.select("table").text();
	System.out.println(title);
	
	Elements liEle = elements.select("tr");
	for(int i=0;i<liEle.size();i++){
		Element temp = liEle.get(i);
		System.out.print(temp.text());
	}
	
	}
}


