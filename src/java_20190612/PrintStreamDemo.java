package java_20190612;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;

		try {
			
			fis = new FileInputStream("C:\\down\\jre-8u211-windows-x64.exe");
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream("C:\\down\\2019\\jre_test.exe");
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos, true); // true => autoFlush (Flush 처리 할 필요 없음)
			
			int readByteCount = 0;
			byte[] readBytes = new byte [1024];
			while ((readByteCount = bis.read(readBytes)) != -1){
				ps.write(readBytes, 0, readByteCount);
			}
			
			
			// + printStream의 목적지를 모니터로 (= System.out.println();)
			PrintStream ps1 = System.out;
			ps1.println(1);
			ps1.println("문자열");
			ps1.println(42.5);
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) fis.close();
				if (bis != null) bis.close();
				if (fos != null) fos.close();
				if (bos != null) bos.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		
		}
	}
}
