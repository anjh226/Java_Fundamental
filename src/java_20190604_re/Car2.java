package java_20190604_re;

public class Car2 {
	// �ν��Ͻ� ����
	String modelNumber;
	String color;
	int year;
	
	// ������
	// Ư¡ : ��ȯ���� ���� & �Ҽӵ� Ŭ������ �̸��� �޼ҵ���� ������ ��� ������
	// �뵵 : �ν��Ͻ� ���� �ʱ�ȭ �� �� ����Ѵ�
	public Car2 (String modelNumber, String color, int year) {
		this.modelNumber = modelNumber;
		// this�� �ٿ� �ν��Ͻ� �������� ����(�Ű�������� �ν��Ͻ� �������� �ߺ��� ����, �����ϱ� ���ؼ� this�� �ν��Ͻ��� �տ� �ٿ� ����) 
		// '=' �ڰ� �Ű����� 
		this.color = color;
		this.year = year;
	}

	public static void main(String[] args){ 
		Car2 c1 = new Car2("10100011", "red", 2018); 
			// ������ �����ڸ� ������ ���� ��ó�� ������ �� ��ü�� �ν��Ͻ� ������ �� �Ҵ�(����, �ʱ�ȭ) ����
		Car2 c2 = new Car2("88999011", "black", 2009);
		Car2 c3 = new Car2("55500066", "white", 1999);
		
		System.out.println("c1 �ڵ��� ��ü�� �ν��Ͻ�����(�Ӽ�) ����ϱ� : "+"����ȣ: "+c1.modelNumber +"\t"+"����: "+c1.color +"\t"+"�����⵵: "+c1.year );
		System.out.println("c2 �ڵ��� ��ü�� �ν��Ͻ�����(�Ӽ�) ����ϱ� : "+"����ȣ: "+c2.modelNumber +"\t"+"����: "+ c2.color +"\t"+"�����⵵: "+c2.year );
		System.out.println("c3 �ڵ��� ��ü�� �ν��Ͻ�����(�Ӽ�) ����ϱ� : "+"����ȣ: "+c3.modelNumber +"\t"+"����: "+ c3.color +"\t"+"�����⵵: "+c3.year );
	
		

		
	
		
	}	
}
