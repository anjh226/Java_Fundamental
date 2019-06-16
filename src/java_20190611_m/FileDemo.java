package java_20190611_m;

import java.io.File;
import java.util.Calendar;

public class FileDemo {
	public static void main(String[] args) {
/*		FileDemo f = new FileDemo();
		
		File f1 = new File("c:\\down", "파일명");
		long filesize = 
	}
	*/
	
	File f5 = new File ("C:\\down\\jre-8u211-windows-x64.exe");
	long lastModified = f5.lastModified();
	Calendar c = Calendar.getInstance();
	// c.set(2019,  5, 19); // --> 일자 미설정시 시스템상 일자를
	c.setTimeInMillis(lastModified); // --> 밀리세턴드 값을 => 날짜로 반환
	
	int year = c.get(Calendar.YEAR);
	int month = c.get(Calendar.MONTH)+1;
	int day = c.get(Calendar.DATE);	
	// System.out.println(year, month, day); --> , (X) + (O)
	System.out.println(year +"-"+ month +"-"+ day);
	
	int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
	switch (dayOfWeek){
	case Calendar.MONDAY : System.out.println("월요일 입니다."); break;
	case Calendar.TUESDAY : System.out.println("화요일 입니다."); break;
	case Calendar.WEDNESDAY : System.out.println("수요일 입니다."); break;
	case Calendar.THURSDAY : System.out.println("목요일 입니다."); break;
	case Calendar.FRIDAY : System.out.println("금요일 입니다."); break;
	case Calendar.SATURDAY : System.out.println("토요일 입니다."); break;
	case Calendar.SUNDAY : System.out.println("일요일 입니다."); break;
	}

	
	
	
	}
}


	/*public boolean mkdir(path) {
		boolean isExisted = false;
		File f1 = new File(path);
		
		if (! isExisted) {
			boolean isSuccess = f1.mkdirs(); // (참고) .mkdir()는 최종 디렉토리만 생성함.
			System.out.println("디렉토리 만들기 성공");
		}
	}
*/
/*	public static void main (String[] args) {
		FileDemo f = new FileDemo();
		File f1 = new File ("C:\\down", "Git-2.21.0-64-bit.exe");
		long fileSize = f1.length(); // 파일 사이즈
		
		System.out.println(fileSize);
		System.out.printf("%,d KB" , Math.round((double)fileSize/(double)1024));
	
		System.out.println();
	
	}
	public String getComma(int number){
		return String.format("%,d", number);
	}
	public String getComma(double number, int precision){
		return String.format("%,."+ precision+"f",number);
	}
	public String getComma(double number){
		return String.format("%,f",number);
	}
	
	
}	*/
	
/*	// (참고) 메소드로 만들기
	public void mkdir (String path){
		File f1 = new File(path);
		boolean isExisted = f1.isDirectory();
		if (! isExisted) {
			boolean isSuccess = f1.mkdirs();
			System.out.println("디렉토리 만들기 성공");
		}
		System.out.println("디렉토리가 이미 존재 합니다.");
	}*/
	
	


