package java_20190607;

public class StiringBufferDemo {
	public static void main(String[] args) {
		
		StringBuffer s1 = new StringBuffer();
		StringBuffer s2 = new StringBuffer();
		
		s1.append("select name, age");
		s1.append("from menber");
		
		s2.append("select name, age");
		s2.append("from menber");

		System.out.println(s1 == s2);
		// StiringBuffer�� equals() �޼���� object Ŭ������ equals() �޼ҵ�. ���� ��ü �� (���� �� X)
		System.out.println(s1.equals(s2));
		
		String s3 = s1.toString();
		String s4 = s2.toString();
		
		System.out.println(s3.equals(s4));
		
		// StringBuffer �� ���� �ϱ� ���ؼ�, s1�� ���� ��� �����
		s1.setLength(0);
		
		s1.append("select no, write from board");
		// StringBuffer Ŭ������ Object�� toString() �ż��带 �������̵� �߱� ������, StringBuffer Ŭ������ ���ڿ��� ��µ�.
		System.out.println(s1/*.toString*/); // ** ���� : ���� ����,  StringBuffer ���۷����� �״�� ����ص� toString�� �������̵� �߱� ������, �������� �ʰ� ������ ���ڿ��� ��� ��. �����Ǿ� �� ���̴� ��.
		
	}

}
