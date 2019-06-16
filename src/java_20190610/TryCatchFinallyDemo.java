package java_20190610;

public class TryCatchFinallyDemo {
	public static double average(int a, int b){
		int sum = a + b;
		return (double)sum / (double)2;
	}
	
	public static void main(String[] args) { // args : �Է�(����)�� ��
/*		if (args.length !=2) {
			// ����, ��� ����� out ��� err �� (��, ��� ��� �ð��� ���̴� ���� or ��Ŭ���� �ֿܼ��� ������ �۾� ���)
			System.err.println("usage : java TtyCatchFinallyDemo " + "[��������]" + "[��������]");
			return; // -> (length �� 2�� �ƴϸ� (���� 2�� �Է����� �ʾҴٸ�)) ���α׷� ���� �϶�.
		}*/
		
		// Integer.parseInt() �޼ҵ�� ���ڰ� �ƴ� ���ڿ��� �� ���. ��, �Ϲ� ���ڿ��� ��� -> NumberFormetException ���ܰ� �߻�
		 // (��> �߻� ������ ���� : int (����)��� ���ڰ� ������ Exception�� ���� �� ����. )
		
		try {
			int korea = Integer.parseInt(args[0]);
			
			// JVM�� ������ ���� ��Ű��, ���� ��ü�� NumberFormatException ��ü�� ������ ��, catch ���� ã�´�. 
			int english = Integer.parseInt(args[1]);
			double avg = average(korea, english);
			System.out.printf("��� : %.2f", avg );
			
		} catch (NumberFormatException e) { // ĳġ ���� ��� ������ �� ���� �ʿ�� ����, ���� ���� �͸� ������ �� ����.
			// e.printStackTrace(); // -> JVM ó���ÿ� ������ ��� ���. ���� ��ü ��ġ�� ��ô�ؼ�, �ش� ������ �˷� �� => ����, ���ߴܿ����� �̸� ���.
			// System.err.println("���� �޽��� : "+ e.getMessage());
			System.err.println("����ڿ� �ȳ� ��� : ���� ����, ���ڸ� �Է��ϼž� �մϴ�."); // -> ����ڿ��� ������ �޽���
		} catch (ArrayIndexOutOfBoundsException e) { 
			//e.printStackTrace(); 
			//System.err.println("���� �޽��� : "+ e.getMessage());
			System.err.println("����ڿ� �ȳ� ��� : ����� ���ϰ��� �ϴ� ���� 2�� �Է��ϼ���.");
		} finally {
			System.out.println("finally block"); 
		}

	}
}
