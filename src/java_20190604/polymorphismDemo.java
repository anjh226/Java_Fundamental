package java_20190604;

public class polymorphismDemo {
	
	public static void execute(Shape s){ // �߻� Ŭ������ ����������
		s.draw();
	}
	// ���� �޼ҵ��̳� ȣ��Ǵ� ��ü�� ���� �ٸ� �Լ��� ������ �� ����. --> Polymorphism
	
	public static void main (String[] args){
		Triangle t = new Triangle();
		execute(t); // --> Triangle �� draw() �޼ҵ尡 ȣ�� ��.

		Rectangle r = new Rectangle();
		execute(r);
	}
}	

