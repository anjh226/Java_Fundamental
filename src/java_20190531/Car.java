package java_20190531;

public class Car {

	private String modelNumber; // ���� -> �ܺ� ����� ���� st, gt ������ ���̵�
	String color;
	protected int doorCount;
	public double price; // ������ ���� �������� ����� double�� �ϴ°� ����.
	
	// alt + shift + s => c
	public Car() {
		super();  // --> ��ӿ��� ���߿� ��� ��
		// TODO Auto-generated constructor stub
	}
	
	// alt + shift + s => o
	public Car(String modelNumber, String color, int doorCount, double price) {
		super();
		this.modelNumber = modelNumber;
		this.color = color;
		this.doorCount = doorCount;
		this.price = price;
	}
	
	

	
	
}
