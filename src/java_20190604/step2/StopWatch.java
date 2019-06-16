package java_20190604.step2;

import java_20190604.step1.FootStopWatch2;

public class StopWatch {
	   
	// �и� ������
	public long startTime;
	public long endTime;
	
	public void start(){
		startTime = System.currentTimeMillis();
	}
	public void stop(){
		endTime = System.currentTimeMillis();
	}
	public double getElapsedTime(){
		return (double) (endTime - startTime) / (double) 1000;
	}

	// ���� ������
	public long startNanoTime;
	public long endNanoTime;
		
	public void startNano(){
		startTime = System.nanoTime();
	}
	public void stopNano(){
		endTime = System.nanoTime();
	}
	public double getElapsedNanoTime(){
		return (double) (endNanoTime - startNanoTime) / (double) 1000000000;
	}
	
	
	
	public static void mian(String[] args) {
		FootStopWatch2 f = new FootStopWatch2();
		f.startNanoTime = System.nanoTime();
		
		for (int i=0 ; i <2_200_000_000l ; i++) {
		
		}
		f.endTime = System.nanoTime();
		
		double elapsedTime = f.getElapsedNanoTime();		
		System.out.println("����� �ð�(����Ÿ��) : " + elapsedTime); 
	}
	
}
