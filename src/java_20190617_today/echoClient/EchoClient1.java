package java_20190617_today.echoClient;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient1 {
	private String ip;
	private int port;
	private Socket socket;
	
	public EchoClient1 (String ip, int port){
		this.ip = ip;
		this.port = port;
		
		try {
		
		//1 . 
		socket = new Socket(ip, port);
		
		//6-1.
		OutputStream out = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(out);
		BufferedWriter bw = new BufferedWriter(osw);
		bw.write("안녕하세요"); 
		bw.newLine();
		bw.flush(); 
		
		// 서버로 부터 메시지를 받는다. 
		InputStream in = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		String readLine = br.readLine();
		System.out.println(readLine);

		} catch (UnknownHostException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	
	public static void main(String[] args) {
		
	}

}


