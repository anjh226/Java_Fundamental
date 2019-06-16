package java_20190610;

public class ThreadDemo extends Thread { // Thread��  implements runnable �ϰ� �ִ� Ŭ����
	public ThreadDemo (String msg){
		super(msg);	
		// ��> thread Ŭ������ �Ű������� ���ڿ��� �����ڸ� ȣ��
		// msg�� ������ �̸��� ���Ѵ�. (���� ���, ������� �ڵ� ���� ��)
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
