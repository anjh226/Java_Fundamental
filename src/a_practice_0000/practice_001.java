package a_practice_0000;

import java.util.*;

public class practice_001 {
	public static void main(String[] args){
/*		Scanner s = new Scanner (System.in);
		char ch = ' ';
		System.out.print("문자를 입력하세요.>");
		String input = s.nextLine();
		ch = input.charAt(0);
		
		if ('0'<= ch && ch >= '9') {
			System.out.println("입력하신 문자는 숫자 입니다.");	
		}
		 else if ('a'<= ch && ch >= 'z') {
			System.out.println("입력하신 문자는 소문자 입니다.");
		} 
		else  
			System.out.println("잘못 입력 하셨습니다.");
*/
/*			
		int score = 59;
		if (score > 60){
			System.out.println("합격하셨습니다.");
		} else 
			System.out.println("불합격 하셨습니다.("+score+"점으로 과락)");
*/	
		int month = 11;
		
		switch (month){
		case 2 :
		case 3 :
		case 4 :
			System.out.println("봄 입니다.");
			break;
		case 5 :
		case 6 :
		case 7 :
			System.out.println("여름 입니다.");
			break;
		case 8 :
		case 9 :
		case 10 :
			System.out.println("가을 입니다.");
			break;
		case 11 :
		case 12 :
		case 1 :
			System.out.println("겨울 입니다.");
			break;
		default :  
			System.out.println("잘못 입력하셨습니다.");
		}
	
	
		
	}
}



class practice001_2 {
	public static void main(String[] args) {
		// ?? 왜 두 번째 클래스 내의 문장은 출력이 안 될까??
		
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



