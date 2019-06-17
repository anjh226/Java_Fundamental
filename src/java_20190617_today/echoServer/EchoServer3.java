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

public class EchoServer3 {
	private int port;
	private ServerSocket serversocket;
		
	public EchoServer3 (int port) {
		this.port = port;
		
		try {
			serversocket = new ServerSocket(port);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			//���� ��Ĺ ���� -> Ŭ���̾�Ʈ�� ������ accept ���
			Socket socket = serversocket.accept();
			
			// (+)  ������ Ŭ���̾�Ʈ�� IP get & ���������� �ȳ� �޽��� ���
			InetAddress ia = socket.getInetAddress();
			String ip = ia.getHostAddress();
			System.out.println("Ŭ���̾�Ʈ�� ���� �Ͽ����ϴ�. (IP :" + ip);
			
			// in
			InputStream in = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);
			String readLine = br.readLine();
			System.out.println(readLine);			
			
			// out
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write(readLine); // Ŭ���̾�Ʈ�� ���� �޽����� readLine �� �Ҵ�����. �̸� �״�� �ٽ� Ŭ���̾�Ʈ�� ���� or �ٸ� �޽����� ���� "" �ۼ�
			bw.newLine();
			bw.flush();		
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new EchoServer3(3003);
	}
}
