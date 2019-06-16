package java_20190531;

public class Constructor {
	private String name;
	private String email;
	private int age;
	
	// ★디폴트 생성자 (= 매개변수가 없는 생성자) : 클래스 내에 생성자가 없는 경우 compiler가 자동으로 생성해 준다. 
	// ★  													즉, 클래스 내에 생성자가 1개 라도 있는 경우는 compiler 생성해 주지 않는다. 
	// 생성자는 클래스와 이름과 같고, 반환값이 없는 형태를 가지고 있다.
	public Constructor(){
	}
	// 생성자 자동생성 여부에 따른 에러 -- 발생시 찾기 어려운 종류의 에러 (new를 했는데 에러가 난다면 디폴트 생성자 있는지 여부 확인해 볼 것)
	// 클래스를 만들면 생성자 만들기도 습관적으로 해 볼만.

	
	public Constructor(String name, String email){
		 // 매개변수 3개짜리 생성자 호출
		this(name, email, 0);   // this는 생성자 호출
		// this.email = email;
		// this.name = name;
	 }
	
	// 매개변수 3개인 생성자
	// 생성자도 overloading 이 가능함.
	public Constructor (String name, String email, int age){
		// this는 로컬 변수와 instance 변수를 구분하기 위해 사용함
		
		this.name = name;
		this.email = email;
		this.age = age;
	}
	
	public static void main(String[] args) {
		Constructor c = new Constructor("성영한", "syh@hb.com", 100); // new로 객체가 생성된 동시에 입력된 매개변수 값으로 인스턴트 변수 값이 초기화 됨.
		System.out.println(c.name);
		System.out.println(c.email);
		System.out.println(c.age);
	

		c = new Constructor("문재인", "ji@hb.com");
		System.out.println(c.name);
		System.out.println(c.email);
		System.out.println(c.age);
		}
		
	
}
