package java_20190611_m;

public class RunnableDemo implements Runnable { // implements Runnable -> run메소드를 오버라이딩 해야 함.

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0; i<100; i++){
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " : "+i);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("******start******");
		RunnableDemo r1 = new RunnableDemo ();
		Thread t1 = new Thread(r1, "첫번째 쓰레드"); // Thread(t1)에는 implements Runnable (러너블 인터페이스를 임플리먼츠 한)한 객체가 들어야야 함. 해당 객체를 start가 실행함.
		System.out.println("첫번째 쓰레드 우선순위 : "+ t1.getPriority());
		t1.start(); // 러너블 임플리먼츠 하지 않으면 start는 Thread 클래스의 run을 실행함. (오버라이딩 한 이 클래스의 run이 아니라) 
		
		RunnableDemo r2 = new RunnableDemo();
		Thread t2 = new Thread (r2, "두번째 쓰레드");
		System.out.println("두번째 쓰레드 우선순위 : "+ t2.getPriority());
		
		// t2.setPriority(Thread.MIN_PRIORITY);
		// Thread.sleep(1000);
		t2.start();
		
		System.out.println("******end******");
	}

}
