package java_20190604;

// �������̽� ����� ���߻���� ������. 
public interface InterA extends InterB, InterC { 
		// �������̽��� ���� public static final �� ���� �Ǿ� ����.
		/*public static final*/ double PI = 3.14;
		
		// �������̽����� �޼��� ���� �����ڸ� ������ ������ public�� �����Ǿ� ����. --> sub ���� �������̵� �� �� public ������ �ٿ��� ��. ������ ���� �� default �� �ƴ� ����!!
		// abstract �� ���� ����.
		/*public*/ /*abstract*/ void mA();
		
		

}
