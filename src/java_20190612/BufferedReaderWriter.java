package java_20190612;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriter {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try{
			fr = new FileReader ("C:\\down\\HelloWorld.java");
			br = new BufferedReader(fr);
			fw = new FileWriter ("C:\\down\\2019\\HelloWorld2.java");
			bw = new BufferedWriter(fw);

			String readLine = null;
			
			// br.readLine() : 한 줄 씩 불러오나, 개행이 포함되지 않음. 

			while ((readLine = br.readLine()) != null) {
				bw.write(readLine);
				bw.newLine(); // <- 개행 해줌. (없으면 Write 파일 열었을때 개행 안 되어 있고 붙어 있음) 	
			}
			bw.flush();
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
				try {
					if( fr != null ) fr.close();
					if( fw != null ) fw.close();
					if( br != null ) fr.close();
					if( bw != null ) fw.close();
					
				} catch (IOException e2) {
					e2.printStackTrace();
				}
		}	
			
		}
		
		
		
	
	
	}

