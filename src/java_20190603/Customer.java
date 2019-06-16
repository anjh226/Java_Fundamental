package java_20190603;
 
/* import java.lang.*; // (2) 이 구문도 최상위 부모 클래스 내에 자동 생략되어 있음 "java.lang 패키지"에 String 등등 포함되어 있음 */
public class Customer /* extends Object */ {
	String name;
	String cphone;
	
	// (1) 최상위 부모 클래스의 부모는 Object
	// extends Object 가 생략되어 있는 것.
	
	public void actionCustomer(){
		System.out.println("Customer actionCustomer()");		
	}
}
