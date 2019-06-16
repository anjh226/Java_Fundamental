package java_20190605;

import java.text.DecimalFormat;

// java.lang 패키지는 java가 제공하는 기본셋. import 필요 없음. 

public class MathDemo {
	public static void main (String[] args){

		double ceil = Math.ceil(4.5);
		System.out.println(ceil);
		
		double d2 = Math.floor(7.4);
		System.out.println(d2);
		
		long r1 = Math.round(42.4); // 소수점 이하 반올림 (매개변수 -> 반환값 속성 매칭은 API 참고)
		// int r1 = Math.round(42.4f); -- 매개변수 float => 반환은 int (API 규칙 참고)
		System.out.println(r1);
		
		long r11 = Math.round(42.45);
		System.out.println("**"+r11);
		
		double abs1 = Math.abs(-19.2);
		System.out.println(abs1);
		
		double d5 = Math.max(4.5,  6.7);
		System.out.println(d5);
		
		double d6 = Math.min(34.67, 56.24);
		System.out.println(d6);
		
		// 제곱근
		double d7 = Math.sqrt(4);
		System.out.println(d7);
			
		// 지수승
		double d8 = Math.pow(2,  3);
		System.out.println(d8);
		
		// 0<= OO < 1 중, 임의의 double 값 리턴
		double d9 = Math.random();
		System.out.println(Math.floor(d9*10));
		
		// + ) 소수점 몇째 자리까지 지정 출력 (단, DecimalFormat은 연산용 메소드 아님. 디스플레이용)
		DecimalFormat cf = new DecimalFormat("##,###.##");
		String str = cf.format(23456.84546);
		System.out.println(str);
	
	}
}
