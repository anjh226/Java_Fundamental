package java_20190604.step1;
// 요구사항
// 추가 수정 요구사항 : 나노세컨드 추가, 밀리~나노 선택하게 해주세요. --> 추가 요구사항 : 마이크로 등등등 ...

public class FootStopWatch2 {
	public long startTime;
	public long endTime;
	
	public long startNanoTime;
	public long endNanoTime;
	
	public double getElapsedTime(){
		return (double) (endTime - startTime) / (double) 1000;
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
		System.out.println("경과된 시간(나노타임) : " + elapsedTime); 
	}
}
