package java_20190613;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CoinMarketDemo {
	public static void main(String[] args) {
		
	
	// bitcoin -> write 파일 (파일명: bitcoin.엑셀 로 저장 -> POI Library )
		
	// 1) 크롤링
	String url = "https://coinmarketcap.com/currencies/bitcoin/historical-data/?start=20180613&end=20190613";
	Document doc = null;
	try {
		doc = Jsoup.connect(url).get();
	} catch (Exception e) {
		// TODO: handle exception
	}
		
	Elements elements = doc.select(".table-responsive");
	
	String table = elements.select("th").text();
	System.out.println(table);
	System.out.println();
	
    // String value = elements.select("td").text();
    // System.out.println(value);
    
	Elements value2 = elements.select("tr");
	
	
	
	for(int i=0;i<value2.size();i++){
		Element temp = value2.get(i);
		System.out.println(temp.text());
		
		HSSFRow row = sheet.createRow(i); // 엑셀의 행은 0번부터 시작
		HSSFCell cell = row.createCell(0); // 행의 셀은 0번부터 시작
		cell.setCellValue(temp.text()); //생성한 셀에 데이터 삽입
		
		
	}     
	
	HSSFWorkbook workbook = new HSSFWorkbook(); // 새 엑셀 생성
	HSSFSheet sheet = workbook.createSheet("sheet_bitcoin"); // 새 시트(Sheet) 생성
	
	HSSFRow row = sheet.createRow(0); // 엑셀의 행은 0번부터 시작
	HSSFCell cell = row.createCell(0); // 행의 셀은 0번부터 시작
	cell.setCellValue(temp.text()); //생성한 셀에 데이터 삽입
	
   try {
         FileOutputStream fileoutputstream = new FileOutputStream("C:\\down\\bitcoin2.xlsx");
         workbook.write(fileoutputstream);
         fileoutputstream.close();
         System.out.println("엑셀파일 생성 성공");
     } catch (IOException e) {
         e.printStackTrace();
         System.out.println("엑셀파일 생성 실패");
     }
 	
	
	

	}
}
