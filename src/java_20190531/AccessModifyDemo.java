package java_20190531;

import java_20190531.tt.Cat;

public class AccessModifyDemo extends Cat { // extends Cat : Cat을 부모로 설정하여 상속 받음. 단 protected 만.(private, 디폴트는 안 됨. public은 원래 오픈된 것이니 당연히 사용 가능)  
	public static void main(String[] args) {
		
		Car c = new Car();
		
		// private : 에러 뜨는 이유는 modelNumber를 private로 은폐시켰기 때문에, 다른 class 에서는 접근 안 됨.
		// c.modelNumber = "68오4472" 
				
		// default : 같은 패키지 내에서 접근 가능 
	    c.color = "red";
		
		// protected : 서로 다른 패키지에서 상속받은 경우 접근 가능
		c.doorCount = 5;
		
		// pubilc : 서로 다른 패키지에서 접근 가능
		c.price = 10_000_000; // , 대신 _ 사용 가능
		
		System.out.println(c.color);
		
		
		// 다른 패키지의 객체를 참조해 오기 연습
		Cat cat = new Cat();
		cat.nickName = "tomcat";		
		
		// 에러 : 다른 패키지에 있기 때문 -> 해결 : 해당 java 파일을 import 해주어야 함.
		// 단축키 : 컨트롤 + 쉬프트 + O --> 상단에 자동 생성
		
		AccessModifyDemo a = new AccessModifyDemo();
		// Cat 클래스를 상속 받았기 때문에, protected 도 접근 가능해짐. (단, 주로 public, private 를 씀)
		a.age = 10; // protected
		a.nickName = "먼지"; // public
		
		
		
		
		

	}
}
