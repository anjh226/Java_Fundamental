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
			// 1. ServerSocket을 생성 한다.
			serversocket = new ServerSocket(port);			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while (true) {
			System.out.println("클라이언트 접속을 대기하고 있습니다.");
			
			
			try {
				// 2. 클라이언트 접속을 대기 한다.
				Socket socket = serversocket.accept();

				
				// 5. 7 클라이언트와 통신할 수 있는 소켓을 생성
				
				InetAddress ia = socket.getInetAddress();
				String ip = ia.getHostAddress();
				System.out.println("클라이언트가 접속하였습니다. IP :" + ip);
				
				// 9. 클라이언트와 통신할 수 있는 in, out 스트림 생성 
				InputStream in = socket.getInputStream(); // 클라이언트가 먼저 씀으로, 서버에서는 in 스트림 부터 생성
				InputStreamReader isr = new InputStreamReader(in);
				BufferedReader br = new BufferedReader(isr);
				String readLine = br.readLine();
				System.out.println(readLine);
								
				OutputStream out = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(out);
				BufferedWriter bw = new BufferedWriter(osw);
				bw.write(readLine); // ★★★★
				bw.newLine(); // 끝에 개행을 붙여 보내라.
				bw.flush(); // 버퍼 용량이 다 안 차도 보내라.
							
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new EchoServer(3000);
	}

}
