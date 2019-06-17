package java_20190614;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CoinCrawling {
	
	
	
	// OOO -> �ѱ��� ��¥ �������� ����
	private String getKoreanDate(String Date){
		String KoreanDate = null;
		SimpleDateFormet from = new SimpleDateFormet("MMM dd, yyyy", Locale.US); // M => 2 MM => 02 MMM => ����ǥ��
		SimpleDateFormat to = new SimpleDateFormet("yyyy�� MM�� DD��", Locale.KOREAN);
		
		try {
			Date d = from.parse(date); // java.utll.Date() --> ���̺귯�� import ��� OO.��Ű����.OO �� ����
			KoreanDate = to.formet(d);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return koreanDate();
		
	}
	
	public void excute(String SheetName,String coinName, String startDate, String endDate) {
		HSSFWorkbook workbook = new HSSFWorkbook(); // �� ���� ����
        HSSFSheet sheet = workbook.createSheet(SheetName); // �� ��Ʈ(Sheet) ����
        HSSFRow row = null;
        HSSFCell cell = null;
        
        String url = "https://coinmarketcap.com/currencies/"+coinName+"/historical-data/?start="+startDate+"&end="+endDate;
		Document doc = null;

		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//headElements�� Ÿ��Ʋ ���� �������� ���� Elements
		Elements headElements = doc.select(
				".table-responsive .table thead tr");
		//bodyElements�� �ǵ����� ������ �������� ���� Elements
		Elements bodyElements = doc.select(
				".table-responsive .table tbody tr");
		int rowIndex = 0;
		for (int i = 0; i < headElements.size(); i++) {
		
			row = sheet.createRow(rowIndex++); // ������ ���� 0������ ����
			Element e = (Element) headElements.get(i);//<tr>
			String date = e.child(0).text();//e.child(0) => <th>
			cell = row.createCell(0); // ���� ���� 0������ ����
		    cell.setCellValue(getKoreanDate(date)); //������ ���� ������ ����
		    
		    // simple date ����
			
			String open = e.child(1).text();
			cell = row.createCell(1); // ���� ���� 0������ ����
		    cell.setCellValue(Double.parseDouble(open)); //������ ���� ������ ����
			
			
			String high = e.child(2).text();
			cell = row.createCell(2); // ���� ���� 0������ ����
		    cell.setCellValue(Double.parseDouble(high)); //������ ���� ������ ����
			
			
			String low = e.child(3).text();
			cell = row.createCell(3); // ���� ���� 0������ ����
		    cell.setCellValue(Double.parseDouble(low)); //������ ���� ������ ����
			
			String close = e.child(4).text();
			cell = row.createCell(4); // ���� ���� 0������ ����
		    cell.setCellValue(Double.parseDouble(close)); //������ ���� ������ ����
			
			
			String volume = e.child(5).text();
			volum = volum.replaceAll(",", "");//�޸� ���� replaceAll() Ȱ��
			cell = row.createCell(5); // ���� ���� 0������ ����
		    cell.setCellValue(Long.parseLong(volume)); //������ ���� ������ ����
			
			
			String marketCap = e.child(6).text();
			marketCap = marketCap.replaceAll(",", "");
			cell = row.createCell(6); // ���� ���� 0������ ����
		    cell.setCellValue(Long.parseLong(marketCap)); //������ ���� ������ ����
			
			
			System.out.printf("%s\t\t%s\t%s\t%s\t%s\t%s\t%s%n", 
				date, open, high, low, close, volume, marketCap);

		}
		
		for (int i = 0; i < bodyElements.size(); i++) {
			row = sheet.createRow(rowIndex++); // ������ ���� 0������ ����
			Element e = (Element) bodyElements.get(i);//<tr>
			String date = e.child(0).text();//e.child(0) => <th>
			cell = row.createCell(0); // ���� ���� 0������ ����
		    cell.setCellValue(date); //������ ���� ������ ����
			
			String open = e.child(1).text();
			cell = row.createCell(1); // ���� ���� 0������ ����
		    cell.setCellValue(open); //������ ���� ������ ����
			
			
			String high = e.child(2).text();
			cell = row.createCell(2); // ���� ���� 0������ ����
		    cell.setCellValue(high); //������ ���� ������ ����
			
			
			String low = e.child(3).text();
			cell = row.createCell(3); // ���� ���� 0������ ����
		    cell.setCellValue(low); //������ ���� ������ ����
			
			String close = e.child(4).text();
			cell = row.createCell(4); // ���� ���� 0������ ����
		    cell.setCellValue(close); //������ ���� ������ ����
			
			
			String volume = e.child(5).text();
			cell = row.createCell(5); // ���� ���� 0������ ����
		    cell.setCellValue(volume); //������ ���� ������ ����
			
			
			String marketCap = e.child(6).text();
			cell = row.createCell(6); // ���� ���� 0������ ����
		    cell.setCellValue(marketCap); //������ ���� ������ ����
			
			
			System.out.printf("%s\t\t%s\t%s\t%s\t%s\t%s\t%s%n", 
				date, open, high, low, close, volume, marketCap);

		}
		
		
		try {
            FileOutputStream fileoutputstream = new FileOutputStream(
            		"c:\\down\\"+coinName+".xls");
            workbook.write(fileoutputstream);
            fileoutputstream.close();
            System.out.println("�������ϻ�������");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("�������ϻ�������");
        }
		
	}
	
	public static void main (String[] args){
		CoinCrwaling_Upgrade c = new CoinCrwaling_Upgrade();
		c.excute("��Ʈ����", "bitcoin", "20190610", "20190618");
		c.excute("�̴�����", "", "20180613", "20190618");
		c.excute("����", "bitcoin", "20180613", "20190618");
		
		
	}
	
}




