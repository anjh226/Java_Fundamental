package java_20190605;

class Car{
	// �ν��Ͻ� ���� ����
	String modelNumber;
	String color;
	int year;
		
	//(����Ű) �Ű����� �ִ� ������ ����� : alt + shift + s => o
	public Car(String modelNumber, String color, int year) {
		super();
		this.modelNumber = modelNumber;
		this.color = color;
		this.year = year;
	}

	//(����Ű) ����Ʈ ������(�Ű����� ���� ������) ����� :  alt + shift + s => c
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}


	// setter, getter �޼ҵ� �ڵ� ���� : alt + shift + s => r 
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

	
	// equals and hashCode �������̵� �ڵ����� ����Ű : alt + shift + s => h 
	// �ڵ� ������ �ڵ����� ����Ű�� ����� ��� Ȱ�� ������ �˰� �ֱ�
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

	// toString �ڵ� ����
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
		// toStrig �������̵� �� => java_20190605.Car@1bcde813 ".toString()"�� ������ ��. �̰� �ּҰ� �ƴ�. ���� �������� ����.
		// toStrig �������̵� �� => Car [modelNumber=010101000, color=black, year=2018]
		
		
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
		System.out.println("c1 �ؽ��ڵ� : "+ c1.hashCode());
		System.out.println("c2 �ؽ��ڵ� : "+ c2.hashCode());
	
		System.out.println(c3==c4);
		System.out.println(c3.equals(c4));
		System.out.println("c3 �ؽ��ڵ� : "+ c3.hashCode());
		System.out.println("c4 �ؽ��ڵ� : "+ c4.hashCode());
		
	}

}
