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
			// stream chaining : 버퍼드OO스트림에 파일OO스트림을 넣어주는 작업
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream("C:\\down\2019\\Git-2.21.0-64-bit.exe");
			// stream chaining
			bos = new BufferedOutputStream(fos);
			
			int readByteCount = 0;
			byte[] readBytes = new byte[1024];
			while((readByteCount = bis.read(readBytes)) != -1){
				bos.write(readBytes, 0, readByteCount);
			}
			bos.flush(); // -> .flush(); : 버퍼드아웃스트림 사용시, 마지막에 flush 하여, 버퍼공간을 채우지 못한 잔여 데이터까지 비워서 모든 데이터가 write 되도록 처리해 줘야 함. while 문 밖에서 마지막에 한 번만 처리해 마무리.
			
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
