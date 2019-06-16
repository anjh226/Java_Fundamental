package java_20190605;

public class WrapperDemo {
	public static void main (String[] args){
		int a = 10;
		int b = 20; 
		String s1 = "42.5";
		String s2 = "90.5";
		
		String s99 = 10+"" ; // �ļ�
		String a100 = String.valueOf(10);
		
		
		// primitive ������ Ÿ���� ����Ŭ������ ��ȯ int => Integer
		Integer a1 = new Integer(a);
		Integer a2 = b; // �̰� ������ ������ jdk1.5 = 5.0 �������� �ڵ����� boxing �� ����.
		
		// Wrapper Class �� primitive data type(int)���� ��ȯ 
		int a3 = a1.intValue() + a2/*.intValue()*/; // 5.0 ���� .intValue() �� �ᵵ �ڵ� �ڽ�. ��� �����Ǿ� �ִ� ��.
		
		// String ���ڿ��� �ִ� ���ڸ� ���ؾ� �� �� --> ���ڿ��� �ִ� ���ڸ� primitive type���� ���� �� �� ����
		// String�� primitive data type (double)���� ��ȯ
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		
		double d3 = d1 + d2;
		
		// boxing, unboxing ����
		// boxing : primitive data type => wrapper class�� �ڵ� ��ȯ
		Integer a99 = 100; // jdk1.5 = 5.0 ��������  primitive data ~ Wrapper Class �� ����ȯ �ڵ����� �� �� (boxing, unboxing)

		// unboxing : wrapper class => primitive data type ���� �ڵ� ��ȯ
		int a4 = a1 + a2;
		
		// �Ͽ�, 5.0 ���ʹ� ����ڽ��� �ǹǷ�, Integer.parseInt�� �����ϴ� ����� �ܿ�� OK
		// ___.parse___ : ���ڿ��� ���ڿ�(primitive data)�� ��ȯ (-- �ַ�, String(���ڿ�)�� int, double�� ������.)
		
		
	}

}
