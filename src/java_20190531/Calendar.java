
package java_20190531;

public class Calendar {
	public static final int SUNDAY = 0;
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WENDSDAY = 3;
	public static final int THURDAY = 4;
	public static final int FRIDAY = 5;
	public static final int SATURDAY = 6;

	private boolean isLeafYear(int year) {
		boolean isLeafYear = false;
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			isLeafYear = true;
		}
		return isLeafYear;
	}

	//
	private int getCount(int year, int month, int day) {

		int preYear = year - 1;
		int preMonth = month - 1;
		int totalCnt = 0;

		// 2018년도 총 일 수 구하기
		totalCnt = preYear * 365 + (preYear / 4 - preYear / 100 + preYear / 400);

		// 2019년 1월 1일 ~ 4월 30일까지 일 수 더하기
		// 월 배열을 생성한다. -> for문으로 1~4월까지 배열의 값을 함할 수 있도록 한다.
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 0; i < preMonth; i++) {
			totalCnt += monthArray[i];
		}

		// totalCnt++; // 윤년인 해의 2월 말일 이후일자까지 일 수를 구할시에는 윤달(29)일 적용을 위해 +1을 해줘야 함.
		// 위 판단을 for문을 이용해 자동화 : 해당 연도가 3월 이상이면 1을 추가해 준다.
		if (month >= 3 && (isLeafYear(year))) {
			totalCnt++;
		}

		totalCnt += day;
		return totalCnt;
	}

	private int getLastDay(int year, int month) {
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (isLeafYear(year)) {
			monthArray[1] = 29;
		} 
		return monthArray[month - 1];
	}

	
	private void print(int year) {
		// TODO Auto-generated method stub	
		
		System.out.println(year+"달력입니다.");
		for(int i=1; i<=12; i++){
			print(year, i);
		}
	}
	
	private void print(int year, int month) {
		// TODO Auto-generated method stub
		System.out.println(year + "년 " + month + "월 달력 입니다.");
		System.out.println("일\t월\t화\t수\t목\t금\t토");

		int start = 1;
		int end = getLastDay(year, month);
		int rest = getCount(year, month, 1) % 7;

		for (int i = 0; i < rest; i++) {
			System.out.print("\t");
		}

		for (int i = start; i <= end; i++) {
			System.out.print(i + "\t");
			rest++;
			if (rest % 7 == 0) {
				System.out.println();
			}
		}
		System.out.print();

	}

	private void print(int year, int month, int day) {
		// TODO Auto-generated method stub

		// 중복되는 코드 상단에서 totalCnt 메소드 설정 한 후, 일 수 합을 구하는 중복하는 코드를 삭제함.
		int totalCnt = getCount(year, month, day);

		int rest = totalCnt % 7;
		String dayofweek = "";
		switch (rest) {
		case Calendar.MONDAY:dayofweek = "월요일"; break;
		case Calendar.TUESDAY:dayofweek = "화요일"; break;
		case Calendar.WENDSDAY:dayofweek = "수요일"; break;
		case Calendar.THURDAY:dayofweek = "목요일"; break;
		case Calendar.FRIDAY:dayofweek = "금요일"; break;
		case Calendar.SATURDAY:dayofweek = "토요일"; break;
		case Calendar.SUNDAY:dayofweek = "일요일"; break;
		}
		System.out.println(year + "년 " + month + "월 " + day + "일 " + dayofweek + " 입니다.");
		// 숫자 표기는 좋지 않은 개발방식 (다른 사람이 알아 볼 수 있는 코딩) => static 멤버변수 설정해 1 ->
		// MONDAY 로 변경

	}
}
