package java_20190605;

public class WrapperDemo {
	public static void main (String[] args){
		int a = 10;
		int b = 20; 
		String s1 = "42.5";
		String s2 = "90.5";
		
		String s99 = 10+"" ; // 꼼수
		String a100 = String.valueOf(10);
		
		
		// primitive 데이터 타입을 랩퍼클래스로 변환 int => Integer
		Integer a1 = new Integer(a);
		Integer a2 = b; // 이게 가능한 이유는 jdk1.5 = 5.0 버전부터 자동으로 boxing 된 덕분.
		
		// Wrapper Class 를 primitive data type(int)으로 변환 
		int a3 = a1.intValue() + a2/*.intValue()*/; // 5.0 부터 .intValue() 안 써도 자동 박싱. 없어도 생략되어 있는 것.
		
		// String 문자열에 있는 숫자를 더해야 할 때 --> 문자열에 있는 숫자를 primitive type으로 변경 한 후 더해
		// String을 primitive data type (double)으로 변환
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		
		double d3 = d1 + d2;
		
		// boxing, unboxing 정리
		// boxing : primitive data type => wrapper class로 자동 변환
		Integer a99 = 100; // jdk1.5 = 5.0 버전부터  primitive data ~ Wrapper Class 간 형변환 자동으로 해 줌 (boxing, unboxing)

		// unboxing : wrapper class => primitive data type 으로 자동 변환
		int a4 = a1 + a2;
		
		// 하여, 5.0 부터는 오토박싱이 되므로, Integer.parseInt로 변경하는 방법만 외우면 OK
		// ___.parse___ : 문자열을 숫자열(primitive data)로 변환 (-- 주로, String(문자열)을 int, double로 변경함.)
		
		
	}

}
