package java_20190529;

public class WhileDemo {
	public static void main(String[] args){
/*			
		// ���� �ð� ���� �� �ۼ�
		String a = "\""; 
		System.out.println(a);
			
		int b = 10; // b=10
		// b ++; // b=11
		
		int c = b++; // ��� : 11 ��� (������� : )
		// int c = ++b; // ��� : 12 ��� (������� : )
		
		System.out.println(b);
*/
		
/*		int sum2 = 0;
		int i2 = 0;
		
		for ( ; i2 <= 100 ; i2++ ){
			if (i2%2==1){			
				sum2 = sum2 + i2;
			}			
		}
		System.out.println("1���� 100���� Ȧ���� ���� : "+sum2);
		*/
/*		
		int i = 0;
		int sum = 0;
		
		while(i<=100){
			sum += i;
			i ++;
		}
		System.out.println("1~100������ �� : "+ sum);
		*/

		// Ȧ�� �� X  �ڡڡڡ�
		int i = 0;
		int sum = 0;
		
		while(i<=100){
			sum+=i;
			i++;

		}
		System.out.println("1~100 Ȧ�� �� : "+ sum);		
	
		// ������ O
		int j=2;
		while (j<=9){
			int k=1;
			while(k<=9){
				System.out.println(j+"*"+k+"="+(j*k));
				k++;
			}			
			j++;	
		}
		
		
	}	
}
