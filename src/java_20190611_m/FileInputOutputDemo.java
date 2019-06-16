package java_20190611_m;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileInputOutputDemo {
	public static void main(String[] args)  {
		FileInputStream fin;
		try {
			fin = new FileInputStream("C:\\down\\Git-2.21.0-64-bit.exe");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("C:\\down\\2019\\down\\Git-2.21.0-64-bit.exe"); // 파일 & 경로가 없다면 경로까지 생성
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int readByte = 0;
		while ((readByte = fin.read()) != -1) {
			fos.write(readByte);
		}
		
		
}

	}
