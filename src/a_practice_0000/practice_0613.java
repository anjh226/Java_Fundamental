package a_practice_0000;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class practice_0613 {
	public static void main(String[] args) {
		
	// # 네이버 스포츠
		String url = "https://sports.news.naver.com/kfootball/index.nhn";
		
		// 전체 HTML 문서를 관리하기 위한 객체
		Document doc = null;
		
		try {
			// url 주소에 get 방식으로 접근 (해당 URL 페이지의 Elements 모두 긁어옴)
			doc = Jsoup.connect(url).get(); 
		} catch (IOException e) {
		}
		
		Elements ele = doc.select(".home_news");
		
		// 영역 타이틀 '주요뉴스' 뽑아넣기
		String title = ele.select("h2").text().substring(0, 4);
		System.out.println(title);
		
		// 영역의 내용 뽑기
		for (Element temp : ele.select("li")) { 
			System.out.println(temp.text()); 
			// 객체변수명.text() :: 해당 객체(Element 객체)에서 text 부분만 추출하라
		}
			
			
}
		
			
}
