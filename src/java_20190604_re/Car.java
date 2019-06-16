package java_20190604_re;

// 객체 : Car
public class Car {
	
	// 인스턴스 변수 -- 클래스 객체가 가질 수 있는 속성을 정해 줌 (클레스 안, 메소드 밖에 위치) -- 생성자로 객체를 new 할때마다 생성된 객체에 변수 공간 할당해 줌.
	String modelNumber; // 기본값은 null
	String color;
	int year; // year : 제조년도 // 기본값은 0
	
	
	// 메소드 만들기
	public void whatIsColor(){ // (static 한정자 안 붙어 있으므로 인스턴스 메소드)
		System.out.println("내 차 색깔은 "+color+"입니다.");
	}
	// 반환 값이 있는 메소드 (반환값 type은 String)
	public String getColor(){
		return "내 차 색깔은 "+color+"야!!!";
	}
	
	
	// 메인 메소드 (메인 함수)
	public static void main(String[] args){ 
		// 각 변수에 값 저장하기
		
		// 첫번째 객체 / 인스턴스 변수에 값 할당
		Car c1 = new Car();
		c1.whatIsColor(); // 출력 : 내 차 색깔은 null입니다. (아직 c1 의 color 변수에 리터럴이 할당되지 않았기 때문)
		c1.modelNumber = "01061106";
		c1.color = "white";
		c1.year = 2018;
		
		// 반환 값이 없는(void) 메소드 -- 호출하기
		c1.whatIsColor(); // 출력 : 내 차 색깔은 white 입니다. // 반환값이 void로 없는 메소드 임으로 데이터 저장X 호출만 가능
		
		// 반환 값이 있는(type은 String) 메소드 사용 값 생성 -> 인스턴스 변수에 값 저장 --> 인스턴스 변수 출력하여 값 확인 
		String msg1 = c1.getColor(); // 반환 값이 있는 함수이므로 값을 불러와 msg에 저장한 후, msg 값을 출력
		System.out.println(msg1);
		
		// 두번째 객체
		Car c2 = new Car();
		c2.modelNumber = "01590106";
		c2.color = "red";
		c2.year = 2019;
		
		c2.whatIsColor();
		String msg2 = c2.getColor();
		System.out.println(msg2);
			
		
		// 세번째 객체
		Car c3 = new Car();
		c3.modelNumber = "99977082";
		c3.color = "grey";
		c3.year = 2017;
		
		c3.whatIsColor();
		String msg3 = c3.getColor();
		System.out.println(msg3);
		
		
		// 출력하기
		System.out.println("첫번째 객체의 멤버변수(인스턴스 변수) 출력하기");
		System.out.println(c1.modelNumber + "\t" + c1.color + "\t" + c1.year);

		System.out.println("두번째 객체의 멤버변수(인스턴스 변수) 출력하기");
		System.out.println(c2.modelNumber + "\t" + c2.color + "\t" + c2.year);
		
		System.out.println("세번째 객체의 멤버변수(인스턴스 변수) 출력하기");
		System.out.println(c3.modelNumber + "\t" + c3.color + "\t" + c3.year);
			
	}
}
