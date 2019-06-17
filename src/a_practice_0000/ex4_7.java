package a_practice_0000;

import java.util.*;

public class ex4_7 {
	public static void main (String[] args){
	 
		System.out.print("가위(1) 바위(2) 보(2) 중 하나를 입력하세요 >");
		
		Scanner s = new Scanner (System.in);
		int user = s.nextInt();
		int com = (int) ((Math.random()*3) +1);
		
		if (user<4){
			System.out.println("당신 : "+user);
		} else System.out.println("당신 : " + "잘못 입력하였습니다.");
		System.out.println("컴퓨터 : "+com);
		
		int result = user - com;
				
		if (result == 2 || result == -1 ) {
			System.out.println("당신이 승리했습니다");
		} 
		if (result == 1 || result == -2 ) {
			System.out.println("당신이 승리했습니다");
		}
		
		// 작성중
		
	}
}