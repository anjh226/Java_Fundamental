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
		
		//1. 서버소켓 객체를 생성한다.
		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			

		//2. 서버소켓의  accept() 메서드로 클라이언트 접속을 대기한다.
		try {
			Socket socket = serverSocket.accept();
						
			//
			InetAddress ia = socket.getInetAddress();
			String ip = ia.getHostAddress();
			System.out.println(ip + " 접속했습니다.");
			// 4.5  클라이언트와 TCP 커넥션이 만들어 지면서 클라이언트와 통신할 수 있는 소켓 객체가 생성된다.
			
			//7. 클라이언트로 부터 메시지를 받는다. 
			InputStream in = socket.getInputStream();
			
			//7-1.
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);
			String readLine = br.readLine();
			System.out.println(readLine);
						
			// 8. 받은 메시지를 다시 클라이언트에게 보낸다.
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
