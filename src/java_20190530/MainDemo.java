package java_20190530;

public class MainDemo {
	
	public static void main(String[] args) {
		// 1. Customer c 에서 Customer는 Reference Type, c는 Reference
		// 2. new Customer() 는 Object 
/*		Customer c = new Customer(); // ? 변수 c가 customer 클래스를 참조하게 하라

		c.name = "성영한"; 
		c.cphone = "010-3024-1703";
		
		Customer.interestRate = 4.3; // static 변수는 전역변수임을 구분히 인식하기 위해 레퍼런스명(c.---) 접근 보다 클래스명(Customer.--) 접근으로 작성 권장.

		// Customer.BANKNAME = "우리은행"; --> final 변수이므로("국민은행"으로 고정) 바꿀 수 없음.
		
		c.register(); 
		
		// 두 번째 오브젝트 생성
		Customer c2 = new Customer();
		c2.name = "Steve Jobs";
		c2.cphone = "010-000-0001";
		Customer.interestRate = 4.5; // interestRate는 static 변수 4.3 ->  4.5로 수정 됨. 이로써 이하부터는 call되는 값은 4.5가 됨.
		
		c2.register();
		
		// c3 Reference 를 c2 Reference가 가리키는 Object를 참조하라는 의미
		Customer c3 = c2;
		c3.name = "손정의";
		c3.cphone = "070-1111-2222"; // 이로써, c2가 참조하는 object가 변경됨 (c2, c3가 같은 객체를 참조하게 되었으므로)
		
		c3.register(); // -> 손정의
		c2.register(); // -> 손정의
*/		
		
		Member m = new Member(); // 변수 m 이 Member 클래스(Member.java 파일에서 정의된)를 참조하게 하라. 
		m.setName("sung");
		m.setAddress("서울시..."); // set 인스턴스 변수 만듦
		
		System.out.println(m.getName());
		System.out.println(m.getAddress()); // get 변수 가져옴
		
				
		
	}
	
}
