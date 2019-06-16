package java_20190531;

public class StaticMethod {
	static String name;
	int age;
	
	public void m1(){ // instance 메소드
		name = "국민은행";
		age = 10;
		m2();
		m4(); // 모두 사용/호출 가능
	}
	public void m2(){
		System.out.println("instance method m2()");
	}
		
	public static void m3(){ // static 메소드
		name = "국민은행";
		age = 10; // instance 변수 접근 불가
		m2(); // instance 메소드 호출 불가
		m4();
	}
	public static void m4(){
		System.out.println("instance method m4()");
	}
	
	// 인스턴스 메소드, 변수를 호출하기 위해 객체를 생성해 왔던 것. 
	public static void main(String[] args){
		StaticMethod.m4(); // static 변수는 클래스 이름. 을 붙여서 호출 해야 함. 
		m2();
		
		name = "이름";
		age = "1000";
		

		
		
	}
		
}
