package java_20190612;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class InputStreamReaderDemo {
	
public static void main(String[] args) {
	InputStream in = null;
	InputStreamReader ir = null;
	BufferedReader br = null;
	
	FileWriter fw = null;
	BufferedWriter bw = null;
	PrintWriter pw = null;

	 try {
		 fw = new FileWriter ("C:\\down\\temp.txt", true);
		 bw = new BufferedWriter (fw);
		 pw = new PrintWriter (bw, true);
		 
		 boolean isStop = false;
		 while (!isStop) {
			 // Ű����� �Է��� ����. �ٽ� ���ؼ� InputStream�� ����� �� Source(���)�� �⺸���� ��� 
			 in = System.in;
			 // 1����Ʈ �Է� ��Ʈ���� 2���̵� �Է� ��Ʈ���� ��ȯ
			 ir = new InputStreamReader(in);
			 br = new BufferedReader(ir);
			 System.out.println("�Է��ϼ���>");
			 String readLine = br.readLine();
			 if(readLine.equals("exid")){
				 isStop = true;
			 } else {
				 pw.println(readLine);
			 }
		 }
		 
		 
		 } catch (IOException e) {
			 e.printStackTrace();
		 } finally {
		 
			try {
			if (in != null) in.close();
			if (ir != null) ir.close();
			if (br != null) br.close();
			if (fw != null) fw.close();
			if (bw != null) bw.close();
			if (pw != null) pw.close();	
				
		} catch  (IOException e) {
			 e.printStackTrace();
		} 
	}
	
}
}