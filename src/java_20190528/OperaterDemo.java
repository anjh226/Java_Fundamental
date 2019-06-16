package java_20190528;

public class OperaterDemo {

	public static void main(String[] args) {
		/*
		 *  달력 만들기
		 *  1.  1년 1월 1일 월요일
		 *  2.  윤년은 4년 마다 발생함. 
		 *  	단, 그 중에 100년의 배수는 윤년에서 제외하고, 400년의 배수는 윤년이다.
		 * 
		 * - 2019년 5월 28일의 요일을 구하려면
		 * 2018년 까지 총 일수를 구하고, (2019년의) 1~4월까지 일수를 구하고
		 * (오늘 날짜인 5월의) 28일을 더하면 총일수가 나옴. 
		 *   
		 * - 총일수 7로 나눈 나머지가 1 이면 월요일, 2 이면 화요일, ....
		 * 6 이면 토요일, 0 이면 일요일. 
		 */
		
		int year = 2019;
		int month = 5;
		int date = 30; // 오늘자 년, 월, 일
		
		int preYear = year - 1;
		int preMonth = month -1; // 단 학습이 필요하므로 지난달까지 일수는 직접 수치로 넣어주자.
		
		int totalCnt = 0;
	
		// 2018년도 총 일수 구하기
		totalCnt = preYear * 365 + (preYear/4 - preYear/100 + preYear/400);
		
		// 2019년 1월 1일 ~ 4월 30일까지 일 수 더하기
		// 올해 1~4월까지 일 수는 추가 학습 필요. 직접 수치 넣기로 함. 
		totalCnt += 31+28+31+30;
		
		totalCnt += date;
		
		int rest = totalCnt % 7;
		System.out.println(rest);
		
		char s = '\"';
		System.out.println(s);
		
		int a = 10;
		System.out.println(a++); // a에서 +1+1 하라 -> 12
		System.out.println(++a); // 즌가한 후에 위에서 12가된 a를 출력
		// 교재 94 페이지 참고
		
		// 삼항 산자 (= 조건 연산자, 항이 3개인 연산자이기 때문)
		int v = 52%10==0? 52/10:52/10+1;
		System.out.println(v);
		
	
		int temp = 123;
		int share = temp%10==0 ? temp/10 : temp/10+1;
		System.out.println(share);
		
		// 위와 동일한 if문은 아래와 같으나, 더 복잡하고 기므로 위로 쓰는 것이 고수. (switch case O / for X!!) 코드는 간결하게
		// 출력 결과를 ㄴshare 하나에 반영하므로 if 쓸 필요 없음.
		if(temp%10==0){
			share = temp/10;
	    } else {
	    	share = temp/10+1;
	    }
		System.out.println(share);
	}
}



