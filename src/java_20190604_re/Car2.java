package java_20190604_re;

public class Car2 {
	// 인스턴스 변수
	String modelNumber;
	String color;
	int year;
	
	// 생성자
	// 특징 : 반환값이 없음 & 소속된 클래스의 이름과 메소드명이 동일한 경우 생성자
	// 용도 : 인스턴스 변수 초기화 할 때 사용한다
	public Car2 (String modelNumber, String color, int year) {
		this.modelNumber = modelNumber;
		// this를 붙여 인스턴스 변수임을 구별(매개변수명과 인스턴스 변수명이 중복될 때는, 구분하기 위해서 this를 인스턴스명 앞에 붙여 구분) 
		// '=' 뒤가 매개변수 
		this.color = color;
		this.year = year;
	}

	public static void main(String[] args){ 
		Car2 c1 = new Car2("10100011", "red", 2018); 
			// 위에서 생성자를 생성한 덕에 이처럼 간략히 각 객체의 인스턴스 변수에 값 할당(저장, 초기화) 가능
		Car2 c2 = new Car2("88999011", "black", 2009);
		Car2 c3 = new Car2("55500066", "white", 1999);
		
		System.out.println("c1 자동차 객체의 인스턴스변수(속성) 출력하기 : "+"차번호: "+c1.modelNumber +"\t"+"색상: "+c1.color +"\t"+"제조년도: "+c1.year );
		System.out.println("c2 자동차 객체의 인스턴스변수(속성) 출력하기 : "+"차번호: "+c2.modelNumber +"\t"+"색상: "+ c2.color +"\t"+"제조년도: "+c2.year );
		System.out.println("c3 자동차 객체의 인스턴스변수(속성) 출력하기 : "+"차번호: "+c3.modelNumber +"\t"+"색상: "+ c3.color +"\t"+"제조년도: "+c3.year );
	
		

		
	
		
	}	
}
