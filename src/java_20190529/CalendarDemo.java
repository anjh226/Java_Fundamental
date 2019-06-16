package java_20190529;

public class CalendarDemo {
	public static void main(String[] args){
		
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
		
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int date = Integer.parseInt(args[2]); // 오늘자 년, 월, 일 
		
		int preYear = year - 1;
		int preMonth = month -1;
		int totalCnt = 0;
	
		// 2018년도 총 일 수 구하기
		totalCnt = preYear * 365 + (preYear/4 - preYear/100 + preYear/400);
		
		// 2019년 1월 1일 ~ 4월 30일까지 일 수 더하기
		// 월 배열을 생성한다. -> for문으로 1~4월까지 배열의 값을 함할 수 있도록 한다.
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		for (int i = 0; i < preMonth; i++) {
			totalCnt += monthArray[i];			
		}
		
		//totalCnt++; // 윤년인 해의 2월 말일 이후일자까지 일 수를 구할시에는 윤달(29)일 적용을 위해 +1을 해줘야 함. 
		//위 판단을 for문을 이용해 자동화 : 해당 연도가 3월 이상이면 1을 추가해 준다.
		if (month >= 3 && (year%4==0 && year%100!=0 || year%400==0)){
			totalCnt++;
		}
				
		totalCnt += date;
		int rest = totalCnt % 7;
		String day = "";
		switch(rest){
		case 1 : day = "월요일"; break;
		case 2 : day ="화요일"; break;
		case 3 : day ="수요일"; break;
		case 4 : day ="목요일"; break;
		case 5 : day ="금요일"; break;
		case 6 : day ="토요일"; break;
		case 0 : day ="일요일"; break;		
		}
		System.out.println(year+"년 "+month+"월 "+date+"일 "+day+" 입니다.");
		
	}	
}


