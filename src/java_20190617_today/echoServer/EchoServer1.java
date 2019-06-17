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

public class EchoServer1 {
	private int port;
	private ServerSocket serverSocket;
	
	public EchoServer1 (int port) {
		this.port = port;
		
		//1. �������� ��ü�� �����Ѵ�.
		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			

		//2. ����������  accept() �޼���� Ŭ���̾�Ʈ ������ ����Ѵ�.
		try {
			Socket socket = serverSocket.accept();
						
			//
			InetAddress ia = socket.getInetAddress();
			String ip = ia.getHostAddress();
			System.out.println(ip + " �����߽��ϴ�.");
			// 4.5  Ŭ���̾�Ʈ�� TCP Ŀ�ؼ��� ����� ���鼭 Ŭ���̾�Ʈ�� ����� �� �ִ� ���� ��ü�� �����ȴ�.
			
			//7. Ŭ���̾�Ʈ�� ���� �޽����� �޴´�. 
			InputStream in = socket.getInputStream();
			
			//7-1.
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);
			String readLine = br.readLine();
			System.out.println(readLine);
						
			// 8. ���� �޽����� �ٽ� Ŭ���̾�Ʈ���� ������.
			OutputStream out = socket.getOutputStream();
						
			// 8-1.
			OutputStreamWriter osw = new OutputStreamWriter(out);
			BufferedWriter bw = new  BufferedWriter(osw);
			bw.write(readLine);
			bw.newLine();
			bw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	
	public static void main(String[] args) {
		new EchoServer1(3001);
	}

}
