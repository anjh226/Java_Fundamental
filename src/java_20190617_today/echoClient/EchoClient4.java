package java_20190617_today.echoClient;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient4 {
	private String ip;
	private int port; 
	
	private Socket socket;
		
	public EchoClient4 (String ip, int port) {
		// ȣ���� ��ü�� ������ �Ű����� �� �Ҵ�.
		this.ip = ip;
		this.port = port;
		
		// 1) Ŭ���̾�Ʈ ���� ����
		try {
		
			socket = new Socket(ip, port);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		
		//2) ������ out 

		//3) �����κ��� IN

		//+ ���� ó��
	
	}
	
	public static void main(String[] args) {
		new EchoClient4 ("ip", 000);		
	}	
	

}
