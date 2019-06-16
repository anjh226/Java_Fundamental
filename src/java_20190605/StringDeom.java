package java_20190605;

public class StringDeom {
	public static void main(String[] args){
	
		String str1 = new String("test");
		String str2 = new String("test");
		
		String str3 = "jave";
		String str4 = "jave";
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		
		String ssn = "234567-8923456";
		// charAt(index) : ���ڿ� �߿� Ư�� �ε����� �ִ� ���ڸ� ��ȯ�Ѵ�. (0�� 2���, 6-> - ���)
		char c = ssn.charAt(7);
		System.out.println(c);
		// ���ڿ� ���� (ssn�� �ִ� ���ڿ��� "�ȳ��ϼ���"�� ����), + �� ��� ����
		String temp = ssn.concat("�ȳ��ϼ���");
		System.out.println(temp);
		// endsWith(String temp) �޼���� temp ���ڿ��� ������ true, �׷��� ������ false
		// <-> startsWith(�����ϴ� ���ڿ�) :: http:://.../wbaseball URL�� �����ϴ� �ּҴ� ����� OO001 �޴��� ���´� �� ���� �ڵ��� Ȱ��
		   // temp ���ڿ��� �����ϸ� T, �׷��� ������ F�� ��ȯ
		String fileName = "test.doc";
		if(fileName.endsWith("zip")){
			System.out.println("�������� �Դϴ�.");
		}else if (fileName.endsWith("doc")){
			System.out.println("Office ���� �Դϴ�.");
		}else {
			System.out.println("���� �Դϴ�.");
		}
		
		
		
		
		
		String s1 = "Java";
		String s2 = "JAVA";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2)); // equalsIgnoreCase => ��ҹ��� ���� �����ϰ� ��
		
		s2 = s2.toLowerCase();
		System.out.println(s2);
		
		s1 = s1.toUpperCase();
		System.out.println(s1);
		
		System.out.println(ssn.indexOf("-")); // ���ʺ��� ã�Ƽ� ������ ��
		System.out.println(ssn.lastIndexOf("-")); // ������ ���� ã��, ������ ���ʺ��� ��
		// ���ϸ� �ɰ԰ų� ������ �� Ȱ���ϰ� ��. (ex. dsfdgf.agdsg.dsg.zip --> �� ��� ���ϸ� �и��� lastIndexOf �ʿ�)
		
		ssn = ssn.replaceAll("-", "*"); // String ���ڿ����� -���� �Ǿ� �ִ� �͵��� *�� �����϶�
		System.out.println(ssn);
		// Ȱ�뿹 : ������ </br>�� ������ �� Ȱ��
		
		String html = "�ȳ��ϼ���\n���� �������Դϴ�.\n������ �� ��Ź�帳�ϴ�.";
		html = html.replaceAll("\n", "<br>");
		System.out.println(html);
		
		// ssn = "234567-8923456" (0=2 ~ : �ƹ�° ���� = 0��°�� ī��Ʈ ����)
		String ssn1 = ssn.substring(0,6); // => 0��°���� 6�� �������� ������ (0<= ������ <6)
		String ssn2 = ssn.substring(7); // => 7���� ������ �� (�ι�° ~���� ����(<ooo)�� ������)
		
		String ssn3 = ssn.substring(0, ssn.indexOf("*")); // * 0��° ���� * �������� ���
		String ssn4 = ssn.substring(ssn.indexOf("*")+1); // * ���ĺ��� ��� 
		
		System.out.println(ssn1);
		System.out.println(ssn2);
		System.out.println(ssn3);
		System.out.println(ssn4);
		
		
		String fileName0 = "abc.def.ghi.zip";
		String fileName1 = fileName0.substring(0, fileName0.lastIndexOf("."));
		String fileName2 = fileName0.substring(fileName0.lastIndexOf(".")+1);
		
		System.out.println("�����̸�: "+fileName1);
		System.out.println("Ȯ����: "+fileName2);
		
		fileName1 = "hello";
		fileName2 = "hello ";
		System.out.println(fileName1.length());
		System.out.println(fileName2.length());
		
		if (fileName1.equals(fileName2.trim())){
			System.out.println("����");
		}else
			System.out.println("����");
		
		int a = 10;
		String t1 = String.valueOf(a); // int�� ���ڿ� String���� �ٲٶ�
		String t2 = a+""; // ���� ��� �� ��� ������.
		
		System.out.println(t1);
		System.out.println(t2);
		
		ssn = "234567-8923456";
		String[] t3 = ssn.split("-"); // ���� �ɰԸ� �������� ���� �����Ƿ� t3 �迭�� ������� �Ҵ��϶�
		System.out.println(t3[0]);
		System.out.println(t3[1]);
		
		// format "~~~"�� ���ڿ��� ��ȯ�ϵ� ������ �� ���ڸ� �����Ͽ� ���ڿ��� ��ȯ�ش޶�
		String t4 = String.format("%,.2f and %,.2f", 10000.4212, 20000000.32533);
		System.out.println(t4);
	
		String t44 = String.format("%,d and %,d", 10000, 20000000);
		System.out.println(t44);
		
		String str = String.format("%,.2f , %2$,20.2f , %3$,20.6f",  1111.11,2222.22,3333.33);
		System.out.println(str);
		// format�� �ַ� ���ڸ� , ��� �Ҽ��� ���� ó���Ҷ��� ��. �� �ܴ� �� ���� ���� ����
		
		
// 		%[argument_index$] [flags] [width][.precision] conversion	
		
//		conversion ���� 3����
//		f : �Ǽ��� (�Ǽ����� �Ҽ��� 6° �ڸ����� �⺻ ���)
//		d : ������
//		s : ���ڿ�
		
// 		[argument_index$]
//		1$ => ù��° ���ڸ� �־�� (3$ => 3��° ����)
// 		[argument_index$] ������ ��, ���� ������� �ڵ����� �־���.
		
//		[flags] , 
//		","(�޸�)�� ������ õ���� �޸� �ٿ� ����� �� ����
//		(�� �ܿ��� flag �� �پ�)
		
//		[width] : �ڸ���
//		20 => 20�ڸ� ĭ ��ŭ ������ (���� ���ڰ� 20�ڸ� �̸��� ���, 20�ڸ��� ���� ���� �տ� ���� ��
//		
//		%n => �� �ٲ�
		
//		[.precision] : �Ҽ��� ���� �ڸ���
//		.2 => �Ҽ��� ���� 2�ڸ�
//
//		���ڿ� <= %s
		
		int b1 = 10;
		int b2 = 20;
		System.out.printf("b1�� ���� %d �̰��, b2�� ���� %d �Դϴ�.", b1, b2);
		System.out.println();
		System.out.println("b1�� ����"+b1+"�̰��, "+"b2�� ����"+b2+"�Դϴ�.");
	}
}








