package java_20190531;

import java_20190531.tt.Cat;

public class AccessModifyDemo extends Cat { // extends Cat : Cat�� �θ�� �����Ͽ� ��� ����. �� protected ��.(private, ����Ʈ�� �� ��. public�� ���� ���µ� ���̴� �翬�� ��� ����)  
	public static void main(String[] args) {
		
		Car c = new Car();
		
		// private : ���� �ߴ� ������ modelNumber�� private�� ������ױ� ������, �ٸ� class ������ ���� �� ��.
		// c.modelNumber = "68��4472" 
				
		// default : ���� ��Ű�� ������ ���� ���� 
	    c.color = "red";
		
		// protected : ���� �ٸ� ��Ű������ ��ӹ��� ��� ���� ����
		c.doorCount = 5;
		
		// pubilc : ���� �ٸ� ��Ű������ ���� ����
		c.price = 10_000_000; // , ��� _ ��� ����
		
		System.out.println(c.color);
		
		
		// �ٸ� ��Ű���� ��ü�� ������ ���� ����
		Cat cat = new Cat();
		cat.nickName = "tomcat";		
		
		// ���� : �ٸ� ��Ű���� �ֱ� ���� -> �ذ� : �ش� java ������ import ���־�� ��.
		// ����Ű : ��Ʈ�� + ����Ʈ + O --> ��ܿ� �ڵ� ����
		
		AccessModifyDemo a = new AccessModifyDemo();
		// Cat Ŭ������ ��� �޾ұ� ������, protected �� ���� ��������. (��, �ַ� public, private �� ��)
		a.age = 10; // protected
		a.nickName = "����"; // public
		
		
		
		
		

	}
}
