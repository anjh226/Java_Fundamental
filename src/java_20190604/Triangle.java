package java_20190604;

public class Triangle extends Shape{
	
	// �ν��Ͻ� ����
	String dot ;
	double angleDegree ;
		
	// �������̵� �ۼ� ��Ģ
	// 1. �θ��� �޼ҵ�� �̸��� ���ƾ� ��.
	// 2. �θ��� �޼ҵ�� �Ű����� ������ �ڷ����� ��ġ�ؾ� ��.
	// 3. �θ��� �޼ҵ��  ��ȯ���� ���ƾ� ��.
	// 4. ���� �����ڴ� �θ𺸴� ũ�ų� ���ƾ� ��.
	
	// �޼ҵ� (�������̵� O)
	// �θ��� ����� ��� �����ϰ� ������ ���� ���ۼ�
	public void draw(){
		System.out.println("Triangle - draw()");
	}
	
	// �޼ҵ� 
	public void drawCoordinatin(){
		System.out.println("Triangle - drawCoordination()");
	}
}
