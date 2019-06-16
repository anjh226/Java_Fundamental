package java_20190604;

public class Triangle extends Shape{
	
	// 인스턴스 변수
	String dot ;
	double angleDegree ;
		
	// 오버라이딩 작성 규칙
	// 1. 부모의 메소드와 이름이 같아야 함.
	// 2. 부모의 메소드와 매개변수 갯수와 자료형이 일치해야 함.
	// 3. 부모의 메소드와  반환형도 같아야 함.
	// 4. 접근 한정자는 부모보다 크거나 같아야 함.
	
	// 메소드 (오버라이딩 O)
	// 부모의 기능을 모두 무시하고 완전히 새로 재작성
	public void draw(){
		System.out.println("Triangle - draw()");
	}
	
	// 메소드 
	public void drawCoordinatin(){
		System.out.println("Triangle - drawCoordination()");
	}
}
