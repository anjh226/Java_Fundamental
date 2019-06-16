package java_20190528;

public class ForDemo {
	public static void main(String[] args){
		
/*		int sum = 0;
		int i = 0;
		int max = 100;
		
		for (초기값은 for 블럭 밖으로 빼돟 OK; i <= max; i++ ){
			sum = sum + i;
		}
		// System.out.println("1부터"+(i-1)+"까지 합은 : "+sum);
		System.out.println("1부터"+max+"까지 합은 : "+sum);
		
	    // for 반복문 초보는 작성 전 시뮬레이션&수기 계산 해볼 것.
		
		
		// 1~100까지 홀수만 더하자
		int sum2 = 0;
		int i2 = 0;
		
		for ( ; i2 <= 100 ; i2++ ){
			if (i2%2==1){			
				sum2 = sum2 + i2;
			}			
		}
		System.out.println("1부터 100까지 홀수의 합은 : "+sum2);
		
		// 구구단 출력
		for(int j=2 ; j<=9; j++){
				for(int k=1; k<=9; k++){
					System.out.println(j+"*"+k+"="+(j*k));
				}
		}*/
		
		
		// 1~100까지 소수 개수 구하기
		/*for(int m=1 ; m<=100; m++){
			for(int z=1 ; z<=(m-1); z++) {
				if(m%z==1 && m%z==m){
				} 
			}
		}
		*/
		
		// 소수 출력 & 소수 갯수 구하기
		int primeCount = 0;
		for (int a=2; a<=100; a++){
			int count = 0;
			for(int k=2; k<a; k++){
				if(a%k==0){
					count +=1;
					break; // ★★ ★   다른 수로 1회 이상 나누어지는 순간 더이상 소수일 가능성이 업음으로 연산 돌릴 필요 없이 종료 시키면 됨. 연산을 아낄 수 있음.
				}
			}
			if(count==0){
				System.out.println(a+"는 소수 입니다.");
				primeCount +=1;
			}
		}
		System.out.println("소수의 갯수는 : "+primeCount);
			
		// (힌트) 소수 판별 : 2~자기 자신으로 나누었을때 0으로 떨어지는 경우가 2건	3개 이상이면 소수가 아님
		// 강사님 코드(최적화된)도 다시 확인해보기
		
		// 브레이크
		for(int j=2 ; j<=9; j++){
			if(j==3) break; // break 대신 continue; 를 써도 결과 동일 --> 3단은 출력 안 됨.
			for(int k=1; k<=9; k++){
				System.out.println(j+"*"+k+"="+(j*k));
			}
		}
		
		// outter 블럭으로 빠져나가는 방법 (안 중요함!!!) 
		tt : for(int j=2 ; j<=9; j++){
			for(int k=1; k<=9; k++){
				if(k==4) break tt; // 레이블(이름을 임의(tt)로 정해서) 나갈 블럭을 지정 (소속된 블럭 내에서만 동작. 다른 블록으로 워프 기능 없음)
				System.out.println(j+"*"+k+"="+(j*k));
			}
		}
				
	
// 	
}	
}
