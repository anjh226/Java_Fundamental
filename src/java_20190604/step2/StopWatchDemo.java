package java_20190604.step2;

public class StopWatchDemo {
	public static void main(String[] args) {
		StopWatch sw = new StopWatch();
		
		// 카운트 밀리
		sw.start();
		
		for (int i=0 ; i <2_200_000 ; i++) {	
		
		}
		sw.stop();
		System.out.println("경과시간(밀리세컨드) : "+sw.getElapsedTime());
		
		
		// 카운트 나노
		sw.startNano();
		for (int i=0 ; i <2_200_000 ; i++) {	
			
		}
		sw.stopNano();
		System.out.println("경과시간(나노세컨드) : "+sw.getElapsedNanoTime());
		
		
	}
}
