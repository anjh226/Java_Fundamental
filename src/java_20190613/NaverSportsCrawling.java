package java_20190613;

import org.jsoup.Jsoup;
// ��Ʈ�� + ����Ʈ + O
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverSportsCrawling {
	public static void main(String[] args) {
/*		String url = "https://sports.news.naver.com/kfootball/index.nhn";
	
		// ��ü HTML ������ �����ϱ� ���� ��ü
		Document doc = null;
		
		try {
			// url �ּҿ� get ������� ���� (url �������� ���� ��� �о�� doc�� ����)
			doc = Jsoup.connect(url).get(); 
		} catch (Exception e) {
			// TODO: handle exception
		}
		Elements elements = doc.select(".home_news"); // class�� . ���� ���� -- Elements: ������ �� ��ü�� ��üȭ ��. // Ŭ���� �̸� �ߺ��� ���� ������ home_news �����ε� ã�ư� �� ����
	
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
		System.out.println(title); // �ڡڡ�		
		
		Elements liEle = elements.select("li");
		for(int i =0; i<liEle.size(); i++){
			Element temp = liEle.get(i);
			System.out.println(temp.text());
		}
		
		for(Element temp : elements.select("li")) {    // ��
			System.out.println(temp.text());
		}

		
		
		
	}

	
}

// Ŭ���� �̸����� �ش� ������Ʈ�� ã�ư� �� ���� 