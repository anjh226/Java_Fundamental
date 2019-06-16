package java_20190604;

public class Rectangle extends Shape{
	
	// 부모의 기능을 사용하면서 + 자식에서 기능을 추가 하고 싶을 때
	public void draw(){
		// super.draw(); // 부모(super)에 있는 draw 메소드를 호출하라 // Shape가 추상클래스로, draw()가 추상 메소드로 변환되며 에러 뜸. draw()를 자식 클래스에서 필히 오버라이딩/구현 필요
			
		System.out.println("Rectangle - draw()");
	}
}
