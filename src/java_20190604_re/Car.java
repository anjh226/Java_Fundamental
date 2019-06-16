package java_20190604_re;

// ��ü : Car
public class Car {
	
	// �ν��Ͻ� ���� -- Ŭ���� ��ü�� ���� �� �ִ� �Ӽ��� ���� �� (Ŭ���� ��, �޼ҵ� �ۿ� ��ġ) -- �����ڷ� ��ü�� new �Ҷ����� ������ ��ü�� ���� ���� �Ҵ��� ��.
	String modelNumber; // �⺻���� null
	String color;
	int year; // year : �����⵵ // �⺻���� 0
	
	
	// �޼ҵ� �����
	public void whatIsColor(){ // (static ������ �� �پ� �����Ƿ� �ν��Ͻ� �޼ҵ�)
		System.out.println("�� �� ������ "+color+"�Դϴ�.");
	}
	// ��ȯ ���� �ִ� �޼ҵ� (��ȯ�� type�� String)
	public String getColor(){
		return "�� �� ������ "+color+"��!!!";
	}
	
	
	// ���� �޼ҵ� (���� �Լ�)
	public static void main(String[] args){ 
		// �� ������ �� �����ϱ�
		
		// ù��° ��ü / �ν��Ͻ� ������ �� �Ҵ�
		Car c1 = new Car();
		c1.whatIsColor(); // ��� : �� �� ������ null�Դϴ�. (���� c1 �� color ������ ���ͷ��� �Ҵ���� �ʾұ� ����)
		c1.modelNumber = "01061106";
		c1.color = "white";
		c1.year = 2018;
		
		// ��ȯ ���� ����(void) �޼ҵ� -- ȣ���ϱ�
		c1.whatIsColor(); // ��� : �� �� ������ white �Դϴ�. // ��ȯ���� void�� ���� �޼ҵ� ������ ������ ����X ȣ�⸸ ����
		
		// ��ȯ ���� �ִ�(type�� String) �޼ҵ� ��� �� ���� -> �ν��Ͻ� ������ �� ���� --> �ν��Ͻ� ���� ����Ͽ� �� Ȯ�� 
		String msg1 = c1.getColor(); // ��ȯ ���� �ִ� �Լ��̹Ƿ� ���� �ҷ��� msg�� ������ ��, msg ���� ���
		System.out.println(msg1);
		
		// �ι�° ��ü
		Car c2 = new Car();
		c2.modelNumber = "01590106";
		c2.color = "red";
		c2.year = 2019;
		
		c2.whatIsColor();
		String msg2 = c2.getColor();
		System.out.println(msg2);
			
		
		// ����° ��ü
		Car c3 = new Car();
		c3.modelNumber = "99977082";
		c3.color = "grey";
		c3.year = 2017;
		
		c3.whatIsColor();
		String msg3 = c3.getColor();
		System.out.println(msg3);
		
		
		// ����ϱ�
		System.out.println("ù��° ��ü�� �������(�ν��Ͻ� ����) ����ϱ�");
		System.out.println(c1.modelNumber + "\t" + c1.color + "\t" + c1.year);

		System.out.println("�ι�° ��ü�� �������(�ν��Ͻ� ����) ����ϱ�");
		System.out.println(c2.modelNumber + "\t" + c2.color + "\t" + c2.year);
		
		System.out.println("����° ��ü�� �������(�ν��Ͻ� ����) ����ϱ�");
		System.out.println(c3.modelNumber + "\t" + c3.color + "\t" + c3.year);
			
	}
}
