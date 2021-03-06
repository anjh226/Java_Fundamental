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
			System.out.println(port + "번호를 사용하고 있습니다.");
			e.printStackTrace();
			System.exit(0);		
		}
		
		UnicastServerThread ust = null;
		
		while(true) {
			System.out.println("클라이언트 접속을 대기하고 있습니다.");
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
		/*UnicastServer us =*/ new UnicastServer(3002); // 재사용 불필요, 객체 생성만 하면 되므로 new 객체 생성만하고 변수 할당은 안 함. 
		
	}

}
