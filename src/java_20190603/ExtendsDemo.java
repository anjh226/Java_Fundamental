package java_20190603;
 
public class ExtendsDemo {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.name = "������";
		c.cphone = "010-0000-0000";
		System.out.println("�̸�: "+c.name );
		System.out.println("�ڵ���: "+c.cphone );
		c.actionCustomer();
		
		Alba a = new Alba();
		a.name = "�˹ٻ�"; // �θ𿡰� ��� ���� �������
		a.cphone = "999-9999-9999"; // �θ𿡰� ��� ���� �������
		a.address = "����";
		System.out.println("�̸�: "+a.name );
		System.out.println("�ڵ���: "+a.cphone );
		System.out.println("�ּ�: "+a.address );
		a.actionCustomer();
		a.actionAlba();
		
		Manager m = new Manager();
		m.name = "�Ŵ���";
		m.cphone = "777-7777-7777";
		m.address = "��⵵";
		m.id = "syh0110";
		m.password = "1231234";		
		System.out.println("�̸�: "+m.name );
		System.out.println("�ڵ���: "+m.cphone );
		System.out.println("�ּ�: "+m.address );
		System.out.println("���̵�: "+m.id );
		System.out.println("��й�ȣ: "+m.password );
		m.actionCustomer();
		m.actionAlba();
		m.actionManager();
		
		// Super Ÿ��(Alba)���� ���� ��ü(Manager)�� ������ �� �ִ�.
		// ��������� Super Ÿ��(Alba)�� ������ ���� Ŭ����(Customer) ���� ����.
		Alba alba = /*(Alba) ���� �� ��. ����ĳ����*/ new Manager(); // �θ� Ÿ������ sub�� ��ü�� ������ �� �ִ�. (sub ��ü ������ ���� ĳ������ �� ��)
		alba.name = "�Ŵ���";
		alba.cphone = "777-7777-7777";
		alba.address = "��⵵";
		// alba.id = "syh0110";
		// alba.password = "1231234";		
		System.out.println("�̸�: "+alba.name );
		System.out.println("�ڵ���: "+alba.cphone );
		System.out.println("�ּ�: "+alba.address );
		
	}
}
