package java_20190612;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrinteWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			fr = new FileReader("C:\\down\\HelloWorld.java");
			br = new BufferedReader (fr);
			
			fw = new FileWriter("C:\\down\\2019\\HelloWorld2.java");
			bw = new BufferedWriter(fw);
			pw = new PrintWriter (bw, true);
			
			String readLine = null;
			while ((readLine = br.readLine()) != null){
				pw.println(readLine);
				System.out.println(readLine);
			}
			
		} catch (IOException e){
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) fr.close();
				if (br != null) br.close(); 
				if (fw != null) fw.close();
				if (bw != null) bw.close();
				if (pw != null) pw.close();
				
			} catch( IOException e){
				e.printStackTrace();
			}
	
		}

	}
}