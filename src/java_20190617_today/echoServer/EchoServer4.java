package java_20190617_today.echoServer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer4 {
	private int port;
	private ServerSocket serversocket; 
	
	public EchoServer4 (int port){
		this.port = port;
		try {
			serversocket = new ServerSocket(port);
		} catch (IOException e) {
			e.printStackTrace();
		}

		while (true) {
		// 클라이언트 접속 accept 준비
		
			try {
				Socket socket = serversocket.accept();
					
				// in stream -- 클라이언트가 보내는 메시지를 받기
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in);
				BufferedReader br = new BufferedReader(isr);
				String readLine = br.readLine();
				
				System.out.println(readLine);
						
				// out stream -- 받은 메시지를 다시 클라이언트에게 보내기
				OutputStream out = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(out);
				BufferedWriter bw = new BufferedWriter(osw);
				bw.write(readLine);
				bw.newLine();
				bw.flush();	
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
	}
		
	public static void main(String[] args) {
		new EchoServer4 (3004); 
	}

}
