package java_20190617_today.echoServer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	private int port;
	private ServerSocket serversocket;	
	
	public EchoServer(int port){
		this.port = port;	
		try {
			// 1. ServerSocket�� ���� �Ѵ�.
			serversocket = new ServerSocket(port);			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while (true) {
			System.out.println("Ŭ���̾�Ʈ ������ ����ϰ� �ֽ��ϴ�.");
			
			
			try {
				// 2. Ŭ���̾�Ʈ ������ ��� �Ѵ�.
				Socket socket = serversocket.accept();

				
				// 5. 7 Ŭ���̾�Ʈ�� ����� �� �ִ� ������ ����
				
				InetAddress ia = socket.getInetAddress();
				String ip = ia.getHostAddress();
				System.out.println("Ŭ���̾�Ʈ�� �����Ͽ����ϴ�. IP :" + ip);
				
				// 9. Ŭ���̾�Ʈ�� ����� �� �ִ� in, out ��Ʈ�� ���� 
				InputStream in = socket.getInputStream(); // Ŭ���̾�Ʈ�� ���� ������, ���������� in ��Ʈ�� ���� ����
				InputStreamReader isr = new InputStreamReader(in);
				BufferedReader br = new BufferedReader(isr);
				String readLine = br.readLine();
				System.out.println(readLine);
								
				OutputStream out = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(out);
				BufferedWriter bw = new BufferedWriter(osw);
				bw.write(readLine); // �ڡڡڡ�
				bw.newLine(); // ���� ������ �ٿ� ������.
				bw.flush(); // ���� �뷮�� �� �� ���� ������.
							
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new EchoServer(3000);
	}

}
