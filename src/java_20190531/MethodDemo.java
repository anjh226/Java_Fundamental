package java_20190531;

public class MethodDemo {
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		int sum = c.plus(10, 20); // sum 변수의 자료형을 int 로 선언 완료
		c.p(sum);
		
		sum = c.minus(100, 20); // 위에서 이미 선언 완료된 sum 변수를 사용하므로, 재선언 불필요. 동일하게 int sum 할 경우, sum이라는 이름이 동일한 새 변수를 선언하는 셈이므로 에러. (변수명은 속성 무관 중복 불가)
		
		sum = c.multi(9, 3);
		c.p(sum);
	
		
	}
}


