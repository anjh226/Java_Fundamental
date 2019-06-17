package java_20190617.echoclient;

import java.net.Socket;

public class EchoClient4 {
	private String ip;
	private int port; 
	
	private Socket socket;
		
	public EchoClient4 (String ip, int port) {
		// 호출한 객체의 변수에 매개변수 값 할당.
		this.ip = ip;
		this.port = port;
		
		// 1) 클라이언트 소켓 생성
		socket = new Socket(ip, port);
		
				
		
		2) 서버에 out 

		3) 서버로부터 IN

		+ 예외 처리
	
	}
	
	public static void main(String[] args) {
		new EchoClient4 (ip, port);		
	}	
	

}
