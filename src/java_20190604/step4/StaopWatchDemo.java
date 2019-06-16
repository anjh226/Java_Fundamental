package java_20190604.step4;

public class StaopWatchDemo {

	// �и�
	public static void execute (StopMilliWatch sm){
		sm.start();		
		for (int i=0 ; i < 200_000_000l ; i++) {
		
		}
		sm.start();
		System.out.println("����� �ð�(�и�������) : " + sm.getElapsedTime());
	}
	// ����
	public static void execute (StopNanoWatch sn){
		sn.start();		
		for (int i=0 ; i < 200_000_000l ; i++) {
		
		}
		sn.start();
		System.out.println("����� �ð�(���뼼����) : " + sn.getElapsedTime());
	}
	
	public static void main(String[] args) {
		
		// �и�
		StopMilliWatch sm = new StopMilliWatch();
		execute (sm);	
		
		// ����
		StopNanoWatch sn = new StopNanoWatch();
		execute (sn);	
	}

}
