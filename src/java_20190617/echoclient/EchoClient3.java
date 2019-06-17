package java_20190617.echoclient;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient3 {
	private String ip;
	private int port;	
	private Socket socket;
	
	public EchoClient3 (String ip, int port) {
		this.ip = ip;
		this.port = port;
		
		try {
			socket = new Socket(ip, port);
			
			// out
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write("서버에 전송할 메시지");
			bw.newLine();
			bw.flush();		
			
			// in
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
		new EchoClient3("192.168.0.159", 3002);
	}

}
