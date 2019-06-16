package java_20190605;

import java.text.DecimalFormat;

// java.lang ��Ű���� java�� �����ϴ� �⺻��. import �ʿ� ����. 

public class MathDemo {
	public static void main (String[] args){

		double ceil = Math.ceil(4.5);
		System.out.println(ceil);
		
		double d2 = Math.floor(7.4);
		System.out.println(d2);
		
		long r1 = Math.round(42.4); // �Ҽ��� ���� �ݿø� (�Ű����� -> ��ȯ�� �Ӽ� ��Ī�� API ����)
		// int r1 = Math.round(42.4f); -- �Ű����� float => ��ȯ�� int (API ��Ģ ����)
		System.out.println(r1);
		
		long r11 = Math.round(42.45);
		System.out.println("**"+r11);
		
		double abs1 = Math.abs(-19.2);
		System.out.println(abs1);
		
		double d5 = Math.max(4.5,  6.7);
		System.out.println(d5);
		
		double d6 = Math.min(34.67, 56.24);
		System.out.println(d6);
		
		// ������
		double d7 = Math.sqrt(4);
		System.out.println(d7);
			
		// ������
		double d8 = Math.pow(2,  3);
		System.out.println(d8);
		
		// 0<= OO < 1 ��, ������ double �� ����
		double d9 = Math.random();
		System.out.println(Math.floor(d9*10));
		
		// + ) �Ҽ��� ��° �ڸ����� ���� ��� (��, DecimalFormat�� ����� �޼ҵ� �ƴ�. ���÷��̿�)
		DecimalFormat cf = new DecimalFormat("##,###.##");
		String str = cf.format(23456.84546);
		System.out.println(str);
	
	}
}
