package java_20190604.step5;

// 클라이언트
public class StaopWatchDemo {
	
	public static void execute (StopWatch smn){ 	// 추상 클래스의 폴리모피즘 (호출되는 실제 객체(매개변수)에 따라 수행되는 동작이나 출력 결과가 달라짐.
		smn.start();
		for (int i=0 ; i < 2_000_000_000l ; i++) {
		
		}
		smn.stop();
		System.out.println("경과 시간 : " + smn.getElapsedTime()); //
	}
		
	public static void main(String[] args) {
		
		// 밀리
		StopMilliWatch sm = new StopMilliWatch();
		execute (sm);	
		
		// 나노
		StopNanoWatch sn = new StopNanoWatch();
		execute (sn);	
		
		// (신규 추가) 마이크로 세컨드 -> Demo(클라이언트 부)에 코드 추가 & 해당 sub Class 생성만 하면 추가요정 쉽게 적용 가능. 
		/* StopMocroWatch smw = new StopMicroWatch();
		execute (smw); */			
	}

}
