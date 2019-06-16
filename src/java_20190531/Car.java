package java_20190531;

public class Car {

	private String modelNumber; // 경고뜸 -> 외부 사용을 위해 st, gt 만들라는 가이드
	String color;
	protected int doorCount;
	public double price; // 가격은 향후 할인적용 고려해 double로 하는게 좋음.
	
	// alt + shift + s => c
	public Car() {
		super();  // --> 상속에서 나중에 배울 것
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
