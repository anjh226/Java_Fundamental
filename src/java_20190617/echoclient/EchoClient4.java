package java_20190617.echoclient;

import java.net.Socket;

public class EchoClient4 {
	private String ip;
	private int port; 
	
	private Socket socket;
		
	public EchoClient4 (String ip, int port) {
		// ȣ���� ��ü�� ������ �Ű����� �� �Ҵ�.
		this.ip = ip;
		this.port = port;
		
		// 1) Ŭ���̾�Ʈ ���� ����
		socket = new Socket(ip, port);
		
				
		
		2) ������ out 

		3) �����κ��� IN

		+ ���� ó��
	
	}
	
	public static void main(String[] args) {
		new EchoClient4 (ip, port);		
	}	
	

}
