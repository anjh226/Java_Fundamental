package practice_self;

//public class practice_001 extends Thread {
//	public void run(){
//	}
//	public static void main(String[] args) {
//		practice_001 a = new practice_001();
//		a.start();
//	}
//}
// ���� ��ü�� ������ �� ���� ������, ��ũ�γ���� ����� �� ����

public class practice_001 implements Runnable {
	public void run(){
	}
	
	public static void main(String[] args) {
		practice_001 a = new practice_001();
		Thread t = new Thread(a);
		t.start();
		}
}



