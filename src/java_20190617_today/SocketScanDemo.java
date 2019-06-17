package java_20190617_today;

import java.net.Socket;
import java.net.UnknownHostException;

public class SocketScanDemo extends Thread {

	public void run(){
		Socket s = null;
		for (int i= 20 ; i<200 ; i++){
			try {
				// Socket ��ü�� ���� �Ǿ��ٴ� ���� Host, port �� ����� �� �ֱ� ������ �ش� host, port�� ����� �̶�� �ǹ� ��.
				s = new Socket("183.111.174.34", i);
				System.out.println( i +"��ȣ�� ����� �Դϴ�."); // -> s ��ü ���� O -> �ش� ��Ʈ�� ���� �־(�����) �ش� ��Ʈ�� ����� �� �ִٴ� �ǹ� ��.
			} catch (UnknownHostException e) {
				System.out.println("�ش� ȣ��Ʈ�� �߸� �Ǿ����ϴ�.");
			} catch (Exception e) {
				System.out.println( i +"��ȣ�� ������� �ʰ� �ֽ��ϴ�.");
			}
		//	i++;
		}
		
		
	}
	
	public static void main(String[] args) {
		SocketScanDemo s = new SocketScanDemo();
		s.start();
	}
	
}
