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
	//modelNumber�� ������ �� �ִ� �޼ҵ� �����(modelNumber�� setter �޼ҵ�) 
	public void setModelNumber(String modelNumber){
		this.modelNumber = modelNumber;
	}
	
	//modelNumber�� ������ �� �ִ� �޼ҵ� �����(modelNumber�� getter �޼ҵ�) 
	public String getModelNumber(){
		return modelNumber;
	}
	
	public void serColor(String color){
		this.color = color;
	}
	
	// getter, setter �޼ҵ� ����� ����.
	
	public static void main(String[] args){ 
		Car3 c1 = new Car3("10100011", "red", 2018);

		
		System.out.println("���: "+c1.modelNumber);
		String mn1 = c1.getModelNumber(); // gett �Ͽ� mn1�� �Ҵ� (getter�� ��ȯ���� �ִ� �޼ҵ�)
		System.out.println("getter�� �ҷ��� mn1�� �Ҵ��� ��: "+mn1);
		
		System.out.println("setter ��: "+c1.modelNumber);
		c1.setModelNumber("9-----999"); // modelNumber ���� sett �� ����� "9-----999"���� ���� (setter�� ��ȯ���� ���� �޼ҵ�)
		System.out.println("setter ��: "+c1.modelNumber);
		
		// ���� �����ϰų� ������ ��, �������� �ν��Ͻ� ���� ������ �����Ͽ� ����/get �ϴ� ���� ���� ���� ���. ���� �ν��Ͻ� ���� �������� getter, setter ������ �����Ͽ� ������ ��.

		// �̾ �ڵ��� ���� (Car2~3, ����, ���ı��� )
		
		
		
		
		
	}	
}
