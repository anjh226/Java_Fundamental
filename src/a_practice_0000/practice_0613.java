package a_practice_0000;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class practice_0613 {
	public static void main(String[] args) {
		
	// # ���̹� ������
		String url = "https://sports.news.naver.com/kfootball/index.nhn";
		
		// ��ü HTML ������ �����ϱ� ���� ��ü
		Document doc = null;
		
		try {
			// url �ּҿ� get ������� ���� (�ش� URL �������� Elements ��� �ܾ��)
			doc = Jsoup.connect(url).get(); 
		} catch (IOException e) {
		}
		
		Elements ele = doc.select(".home_news");
		
		// ���� Ÿ��Ʋ '�ֿ䴺��' �̾Ƴֱ�
		String title = ele.select("h2").text().substring(0, 4);
		System.out.println(title);
		
		// ������ ���� �̱�
		for (Element temp : ele.select("li")) { 
			System.out.println(temp.text()); 
			// ��ü������.text() :: �ش� ��ü(Element ��ü)���� text �κи� �����϶�
		}
			
			
}
		
			
}
