package a_practice_0000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lunch_001 {
	static int StoreCount = 4;
	
public static void main(String[] args) {
	int randomCoice =  (int)(Math.random()* StoreCount) + 1;
	
	if (randomCoice == 1){
		System.out.println("�溹��"+"/n"+"(7,000�� ����)");
	} else if (randomCoice == 2){
		System.out.println("��� �Ϲ���/n(6,500�� ����)");
	} else if (randomCoice == 3){
		System.out.println("��ȹ�/n(���� �Ǵ� ���� ����)");
	} else if (randomCoice == 4){
		System.out.println("�������/n(7,000�� ����)");
	} else {
		System.err.println("���� : �ٽ� ������ �ּ���.");		
	}
}
	
}
