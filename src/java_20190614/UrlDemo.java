// !!!
package java_20190614;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;


public class UrlDemo {
	public static void main(String[] args) 
			throws Exception {
		
		URL url = new URL("https://sports.news.naver.com/kbo/news/read.nhn?oid=117&aid=0003230791");
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort();
		String path  = url.getPath();
		String query = url.getQuery();
		String ref  = url.getRef();
		
		System.out.println("protocol: " + protocol);
		System.out.println("host: " + host);
		System.out.println("port: " + port); // port가 Url에 없으면 -1 이 출력
		System.out.println("path: " + path);
		System.out.println("query: " + query);
		System.out.println("ref: " + ref);
		
		// url page 출력하기 
		InputStream in = url.openStream();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(in,"utf-8"));
		
		String readLine = null;
		while ((readLine = br.readLine()) != null){
			System.out.print(readLine);
		}
			

	}

}
