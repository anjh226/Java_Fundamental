package java_20190610;

public class ThreadDemo extends Thread { // Thread는  implements runnable 하고 있는 클래스
	public ThreadDemo (String msg){
		super(msg);	
		// ㄴ> thread 클래스의 매개변수가 문자열인 생성자를 호출
		// msg는 스레드 이름을 정한다. (없을 경우, 스레드명 자동 생성 됨)
	}
	public void run() {
		for(int i =0; i<100; i++){
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " : "+i);
		}
	}
	public static void main (String[] args){
		System.out.println("*********** start ***********");
		ThreadDemo t1 = new ThreadDemo("firts thread");
		t1.start();
		
		ThreadDemo t2 = new ThreadDemo("Second thread");
		t2.start();
		System.out.println("*********** end ***********");
	}
}
