package java_20190613;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelDemo {
	public static void main(String[] args) {

	
	HSSFWorkbook workbook = new HSSFWorkbook(); // 새 엑셀 생성
	HSSFSheet sheet = workbook.createSheet("sheet_bitcoin"); // 새 시트(Sheet) 생성
	
	HSSFRow row = sheet.createRow(0); // 엑셀의 행은 0번부터 시작
	HSSFCell cell = row.createCell(0); // 행의 셀은 0번부터 시작
	cell.setCellValue("테스트 1"); //생성한 셀에 데이터 삽입
	
	cell = row.createCell(1);
	cell.setCellValue("테스트 2");
	
	HSSFRow row2 = sheet.createRow(1);
	cell = row2.createCell(0); 
	cell.setCellValue("테스트 11"); 
	
	cell = row2.createCell(1);
	cell.setCellValue("테스트 22");
	
   try {
         FileOutputStream fileoutputstream = new FileOutputStream("C:\\down\\bitcoin2.xls");
         workbook.write(fileoutputstream);
         fileoutputstream.close();
         System.out.println("엑셀파일 생성 성공");
     } catch (IOException e) {
         e.printStackTrace();
         System.out.println("엑셀파일 생성 실패");
     }
}	
}

// boxfox/tistory/304