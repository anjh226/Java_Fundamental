package java_20190530;

// Ŭ����
public class Customer {
	
	// ������� (�ν��Ͻ�, ����ƽ, ���̳�)
	private String name; // <- �ν��Ͻ� ����(��ü ����), ��� ��ü�� ������ ������ �ٸ� ���� �־�� �ϴ� ��� �ν��Ͻ� ������ ����ؾ�
	String cphone; // <- �ν��Ͻ� ����(��ü ����), ���������� private�� �� ���� ���.
	
	static double interestRate; // <- static variable

	static final String BANKNAME = "��������";	// <- static final , ���ʻ� �빮�ڷ� ������ �ۼ�
	
	// ������� �׸��� ���������� private �� ENCAPSULATION �� ��! ���������� private ������! --  & ���е� ������ �����ϱ� ���� getter, setter �Լ� �����!
	// �� ������ ����ȭ information hide �� ��ĸ�����̼��� �⺻.
	
	/*public void setName(Sting n){
		neme = n;
	}
	
	public String getNmae() {
		return name;
	}
	*/
	
	// setter, getter �ڵ� ���� ��� ���콺 ��Ŭ�� > Source > ... > Select All > ����
	// ���� : ��Ʈ + ����Ʈ + S > R
	
	
	
	// �޼���
	public void register(){
		// DB ���� -- DB insert ?? (�츮�� ������ DB�� ����..  ���ο� ������ ���� ����غ���)
		System.out.println("���� ��� �Ǿ����ϴ�.");
		System.out.println("�̸� : "+ name + "\n�ڵ��� ��ȣ : "+ cphone 
				+ ", ������ : "+interestRate
				+ ", ����� : "+BANKNAME );
		// ����� main Ŭ������ ���� ���Ͽ���
		
		// (Select -- DB���� ���� �ҷ����� �ʿ�)
			
	}

	// getter setter �ڵ����� ��� 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCphone() {
		return cphone;
	}

	public void setCphone(String cphone) {
		this.cphone = cphone;
	}

	public static double getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(double interestRate) {
		Customer.interestRate = interestRate;
	}

	public static String getBankname() {
		return BANKNAME;
	}
}
