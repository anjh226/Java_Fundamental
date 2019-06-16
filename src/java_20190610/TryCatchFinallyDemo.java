package java_20190610;

public class TryCatchFinallyDemo {
	public static double average(int a, int b){
		int sum = a + b;
		return (double)sum / (double)2;
	}
	
	public static void main(String[] args) { // args : 입력(대입)할 값
/*		if (args.length !=2) {
			// 에러, 경고성 출력은 out 대신 err 로 (단, 출력 결과 시각적 차이는 없음 or 이클립스 콘솔에서 빨강색 글씨 출력)
			System.err.println("usage : java TtyCatchFinallyDemo " + "[국어점수]" + "[영어점수]");
			return; // -> (length 가 2가 아니면 (값을 2개 입력하지 않았다면)) 프로그램 종료 하라.
		}*/
		
		// Integer.parseInt() 메소드는 숫자가 아닌 문자열이 들어갈 경우. 즉, 일반 문자열일 경우 -> NumberFormetException 예외가 발생
		 // (ㄴ> 발생 가능한 예외 : int (숫자)대신 문자가 들어오는 Exception이 생길 수 있음. )
		
		try {
			int korea = Integer.parseInt(args[0]);
			
			// JVM은 실행을 중지 시키고, 예외 객체인 NumberFormatException 객체를 생성한 후, catch 블럭을 찾는다. 
			int english = Integer.parseInt(args[1]);
			double avg = average(korea, english);
			System.out.printf("평균 : %.2f", avg );
			
		} catch (NumberFormatException e) { // 캐치 블럭에 모든 종류가 다 있을 필요는 없고, 가장 상위 것만 있으면 다 잡힘.
			// e.printStackTrace(); // -> JVM 처리시와 동일한 결과 출력. 예외 객체 위치를 추척해서, 해당 라인을 알려 줌 => 따라서, 개발단에서는 이를 사용.
			// System.err.println("예외 메시지 : "+ e.getMessage());
			System.err.println("사용자에 안내 출력 : 문자 말고, 숫자를 입력하셔야 합니다."); // -> 사용자에게 보여줄 메시지
		} catch (ArrayIndexOutOfBoundsException e) { 
			//e.printStackTrace(); 
			//System.err.println("예외 메시지 : "+ e.getMessage());
			System.err.println("사용자에 안내 출력 : 평균을 구하고자 하는 수를 2개 입력하세요.");
		} finally {
			System.out.println("finally block"); 
		}

	}
}
