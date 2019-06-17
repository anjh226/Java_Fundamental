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
		// Ŭ���̾�Ʈ ���� accept �غ�
		
			try {
				Socket socket = serversocket.accept();
					
				// in stream -- Ŭ���̾�Ʈ�� ������ �޽����� �ޱ�
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in);
				BufferedReader br = new BufferedReader(isr);
				String readLine = br.readLine();
				
				System.out.println(readLine);
						
				// out stream -- ���� �޽����� �ٽ� Ŭ���̾�Ʈ���� ������
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
