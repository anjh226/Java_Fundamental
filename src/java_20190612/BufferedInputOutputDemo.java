package java_20190612;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class BufferedInputOutputDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream ("C:\\down\\Git-2.21.0-64-bit.exe");
			// stream chaining : ���۵�OO��Ʈ���� ����OO��Ʈ���� �־��ִ� �۾�
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream("C:\\down\2019\\Git-2.21.0-64-bit.exe");
			// stream chaining
			bos = new BufferedOutputStream(fos);
			
			int readByteCount = 0;
			byte[] readBytes = new byte[1024];
			while((readByteCount = bis.read(readBytes)) != -1){
				bos.write(readBytes, 0, readByteCount);
			}
			bos.flush(); // -> .flush(); : ���۵�ƿ���Ʈ�� ����, �������� flush �Ͽ�, ���۰����� ä���� ���� �ܿ� �����ͱ��� ����� ��� �����Ͱ� write �ǵ��� ó���� ��� ��. while �� �ۿ��� �������� �� ���� ó���� ������.
			
		} catch (IOException e) {
			// TODO: handle exception
		} finally {
			try {
				if (fis != null) fis.close();
				if (bis != null) bis.close();
				if (fos != null) fis.close();
				if (bos != null) bis.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
	}

}
