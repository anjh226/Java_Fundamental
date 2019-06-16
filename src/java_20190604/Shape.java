package java_20190604;

public abstract class Shape {

	String name; 
	double degree;
	
	public abstract void draw() ; // 추상 메소드
	
	public void drawLine(){
		System.out.println("Shape - drwarLine()");
	}
	
}
