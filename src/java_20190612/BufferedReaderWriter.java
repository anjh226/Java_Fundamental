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
			
			// br.readLine() : �� �� �� �ҷ�����, ������ ���Ե��� ����. 

			while ((readLine = br.readLine()) != null) {
				bw.write(readLine);
				bw.newLine(); // <- ���� ����. (������ Write ���� �������� ���� �� �Ǿ� �ְ� �پ� ����) 	
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

