package java_20190604.step3;

public class StaopWatchDemo {
	
	
	public static void main(String[] args) {
		
		// �и�
		StopMilliWatch sm = new StopMilliWatch();
		sm.start();
		
		for (int i=0 ; i < 200_000_000l ; i++) {
		
		}
		sm.start();
		System.out.println("����� �ð�(�и�������) : " + sm.getElapsedTime());
		
		// ����
		StopNanoWatch sn = new StopNanoWatch();
		sn.start();
		
		for (int i=0 ; i < 200_000_000l ; i++) {
		
		}
		sn.start();
		System.out.println("����� �ð�(���뼼����) : " + sn.getElapsedTime());
	}

}
