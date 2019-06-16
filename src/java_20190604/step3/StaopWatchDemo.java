package java_20190604.step3;

public class StaopWatchDemo {
	
	
	public static void main(String[] args) {
		
		// 밀리
		StopMilliWatch sm = new StopMilliWatch();
		sm.start();
		
		for (int i=0 ; i < 200_000_000l ; i++) {
		
		}
		sm.start();
		System.out.println("경과된 시간(밀리세컨드) : " + sm.getElapsedTime());
		
		// 나노
		StopNanoWatch sn = new StopNanoWatch();
		sn.start();
		
		for (int i=0 ; i < 200_000_000l ; i++) {
		
		}
		sn.start();
		System.out.println("경과된 시간(나노세컨드) : " + sn.getElapsedTime());
	}

}
