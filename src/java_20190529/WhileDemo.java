package java_20190529;

public class WhileDemo {
	public static void main(String[] args){
/*			
		// 지난 시간 복습 중 작성
		String a = "\""; 
		System.out.println(a);
			
		int b = 10; // b=10
		// b ++; // b=11
		
		int c = b++; // 결과 : 11 출력 (연산순서 : )
		// int c = ++b; // 결과 : 12 출력 (연산순서 : )
		
		System.out.println(b);
*/
		
/*		int sum2 = 0;
		int i2 = 0;
		
		for ( ; i2 <= 100 ; i2++ ){
			if (i2%2==1){			
				sum2 = sum2 + i2;
			}			
		}
		System.out.println("1부터 100까지 홀수의 합은 : "+sum2);
		*/
/*		
		int i = 0;
		int sum = 0;
		
		while(i<=100){
			sum += i;
			i ++;
		}
		System.out.println("1~100까지의 합 : "+ sum);
		*/

		// 홀수 합 X  ★★★★
		int i = 0;
		int sum = 0;
		
		while(i<=100){
			sum+=i;
			i++;

		}
		System.out.println("1~100 홀수 합 : "+ sum);		
	
		// 구구단 O
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
