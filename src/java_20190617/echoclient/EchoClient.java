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
			// 3. 4. 소켓 객체를 생성한다. 
			socket = new Socket(ip, port);
			// 7. 서버와 통신할 수 있는 소켓 객체 생성
			
			
			// 8. 서버와 통신할 수 있는 in, out 스트림 생성 
			OutputStream out = socket.getOutputStream(); // 클라리언트가 먼저 씀으로, Out 부터 생성
			OutputStreamWriter osw = new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write("안녕하세요!! 저는 안지혜 입니다."); // 개행이 없으므로 bufferedRead가 읽을 수 없음. 따라서 개행을 넣어야 함 (newLine)			
			bw.newLine(); // 끝에 개행을 붙여 보내라.
			bw.flush(); // 버퍼 용량이 다 안 차도 보내라.
			
			
			InputStream in = socket.getInputStream(); // out 하고 여기서 서버에서 올 steam을 여기서 대기
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


// 192.168.0.159 -- 선생님 
// 167 -- 
