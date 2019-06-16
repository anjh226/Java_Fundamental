package java_20190611_t;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputDemo {
	public static void main(String[] args) {
		
		FileInputStream fin = null;
		FileOutputStream fos = null;
		// try 밖에 선언했으므로 내부에 새 선언 불필요
		
		try {
			//FileInputStream의 c:\\down\\jdk.exe 경로에 파일이 없으면 
			//FileNotFoundException 예외를 발생시킨다.
			
		
			FileInputStream fin = new FileInputStream(
					"c:\\down\\jdk.exe");
		
			
			//FileOutputStream은 C:\\down\\2019\\06\\11\\jdk.exe 
			//위의 경로와 디렉토리가 없으면 디렉토리 및 파일을 생성해준다.
			
			FileOutputStream fos = new FileOutputStream(
					"C:\\down\\2019\\06\\11\\jdk.exe");
			
			
/*			int readByte =0;
			//fin.read() 메서드는 한 바이트씩 읽는다. 
			//만약 더이상 읽을 바이트가 없으면 -1를 반환한다.
			while((readByte = fin.read()) != -1){
				//fos.writer(readByte) 메서드는 한 바이트씩 씀
				fos.write(readByte);
			}*/
			
			long start = System.currentTimeMillis();
	
			// read(byte b[]) 배역로 
			int readByteCount = 0;
			byte[] readBytes = new byte[10240]; // 속도로 성능 테스트 -- 일정 선 이상으로는 더이상 속도 단축 X
			while ((readByteCount = fin.read(readBytes)) != -1 ){
				fos.write(readBytes, 0, readByteCount);
			}
			
			
		} catch (FileNotFoundException e) { // 아래 IOException 가 부모이므로 이 catch는 안 써도 작동 가능. 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { // finally에서 IO 닫기. IO 처리 시에는 throws 사용 노노. close가 불가하므로. IO, DB, 네트워크는 열면 꼭 닫아야 함. 
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





