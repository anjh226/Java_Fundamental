package java_20190528;

public class CastingDemo {
	public static void main(String[] args){
		// byte ������ �Ѿ�� ���� �߻�
		// circuit �߻�
		byte a = (byte)128;
		System.out.println(a);
		
		// float, double�� ĳ���� �ϴ� ���� �Ҽ��� ���� ©��.
		// cut �߻�
		int b = (int)42.5;
		System.out.println(b);
		
		int c = 42/4;
		System.out.println(c);

		// EX
		int totalCount = 42;
		int memberCount = 4;
		
		int d = 42/4; // 10���� ��� ���. �Ҽ������� ǥ���Ϸ���
		System.out.println(d);
		
		double e = (double)42/(double)4;
		System.out.println(e);
		
		
	
	}
}
