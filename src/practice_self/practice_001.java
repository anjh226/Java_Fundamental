package practice_self;

//public class practice_001 extends Thread {
//	public void run(){
//	}
//	public static void main(String[] args) {
//		practice_001 a = new practice_001();
//		a.start();
//	}
//}
// 같은 객체를 공유할 수 없기 때문에, 싱크로나이즈를 사용할 수 없음

public class practice_001 implements Runnable {
	public void run(){
	}
	
	public static void main(String[] args) {
		practice_001 a = new practice_001();
		Thread t = new Thread(a);
		t.start();
		}
}



