package java_20190604;

public class Rectangle extends Shape{
	
	// �θ��� ����� ����ϸ鼭 + �ڽĿ��� ����� �߰� �ϰ� ���� ��
	public void draw(){
		// super.draw(); // �θ�(super)�� �ִ� draw �޼ҵ带 ȣ���϶� // Shape�� �߻�Ŭ������, draw()�� �߻� �޼ҵ�� ��ȯ�Ǹ� ���� ��. draw()�� �ڽ� Ŭ�������� ���� �������̵�/���� �ʿ�
			
		System.out.println("Rectangle - draw()");
	}
}
