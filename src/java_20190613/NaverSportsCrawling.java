package java_20190613;

import org.jsoup.Jsoup;
// 컨트롤 + 쉬프트 + O
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverSportsCrawling {
	public static void main(String[] args) {
/*		String url = "https://sports.news.naver.com/kfootball/index.nhn";
	
		// 전체 HTML 문서를 관리하기 위한 객체
		Document doc = null;
		
		try {
			// url 주소에 get 방식으로 접근 (url 페이지의 값을 모두 읽어와 doc에 넣음)
			doc = Jsoup.connect(url).get(); 
		} catch (Exception e) {
			// TODO: handle exception
		}
		Elements elements = doc.select(".home_news"); // class는 . 으로 접근 -- Elements: 가져올 블럭 전체를 객체화 함. // 클래스 이르 중복이 없기 때문에 home_news 만으로도 찾아갈 수 있음
	
		String title = elements.select("h2").text().substring(0, 4);
		System.out.println(title);
		
		for(Element temp : elements.select("li")){
			System.out.println(temp.text());
		}http://news.jtbc.joins.com/
*/
		
	   // 
		// http://www.imbc.com/
		
		String url = "http://www.imbc.com/";
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
		} catch (Exception e) {
			// TODO: handle exception
		}
		Elements elements = doc.select(".con-wrap.notice-wrap");
	
		String title = elements.select(".cont-tit").text();
		System.out.println(title); // ★★★		
		
		Elements liEle = elements.select("li");
		for(int i =0; i<liEle.size(); i++){
			Element temp = liEle.get(i);
			System.out.println(temp.text());
		}
		
		for(Element temp : elements.select("li")) {    // ★
			System.out.println(temp.text());
		}

		
		
		
	}

	
}

// 클래스 이름으로 해당 엘리먼트를 찾아갈 수 있음 