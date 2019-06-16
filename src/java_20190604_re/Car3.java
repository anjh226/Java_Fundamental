package java_20190604_re;

public class Car3 {
	String modelNumber;
	String color;
	int year;
	
	public Car3(String modelNumber, String color, 	int year){
		this.modelNumber = modelNumber;
		this.color = color;
		this.year = year;
	}
	//modelNumber를 변경할 수 있는 메소드 만들기(modelNumber의 setter 메소드) 
	public void setModelNumber(String modelNumber){
		this.modelNumber = modelNumber;
	}
	
	//modelNumber를 가져올 수 있는 메소드 만들기(modelNumber의 getter 메소드) 
	public String getModelNumber(){
		return modelNumber;
	}
	
	public void serColor(String color){
		this.color = color;
	}
	
	// getter, setter 메소드 사용해 보기.
	
	public static void main(String[] args){ 
		Car3 c1 = new Car3("10100011", "red", 2018);

		
		System.out.println("대상값: "+c1.modelNumber);
		String mn1 = c1.getModelNumber(); // gett 하여 mn1에 할당 (getter은 반환값이 있는 메소드)
		System.out.println("getter로 불러와 mn1에 할당한 값: "+mn1);
		
		System.out.println("setter 전: "+c1.modelNumber);
		c1.setModelNumber("9-----999"); // modelNumber 값을 sett 를 사용해 "9-----999"으로 수정 (setter은 반환값이 없는 메소드)
		System.out.println("setter 후: "+c1.modelNumber);
		
		// 값을 수정하거나 가져올 때, 여러개인 인스턴스 변수 각각에 접근하여 수정/get 하는 것은 좋지 않은 방식. 따라서 인스턴스 변수 관리에는 getter, setter 변수를 생성하여 관리할 것.

		// 이어서 코딩해 보기 (Car2~3, 색상, 연식까지 )
		
		
		
		
		
	}	
}
