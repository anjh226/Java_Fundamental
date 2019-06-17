package java_20190617_today;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerSocketScanDemo extends Thread {
		
	@Override
	public void run() {
		ServerSocket s = null;
		for (int i = 0; i < 65535; i++) {
			try {
				// ServerSocket Ŭ������ �ش� ������ port ��ȣ�� ����� �� ������ ServerSocket ��ü�� ������ �� �ְ�, ���ڸ� �ٷ��ϴ� ���� �ش� port�� ����ϴ� ����̴�.
				s = new ServerSocket(i); 				
				
				// �� ���� �ϳ��� accept �� �� �����Ƿ�. accept �� Thread�� ó���ϴ� �� ����
				// Socket socket = s.accept();
				
			} catch (IOException e) {
				System.out.println( i + "��ȣ�� ����� �� �����ϴ�.");
			}
		}
	}

	public static void main(String[] args) {
		ServerSocketScanDemo s = new ServerSocketScanDemo();
		s.start();
	}
}
