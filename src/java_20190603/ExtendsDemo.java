package java_20190603;
 
public class ExtendsDemo {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.name = "성영한";
		c.cphone = "010-0000-0000";
		System.out.println("이름: "+c.name );
		System.out.println("핸드폰: "+c.cphone );
		c.actionCustomer();
		
		Alba a = new Alba();
		a.name = "알바생"; // 부모에게 상속 받은 멤버변수
		a.cphone = "999-9999-9999"; // 부모에게 상속 받은 멤버변수
		a.address = "서울";
		System.out.println("이름: "+a.name );
		System.out.println("핸드폰: "+a.cphone );
		System.out.println("주소: "+a.address );
		a.actionCustomer();
		a.actionAlba();
		
		Manager m = new Manager();
		m.name = "매니저";
		m.cphone = "777-7777-7777";
		m.address = "경기도";
		m.id = "syh0110";
		m.password = "1231234";		
		System.out.println("이름: "+m.name );
		System.out.println("핸드폰: "+m.cphone );
		System.out.println("주소: "+m.address );
		System.out.println("아이디: "+m.id );
		System.out.println("비밀번호: "+m.password );
		m.actionCustomer();
		m.actionAlba();
		m.actionManager();
		
		// Super 타입(Alba)으로 서브 객체(Manager)를 생성할 수 있다.
		// 멤버변수는 Super 타입(Alba)을 포함한 상위 클래스(Customer) 접근 가능.
		Alba alba = /*(Alba) 생략 된 것. 오토캐스팅*/ new Manager(); // 부모 타입으로 sub의 객체를 생성할 수 있다. (sub 객체 생성시 오토 캐스팅이 된 것)
		alba.name = "매니저";
		alba.cphone = "777-7777-7777";
		alba.address = "경기도";
		// alba.id = "syh0110";
		// alba.password = "1231234";		
		System.out.println("이름: "+alba.name );
		System.out.println("핸드폰: "+alba.cphone );
		System.out.println("주소: "+alba.address );
		
	}
}
