package java_20190530;

public class MainDemo {
	
	public static void main(String[] args) {
		// 1. Customer c ���� Customer�� Reference Type, c�� Reference
		// 2. new Customer() �� Object 
/*		Customer c = new Customer(); // ? ���� c�� customer Ŭ������ �����ϰ� �϶�

		c.name = "������"; 
		c.cphone = "010-3024-1703";
		
		Customer.interestRate = 4.3; // static ������ ������������ ������ �ν��ϱ� ���� ���۷�����(c.---) ���� ���� Ŭ������(Customer.--) �������� �ۼ� ����.

		// Customer.BANKNAME = "�츮����"; --> final �����̹Ƿ�("��������"���� ����) �ٲ� �� ����.
		
		c.register(); 
		
		// �� ��° ������Ʈ ����
		Customer c2 = new Customer();
		c2.name = "Steve Jobs";
		c2.cphone = "010-000-0001";
		Customer.interestRate = 4.5; // interestRate�� static ���� 4.3 ->  4.5�� ���� ��. �̷ν� ���Ϻ��ʹ� call�Ǵ� ���� 4.5�� ��.
		
		c2.register();
		
		// c3 Reference �� c2 Reference�� ����Ű�� Object�� �����϶�� �ǹ�
		Customer c3 = c2;
		c3.name = "������";
		c3.cphone = "070-1111-2222"; // �̷ν�, c2�� �����ϴ� object�� ����� (c2, c3�� ���� ��ü�� �����ϰ� �Ǿ����Ƿ�)
		
		c3.register(); // -> ������
		c2.register(); // -> ������
*/		
		
		Member m = new Member(); // ���� m �� Member Ŭ����(Member.java ���Ͽ��� ���ǵ�)�� �����ϰ� �϶�. 
		m.setName("sung");
		m.setAddress("�����..."); // set �ν��Ͻ� ���� ����
		
		System.out.println(m.getName());
		System.out.println(m.getAddress()); // get ���� ������
		
				
		
	}
	
}
