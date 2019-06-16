package java_20190604.step1;
// 요구사항
// 1. 밀리 세컨드로 경과 시간을 만들어 주세요.
// 이 요구사항은 변경될 수 있음. -> 추가 수정 요구사항 : 나노세컨드 추가, 밀리~나노 선택하게 해주세요.

public class FootStopWatch {
	public long startTime;
	public long endTime;
	
	public double getElapsedTime(){
		return (double) (endTime - startTime) / (double) 1000;
	}
	
	public static void mian(String[] args) {
		FootStopWatch f = new FootStopWatch();
		f.startTime = System.currentTimeMillis(); // currentTimeMillis() : 1970년 1월 1일 부터 지금까지의 시간을 밀리세컨드로 반환한다.
		
		for (int i=0 ; i <2_200_000_000l ; i++) {
		
		}
		f.endTime = System.currentTimeMillis();
		
		double elapsedTime = f.getElapsedTime();		
		System.out.println("경과된 시간 : " + elapsedTime); 
	}
}
