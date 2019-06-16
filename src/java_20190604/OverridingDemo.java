package java_20190604;

public class OverridingDemo {
	
	public static void main(String[] args){
		//Shape shape = new Shape(); // new 객체 생성 불가능 (Shape 가 추상 클래스가 되었기 때문)
		
		Triangle t = new Triangle(); // 자식 -> 부모것 모두 사용 가능
		t.draw();
		
		Rectangle r = new Rectangle();
		t.draw();
		
		Shape s = new Triangle(); // 호출자 s.--- 은 부모(Shape) 의 변수, 메소드만 호출 가능. Triangle 의 것은 all 불가능
		// 왜 이런게 필요? --> 이유 : 재정의된 자식 메소드가 아니라 원래의 부모 메소드를 호출 하기 위해
										// 추상클래스, 인터페이스에 필히 필요. 추상클래스나 인터페이스를 상속받은 sub 클래스의 도움 필요. (따라서, 추상, 인터페이스 외에 일반적으로 클래스에서는 사용 X는 방법)
		// 오토 캐스팅 됨 (Shape) 가 new 뒤에 생략된 것. '참조변수(호출자)'가 Shape으로 달라지기 때문에 형변환이라 함.
		
		s.name = "삼각형";
		s.degree = 60;
		s.drawLine();
		s.draw(); // super인 Shape의 draw() 가 아니라 sub인 Triangle 의 draw() 가 호출 됨.
		// s.dot = "";
		// s.angleDegree = 180;
		// s.drawCoordinate();
				
	}

}
