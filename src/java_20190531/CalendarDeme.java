package java_20190531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalendarDeme {
	// Ű����� �Է¹��� �� ���� ��ȯ�ϴ� �Լ�
	public static String console() throws IOException{ // ����1 ��ȣ �� 
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in)); // ����2 new ����
		return br.readLine();
	}

	public static void main (String[] args) throws IOException{
		Calendar c = null;
				
		while(true){
			System.out.print("��¥�� �Է��ϼ���>");
			String readLine = console();
			if(readLine.equals("bye")) break;
			
			// split(" ") �Լ��� ���鹮�ڷ� ���ڿ��� �и��ؼ� �迭�� ��ȯ
			String[] data = readLine.split(" ");
			
			c = new Calendar(); 
			
			if (data.length == 1){
				int year = Integer.parseInt(data[0]);
				c.print(year, year);
				
			}else if (data.length == 2){
				int year = Integer.parseInt(data[0]);
				int month = Integer.parseInt(data[1]);
				c.print(year, month);
				
			}else if (data.length == 3){
				int year = Integer.parseInt(data[0]);
				int month = Integer.parseInt(data[1]);
				int day = Integer.parseInt(data[2]);
				c.print(year, month, day);
			} // �� ��� �ܿ� �Է½� �׳� ������. else ����
		}
	
	
		
	}	
}
