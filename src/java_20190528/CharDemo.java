package java_20190528;

public class CharDemo {
	public static void main (String[] args){
		//���� ǥ����
		char a = 'q';
		
		// �����ڵ� ǥ���� '\u0000'
		char b = '\uC548';
		char c = '\uC9C0';
		char d = '\uD61C';
		
		System.out.println(b); // println ����Ʈ ������ ���� �� ����
		System.out.println(c);
		System.out.println(d);
		
		System.out.print(b); // print ���
		System.out.print(c);
		System.out.print(d);
		
		// �� ���ؿ��� �� �ٷ� ����ϱ� �ڵ�� �����ϴ� PASS
		
		// �ƽ�Ű�ڵ� ǥ����
		char e = 97;
		System.out.println(e);
		
		//�̽������� ĳ����
		System.out.println("������\t����"); // t\ tab ��ŭ ��� ��
		System.out.println("C:\\Users\\user\\Desktop\\anjh_0527"); // �齽���ø� �߷��ϱ� ���ؼ� '//'���� �ľ� ��.
	
		System.out.println("\""); // �ֵ���ǥ \" , 
		System.out.println("������ '����'"); // Ȭ����ǥ�� �ν���. �̽������� char ���ʿ�	
		// ���ڿ� �߿��� �ν� ���ϴ� �� �� 2���� : "(�ֵ���ǥ), \(�齽����) �� �״�� ���� ���ڷ� �ν����� �� ��. �տ� �齽����(\)�� �ٿ��� ���ڷ� �νĽ��Ѿ� ��.
	
		// ���ڿ��� \, ' �ΰ��� ���ڴ� ���ڿ��� char���� �ν��� ���ϱ� ������ �� ���� �п� \�� �ٿ� �ش�.
		char f = '\\';
		char g = '\'';
		char h = '"';
			
	}
}
