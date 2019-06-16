package java_20190612;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputTest {
	public static void main(String[] args) {
		FileInputStream fin = null; // ☆☆
		FileOutputStream fos = null; // ☆☆
		
		try {
			
			fin = new FileInputStream ("C:\\down\\Git-2.21.0-64-bit.exe");
			fos = new FileOutputStream("C:\\down\2019\\Git-2.21.0-64-bit.exe");
			
			long start = System.currentTimeMillis();
			int readByteCount = 0;
			byte[] readBytes = new byte[102400];
			while ((readByteCount = fin.read(readBytes)) != -1){  // ::  read 결과가 -1 이 되면 더 이상 읽어올 데이터가 없다는 것.
				fos.write(readBytes, 0, readByteCount);
			} 
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace(); // ★ : 오류 메시지 출력 (... 개발자용)
		} catch (IOException e) {
			// TODO: handle exception	
			e.printStackTrace();
		} finally {
			try {
				
			} catch () {
				// TODO: handle exception
			}
		}
				
	}
	
	

}
