package java_20190531;

public class StaticMethod {
	static String name;
	int age;
	
	public void m1(){ // instance �޼ҵ�
		name = "��������";
		age = 10;
		m2();
		m4(); // ��� ���/ȣ�� ����
	}
	public void m2(){
		System.out.println("instance method m2()");
	}
		
	public static void m3(){ // static �޼ҵ�
		name = "��������";
		age = 10; // instance ���� ���� �Ұ�
		m2(); // instance �޼ҵ� ȣ�� �Ұ�
		m4();
	}
	public static void m4(){
		System.out.println("instance method m4()");
	}
	
	// �ν��Ͻ� �޼ҵ�, ������ ȣ���ϱ� ���� ��ü�� ������ �Դ� ��. 
	public static void main(String[] args){
		StaticMethod.m4(); // static ������ Ŭ���� �̸�. �� �ٿ��� ȣ�� �ؾ� ��. 
		m2();
		
		name = "�̸�";
		age = "1000";
		

		
		
	}
		
}
