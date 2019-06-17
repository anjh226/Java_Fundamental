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
			//서버 소캣 생성 -> 클라이언트의 접속을 accept 대기
			Socket socket = serversocket.accept();
			
			// (+)  접속한 클라이언트의 IP get & 접속했음을 안내 메시지 출력
			InetAddress ia = socket.getInetAddress();
			String ip = ia.getHostAddress();
			System.out.println("클라이언트가 접속 하였습니다. (IP :" + ip);
			
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
			bw.write(readLine); // 클라이언트가 보낸 메시지를 readLine 에 할당했음. 이를 그대로 다시 클라이언트에 전송 or 다른 메시지를 직접 "" 작성
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
