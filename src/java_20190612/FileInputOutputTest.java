package java_20190612;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputTest {
	public static void main(String[] args) {
		FileInputStream fin = null; // �١�
		FileOutputStream fos = null; // �١�
		
		try {
			
			fin = new FileInputStream ("C:\\down\\Git-2.21.0-64-bit.exe");
			fos = new FileOutputStream("C:\\down\2019\\Git-2.21.0-64-bit.exe");
			
			long start = System.currentTimeMillis();
			int readByteCount = 0;
			byte[] readBytes = new byte[102400];
			while ((readByteCount = fin.read(readBytes)) != -1){  // ::  read ����� -1 �� �Ǹ� �� �̻� �о�� �����Ͱ� ���ٴ� ��.
				fos.write(readBytes, 0, readByteCount);
			} 
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace(); // �� : ���� �޽��� ��� (... �����ڿ�)
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
