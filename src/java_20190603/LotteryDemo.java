package java_20190603;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LotteryDemo {
	
			// Ű����� �Է¹��� �� ���� ��ȯ�ϴ� �Լ�
			public static String console() throws IOException{
				BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
				return br.readLine();
			}
			
			public static void main (String[] args) throws IOException {
				Loterry lottery = new Lottery();						
				
				while(true){
					System.out.print("�ζ� ���� ������ �Է��ϼ���>");
					String readLine = console();
					if(readLine.equals("bye")) break;
					int count = Integer.parseInt(readLine);
					lottery.print(count);						
				}
				
				//
				
				if (data.length == 1){
							
				}
				else if (data.length == 2){	
				
				}
				else if (data.length == 3){	
				
				}
				else if (data.length == 4){	
				
				}
				else if (data.length == 5){
					
				} else
			
					
					
					
					
			}

}

			