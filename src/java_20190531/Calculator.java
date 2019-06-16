package java_20190531;

public class Calculator {
	public int plus(int first, int second){
		return first + second; // 리턴 결과 값이 위 자료형과 일치해야 함. (선언부에서 int 로 선언 했음으로 int 가 반환되야 함. 모두 하려면 void로 해야)
	}

	public int minus (int first, int second){
		return first - second;
	}

	public int multi (int first, int second){
		return first * second;
	}

	public void p (int message){
		System.out.println(message);
	}
}