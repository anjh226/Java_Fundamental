package java_20190614;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnection {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://sports.news.naver.com/kfootball/index.nhn");
		URLConnection urlCon = url.openConnection();
		
		String server = urlCon.getHeaderField("Server");
		String casheControl = urlCon.getHeaderField("Chche-Control");
		String expirse = urlCon.getHeaderField("Expires");
		String contentType = urlCon.getHeaderField("ContentType");
		String location = urlCon.getHeaderField("Location");
		String connection = urlCon.getHeaderField("Connection");
		String setCookie = urlCon.getHeaderField("Set-Cookie");
		int len = urlCon.getContentLength();
		
		System.out.println("server : "+ server);
		System.out.println("Chche-Control : "+ casheControl);
		System.out.println("Expirse : "+ expirse);
		System.out.println("ContentType : "+ contentType);
		System.out.println("Location : "+ location);
		System.out.println("Connection : "+ connection);
		System.out.println("Set-Cookie : "+ setCookie);
		System.out.println("len : "+ len);
		
		InputStream in = urlCon.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(in,"utf-8"));
		String readLine = null;
		while ((readLine = br.readLine()) != null){
			System.out.println(readLine);
		}
		
		
		
	}
}
