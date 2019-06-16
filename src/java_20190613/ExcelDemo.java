package java_20190613;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelDemo {
	public static void main(String[] args) {

	
	HSSFWorkbook workbook = new HSSFWorkbook(); // �� ���� ����
	HSSFSheet sheet = workbook.createSheet("sheet_bitcoin"); // �� ��Ʈ(Sheet) ����
	
	HSSFRow row = sheet.createRow(0); // ������ ���� 0������ ����
	HSSFCell cell = row.createCell(0); // ���� ���� 0������ ����
	cell.setCellValue("�׽�Ʈ 1"); //������ ���� ������ ����
	
	cell = row.createCell(1);
	cell.setCellValue("�׽�Ʈ 2");
	
	HSSFRow row2 = sheet.createRow(1);
	cell = row2.createCell(0); 
	cell.setCellValue("�׽�Ʈ 11"); 
	
	cell = row2.createCell(1);
	cell.setCellValue("�׽�Ʈ 22");
	
   try {
         FileOutputStream fileoutputstream = new FileOutputStream("C:\\down\\bitcoin2.xls");
         workbook.write(fileoutputstream);
         fileoutputstream.close();
         System.out.println("�������� ���� ����");
     } catch (IOException e) {
         e.printStackTrace();
         System.out.println("�������� ���� ����");
     }
}	
}

// boxfox/tistory/304