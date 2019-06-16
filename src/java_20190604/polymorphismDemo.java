package java_20190604;

public class polymorphismDemo {
	
	public static void execute(Shape s){ // 추상 클래스의 폴리모피즘
		s.draw();
	}
	// 단일 메소드이나 호출되는 객체에 따라 다른 함수를 동작할 수 있음. --> Polymorphism
	
	public static void main (String[] args){
		Triangle t = new Triangle();
		execute(t); // --> Triangle 의 draw() 메소드가 호출 됨.

		Rectangle r = new Rectangle();
		execute(r);
	}
}	

