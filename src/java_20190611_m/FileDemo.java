package java_20190611_m;

import java.io.File;
import java.util.Calendar;

public class FileDemo {
	public static void main(String[] args) {
/*		FileDemo f = new FileDemo();
		
		File f1 = new File("c:\\down", "���ϸ�");
		long filesize = 
	}
	*/
	
	File f5 = new File ("C:\\down\\jre-8u211-windows-x64.exe");
	long lastModified = f5.lastModified();
	Calendar c = Calendar.getInstance();
	// c.set(2019,  5, 19); // --> ���� �̼����� �ý��ۻ� ���ڸ�
	c.setTimeInMillis(lastModified); // --> �и����ϵ� ���� => ��¥�� ��ȯ
	
	int year = c.get(Calendar.YEAR);
	int month = c.get(Calendar.MONTH)+1;
	int day = c.get(Calendar.DATE);	
	// System.out.println(year, month, day); --> , (X) + (O)
	System.out.println(year +"-"+ month +"-"+ day);
	
	int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
	switch (dayOfWeek){
	case Calendar.MONDAY : System.out.println("������ �Դϴ�."); break;
	case Calendar.TUESDAY : System.out.println("ȭ���� �Դϴ�."); break;
	case Calendar.WEDNESDAY : System.out.println("������ �Դϴ�."); break;
	case Calendar.THURSDAY : System.out.println("����� �Դϴ�."); break;
	case Calendar.FRIDAY : System.out.println("�ݿ��� �Դϴ�."); break;
	case Calendar.SATURDAY : System.out.println("����� �Դϴ�."); break;
	case Calendar.SUNDAY : System.out.println("�Ͽ��� �Դϴ�."); break;
	}

	
	
	
	}
}


	/*public boolean mkdir(path) {
		boolean isExisted = false;
		File f1 = new File(path);
		
		if (! isExisted) {
			boolean isSuccess = f1.mkdirs(); // (����) .mkdir()�� ���� ���丮�� ������.
			System.out.println("���丮 ����� ����");
		}
	}
*/
/*	public static void main (String[] args) {
		FileDemo f = new FileDemo();
		File f1 = new File ("C:\\down", "Git-2.21.0-64-bit.exe");
		long fileSize = f1.length(); // ���� ������
		
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
	
/*	// (����) �޼ҵ�� �����
	public void mkdir (String path){
		File f1 = new File(path);
		boolean isExisted = f1.isDirectory();
		if (! isExisted) {
			boolean isSuccess = f1.mkdirs();
			System.out.println("���丮 ����� ����");
		}
		System.out.println("���丮�� �̹� ���� �մϴ�.");
	}*/
	
	


