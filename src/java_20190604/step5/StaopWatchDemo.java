package java_20190604.step5;

// Ŭ���̾�Ʈ
public class StaopWatchDemo {
	
	public static void execute (StopWatch smn){ 	// �߻� Ŭ������ ���������� (ȣ��Ǵ� ���� ��ü(�Ű�����)�� ���� ����Ǵ� �����̳� ��� ����� �޶���.
		smn.start();
		for (int i=0 ; i < 2_000_000_000l ; i++) {
		
		}
		smn.stop();
		System.out.println("��� �ð� : " + smn.getElapsedTime()); //
	}
		
	public static void main(String[] args) {
		
		// �и�
		StopMilliWatch sm = new StopMilliWatch();
		execute (sm);	
		
		// ����
		StopNanoWatch sn = new StopNanoWatch();
		execute (sn);	
		
		// (�ű� �߰�) ����ũ�� ������ -> Demo(Ŭ���̾�Ʈ ��)�� �ڵ� �߰� & �ش� sub Class ������ �ϸ� �߰����� ���� ���� ����. 
		/* StopMocroWatch smw = new StopMicroWatch();
		execute (smw); */			
	}

}
