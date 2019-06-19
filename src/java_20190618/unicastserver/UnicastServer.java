package java_20190618.unicastserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class UnicastServer {
	private ServerSocket severSocket;
	public UnicastServer (int port) {
		try {
			severSocket = new ServerSocket(port);
		} catch (IOException e) {
			System.out.println(port + "��ȣ�� ����ϰ� �ֽ��ϴ�.");
			e.printStackTrace();
			System.exit(0);		
		}
		
		UnicastServerThread ust = null;
		
		while(true) {
			System.out.println("Ŭ���̾�Ʈ ������ ����ϰ� �ֽ��ϴ�.");
			Socket socket = null; 

			try {
				socket = severSocket.accept();
				System.out.println("Client ip: "+ socket.getInetAddress().getHostAddress());
				ust = new UnicastServerThread(socket);
				Thread t = new Thread(ust);
				t.start();

			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

	public static void main(String[] args) {
		/*UnicastServer us =*/ new UnicastServer(3002); // ���� ���ʿ�, ��ü ������ �ϸ� �ǹǷ� new ��ü �������ϰ� ���� �Ҵ��� �� ��. 
		
	}

}