package java_20190604.step2;

public class StopWatchDemo {
	public static void main(String[] args) {
		StopWatch sw = new StopWatch();
		
		// ī��Ʈ �и�
		sw.start();
		
		for (int i=0 ; i <2_200_000 ; i++) {	
		
		}
		sw.stop();
		System.out.println("����ð�(�и�������) : "+sw.getElapsedTime());
		
		
		// ī��Ʈ ����
		sw.startNano();
		for (int i=0 ; i <2_200_000 ; i++) {	
			
		}
		sw.stopNano();
		System.out.println("����ð�(���뼼����) : "+sw.getElapsedNanoTime());
		
		
	}
}
