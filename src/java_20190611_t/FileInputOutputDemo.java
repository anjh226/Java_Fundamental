package java_20190611_t;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputDemo {
	public static void main(String[] args) {
		
		FileInputStream fin = null;
		FileOutputStream fos = null;
		// try �ۿ� ���������Ƿ� ���ο� �� ���� ���ʿ�
		
		try {
			//FileInputStream�� c:\\down\\jdk.exe ��ο� ������ ������ 
			//FileNotFoundException ���ܸ� �߻���Ų��.
			
		
			FileInputStream fin = new FileInputStream(
					"c:\\down\\jdk.exe");
		
			
			//FileOutputStream�� C:\\down\\2019\\06\\11\\jdk.exe 
			//���� ��ο� ���丮�� ������ ���丮 �� ������ �������ش�.
			
			FileOutputStream fos = new FileOutputStream(
					"C:\\down\\2019\\06\\11\\jdk.exe");
			
			
/*			int readByte =0;
			//fin.read() �޼���� �� ����Ʈ�� �д´�. 
			//���� ���̻� ���� ����Ʈ�� ������ -1�� ��ȯ�Ѵ�.
			while((readByte = fin.read()) != -1){
				//fos.writer(readByte) �޼���� �� ����Ʈ�� ��
				fos.write(readByte);
			}*/
			
			long start = System.currentTimeMillis();
	
			// read(byte b[]) �迪�� 
			int readByteCount = 0;
			byte[] readBytes = new byte[10240]; // �ӵ��� ���� �׽�Ʈ -- ���� �� �̻����δ� ���̻� �ӵ� ���� X
			while ((readByteCount = fin.read(readBytes)) != -1 ){
				fos.write(readBytes, 0, readByteCount);
			}
			
			
		} catch (FileNotFoundException e) { // �Ʒ� IOException �� �θ��̹Ƿ� �� catch�� �� �ᵵ �۵� ����. 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { // finally���� IO �ݱ�. IO ó�� �ÿ��� throws ��� ���. close�� �Ұ��ϹǷ�. IO, DB, ��Ʈ��ũ�� ���� �� �ݾƾ� ��. 
			try {
				if (fin != null) fin.close();
				if (fos != null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

	private static FileOutputStream FileOutputStream(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}





