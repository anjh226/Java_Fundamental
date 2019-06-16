package java_20190604.step5;

public abstract class StopWatch {
	
	public long startTime;
	public long endTime; // 인터페이스에는 변수 불가함 따라서 인터페이스로 못 뺌.
	
	public abstract void start();
	public abstract void stop();
	public abstract double getElapsedTime(); // 
}
