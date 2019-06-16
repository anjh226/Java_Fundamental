package java_20190531;

public class Constructor {
	private String name;
	private String email;
	private int age;
	
	// �ڵ���Ʈ ������ (= �Ű������� ���� ������) : Ŭ���� ���� �����ڰ� ���� ��� compiler�� �ڵ����� ������ �ش�. 
	// ��  													��, Ŭ���� ���� �����ڰ� 1�� �� �ִ� ���� compiler ������ ���� �ʴ´�. 
	// �����ڴ� Ŭ������ �̸��� ����, ��ȯ���� ���� ���¸� ������ �ִ�.
	public Constructor(){
	}
	// ������ �ڵ����� ���ο� ���� ���� -- �߻��� ã�� ����� ������ ���� (new�� �ߴµ� ������ ���ٸ� ����Ʈ ������ �ִ��� ���� Ȯ���� �� ��)
	// Ŭ������ ����� ������ ����⵵ ���������� �� ����.

	
	public Constructor(String name, String email){
		 // �Ű����� 3��¥�� ������ ȣ��
		this(name, email, 0);   // this�� ������ ȣ��
		// this.email = email;
		// this.name = name;
	 }
	
	// �Ű����� 3���� ������
	// �����ڵ� overloading �� ������.
	public Constructor (String name, String email, int age){
		// this�� ���� ������ instance ������ �����ϱ� ���� �����
		
		this.name = name;
		this.email = email;
		this.age = age;
	}
	
	public static void main(String[] args) {
		Constructor c = new Constructor("������", "syh@hb.com", 100); // new�� ��ü�� ������ ���ÿ� �Էµ� �Ű����� ������ �ν���Ʈ ���� ���� �ʱ�ȭ ��.
		System.out.println(c.name);
		System.out.println(c.email);
		System.out.println(c.age);
	

		c = new Constructor("������", "ji@hb.com");
		System.out.println(c.name);
		System.out.println(c.email);
		System.out.println(c.age);
		}
		
	
}
