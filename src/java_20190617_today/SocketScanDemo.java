package java_20190617_today;

import java.net.Socket;
import java.net.UnknownHostException;

public class SocketScanDemo extends Thread {

	public void run(){
		Socket s = null;
		for (int i= 20 ; i<200 ; i++){
			try {
				// Socket 객체가 생성 되었다는 얘기는 Host, port 로 통신할 수 있기 때문에 해당 host, port를 사용중 이라는 의미 임.
				s = new Socket("183.111.174.34", i);
				System.out.println( i +"번호를 사용중 입니다."); // -> s 객체 생성 O -> 해당 포트가 열려 있어서(사용중) 해당 포트를 사용할 수 있다는 의미 임.
			} catch (UnknownHostException e) {
				System.out.println("해당 호스트가 잘못 되었습니다.");
			} catch (Exception e) {
				System.out.println( i +"번호를 사용하지 않고 있습니다.");
			}
		//	i++;
		}
		
		
	}
	
	public static void main(String[] args) {
		SocketScanDemo s = new SocketScanDemo();
		s.start();
	}
	
}
