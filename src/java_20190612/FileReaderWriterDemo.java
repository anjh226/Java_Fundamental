package java_20190612;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("C:\\down\\HelloWorld.java");
			fw = new FileWriter("C:\\down\\2019\\HelloWorld2.java");
			/*
			// 한 개의 문자를 읽어서 한 개의 문자를 출력하는 예제
			int readChar = 0;
			while((readChar = fr.read()) != -1){
				System.out.print((char)readChar);
				fw.write(readChar);

			*/
		
			// 여러개의 문자(char 배열)을 읽어서 여러개의 문자(char 배열)를 출력하는 예제
			
			int readCharCount = 0;
			char[] readChars = new char[10];
			while ((readCharCount = fr.read(readChars))  != -1){
				System.out.print(new String(readChars, 0, readCharCount));
				fw.write(readChars, 0, readCharCount);
			} 
	  
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if( fr != null ) fr.close();
				if( fw != null ) fw.close();				
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}
}
