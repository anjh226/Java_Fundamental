package java_20190531;

public class Overloading {
	public void print (int i) {
		System.out.println(i);
	}

	public void print (String s){
		System.out.println(s);
	}	
		
	public void print (double d){
		System.out.println(d);
		System.out.
	}
	
	// 나쁜 예
	public void printInt (int i) {  // 목적어를 메소드로 설정 (메소드는 동사 + 목적어는 매개변수로 쓸 수 있ㄷ록 메소드를 정의 할 것)
		System.out.println(i);
	}
	
	
	
	
}
