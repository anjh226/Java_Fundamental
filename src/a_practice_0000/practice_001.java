package a_practice_0000;

import java.util.*;

public class practice_001 {
	public static void main(String[] args){
/*		Scanner s = new Scanner (System.in);
		char ch = ' ';
		System.out.print("���ڸ� �Է��ϼ���.>");
		String input = s.nextLine();
		ch = input.charAt(0);
		
		if ('0'<= ch && ch >= '9') {
			System.out.println("�Է��Ͻ� ���ڴ� ���� �Դϴ�.");	
		}
		 else if ('a'<= ch && ch >= 'z') {
			System.out.println("�Է��Ͻ� ���ڴ� �ҹ��� �Դϴ�.");
		} 
		else  
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
*/
/*			
		int score = 59;
		if (score > 60){
			System.out.println("�հ��ϼ̽��ϴ�.");
		} else 
			System.out.println("���հ� �ϼ̽��ϴ�.("+score+"������ ����)");
*/	
		int month = 11;
		
		switch (month){
		case 2 :
		case 3 :
		case 4 :
			System.out.println("�� �Դϴ�.");
			break;
		case 5 :
		case 6 :
		case 7 :
			System.out.println("���� �Դϴ�.");
			break;
		case 8 :
		case 9 :
		case 10 :
			System.out.println("���� �Դϴ�.");
			break;
		case 11 :
		case 12 :
		case 1 :
			System.out.println("�ܿ� �Դϴ�.");
			break;
		default :  
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	
	
		
	}
}



class practice001_2 {
	public static void main(String[] args) {
		// ?? �� �� ��° Ŭ���� ���� ������ ����� �� �ɱ�??
		
		int a = 10;
		int b = 20;
		System.out.print("a :"+a + "\t b :"+b);
		
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("\na :"+a + "\t b :"+b);

		char i = 'A';
		System.out.println (i);
		
		char j = '5';
		System.out.print (j);
		
	}
}



