package a_practice_0000;

import java.util.*;

public class ex4_7 {
	public static void main (String[] args){
	 
		System.out.print("����(1) ����(2) ��(2) �� �ϳ��� �Է��ϼ��� >");
		
		Scanner s = new Scanner (System.in);
		int user = s.nextInt();
		int com = (int) ((Math.random()*3) +1);
		
		if (user<4){
			System.out.println("��� : "+user);
		} else System.out.println("��� : " + "�߸� �Է��Ͽ����ϴ�.");
		System.out.println("��ǻ�� : "+com);
		
		int result = user - com;
				
		if (result == 2 || result == -1 ) {
			System.out.println("����� �¸��߽��ϴ�");
		} 
		if (result == 1 || result == -2 ) {
			System.out.println("����� �¸��߽��ϴ�");
		}
		
		// �ۼ���
		
	}
}