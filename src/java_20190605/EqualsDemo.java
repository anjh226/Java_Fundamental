package java_20190605;

class Car{
	// 인스턴스 변수 선언
	String modelNumber;
	String color;
	int year;
		
	//(단축키) 매개변수 있는 생성자 만들기 : alt + shift + s => o
	public Car(String modelNumber, String color, int year) {
		super();
		this.modelNumber = modelNumber;
		this.color = color;
		this.year = year;
	}

	//(단축키) 디폴트 생성자(매개변수 없는 생성자) 만들기 :  alt + shift + s => c
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}


	// setter, getter 메소드 자동 생성 : alt + shift + s => r 
	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	
	// equals and hashCode 오버라이딩 자동생성 단축키 : alt + shift + s => h 
	// 코드 어려우니 자동생성 단축키로 만들고 기능 활용 원리만 알고 있기
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((modelNumber == null) ? 0 : modelNumber.hashCode());
		result = prime * result + year;
		return result;
	}	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (modelNumber == null) {
			if (other.modelNumber != null)
				return false;
		} else if (!modelNumber.equals(other.modelNumber))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	// toString 자동 생성
	@Override
	public String toString() {
		return "Car [modelNumber=" + modelNumber + ", color=" + color + ", year=" + year + "]";
	}
	

}

public class EqualsDemo {
	public static void main(String[] args) {

		Car c1 = new Car("010101000", "black", 2018);
		Car c2 = new Car("010101000", "black", 2018);
		
		Car c3 = new Car("090909009", "red", 2019);
		Car c4 = new Car("090909009", "red", 2019);
		System.out.println(c1/*.toString()*/); 
		// toStrig 오버라이딩 전 => java_20190605.Car@1bcde813 ".toString()"을 생략한 것. 이것 주소값 아님. 개념 오해하지 말기.
		// toStrig 오버라이딩 후 => Car [modelNumber=010101000, color=black, year=2018]
		
		
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
		System.out.println("c1 해시코드 : "+ c1.hashCode());
		System.out.println("c2 해시코드 : "+ c2.hashCode());
	
		System.out.println(c3==c4);
		System.out.println(c3.equals(c4));
		System.out.println("c3 해시코드 : "+ c3.hashCode());
		System.out.println("c4 해시코드 : "+ c4.hashCode());
		
	}

}
