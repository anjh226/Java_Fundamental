package java_20190604;

public class OverridingDemo {
	
	public static void main(String[] args){
		//Shape shape = new Shape(); // new ��ü ���� �Ұ��� (Shape �� �߻� Ŭ������ �Ǿ��� ����)
		
		Triangle t = new Triangle(); // �ڽ� -> �θ�� ��� ��� ����
		t.draw();
		
		Rectangle r = new Rectangle();
		t.draw();
		
		Shape s = new Triangle(); // ȣ���� s.--- �� �θ�(Shape) �� ����, �޼ҵ常 ȣ�� ����. Triangle �� ���� all �Ұ���
		// �� �̷��� �ʿ�? --> ���� : �����ǵ� �ڽ� �޼ҵ尡 �ƴ϶� ������ �θ� �޼ҵ带 ȣ�� �ϱ� ����
										// �߻�Ŭ����, �������̽��� ���� �ʿ�. �߻�Ŭ������ �������̽��� ��ӹ��� sub Ŭ������ ���� �ʿ�. (����, �߻�, �������̽� �ܿ� �Ϲ������� Ŭ���������� ��� X�� ���)
		// ���� ĳ���� �� (Shape) �� new �ڿ� ������ ��. '��������(ȣ����)'�� Shape���� �޶����� ������ ����ȯ�̶� ��.
		
		s.name = "�ﰢ��";
		s.degree = 60;
		s.drawLine();
		s.draw(); // super�� Shape�� draw() �� �ƴ϶� sub�� Triangle �� draw() �� ȣ�� ��.
		// s.dot = "";
		// s.angleDegree = 180;
		// s.drawCoordinate();
				
	}

}
