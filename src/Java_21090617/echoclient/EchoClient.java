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

public class EchoClient {
	private String ip;
	private int port;
	private Socket socket ;
	
	public EchoClient(String ip, int port) {
		this.ip = ip;
		this.port = port;
	
		try {
			// 3. 4. ���� ��ü�� �����Ѵ�. 
			socket = new Socket(ip, port);
			// 7. ������ ����� �� �ִ� ���� ��ü ����
			
			
			// 8. ������ ����� �� �ִ� in, out ��Ʈ�� ���� 
			OutputStream out = socket.getOutputStream(); // Ŭ�󸮾�Ʈ�� ���� ������, Out ���� ����
			OutputStreamWriter osw = new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write("�ȳ��ϼ���!! ���� ������ �Դϴ�."); // ������ �����Ƿ� bufferedRead�� ���� �� ����. ���� ������ �־�� �� (newLine)			
			bw.newLine(); // ���� ������ �ٿ� ������.
			bw.flush(); // ���� �뷮�� �� �� ���� ������.
			
			
			InputStream in = socket.getInputStream(); // out �ϰ� ���⼭ �������� �� steam�� ���⼭ ���
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
		new EchoClient("192.168.0.159", 3000);
	}
}


// 192.168.0.159 -- ������ 
// 167 -- 
