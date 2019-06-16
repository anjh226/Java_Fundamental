package java_20190611_m;

public class RunnableDemo implements Runnable { // implements Runnable -> run�޼ҵ带 �������̵� �ؾ� ��.

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
		Thread t1 = new Thread(r1, "ù��° ������"); // Thread(t1)���� implements Runnable (���ʺ� �������̽��� ���ø����� ��)�� ��ü�� ���߾� ��. �ش� ��ü�� start�� ������.
		System.out.println("ù��° ������ �켱���� : "+ t1.getPriority());
		t1.start(); // ���ʺ� ���ø����� ���� ������ start�� Thread Ŭ������ run�� ������. (�������̵� �� �� Ŭ������ run�� �ƴ϶�) 
		
		RunnableDemo r2 = new RunnableDemo();
		Thread t2 = new Thread (r2, "�ι�° ������");
		System.out.println("�ι�° ������ �켱���� : "+ t2.getPriority());
		
		// t2.setPriority(Thread.MIN_PRIORITY);
		// Thread.sleep(1000);
		t2.start();
		
		System.out.println("******end******");
	}

}
