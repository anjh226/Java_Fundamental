package java_20190610;

// 예외 클래스 정의
class InsufficientBalanceException extends Exception{
	InsufficientBalanceException(String msg) {
		// Exceptoin 클래스의 매개변수 String인 생성자를 호출한다.
		// msg는 에러메시지를 출력할 목적으로 사용한다.
		super();
	}	
}
class InCorrectAccountException extends Exception{
	InCorrectAccountException(String msg) {
		// Exceptoin 클래스의 매개변수 String인 생성자를 호출한다.
		// msg는 에러메시지를 출력할 목적으로 사용한다.
		super();
	}	
}

public class ThrowExceptionDemo {	
	public static double withdraw (String account, int amount) 
			throws InsufficientBalanceException, InCorrectAccountException {
		double balance = 100000; 
		String dbAccount = "123-12-123123";
				
		if(account != null && account.equals(dbAccount)){
			if (balance - amount > 0){
				balance = balance - amount;
			} else {
				throw new InsufficientBalanceException ("잔액이 부족합니다."); // 예외 임의 발생 시킴1, 클래스 선언에 따라 부모가 Exception 이 되었음 따라서, 예외 처리 필수가 됨
			}
		} else { 
			throw new InCorrectAccountException ("계좌번호가 잘못 되었습니다."); // 예외 임의 발생 시킴2, "
		}
		return balance;
	}
	
	public static void main(String[] args) {	
		double balance;
		try { // try-catch 예외처리
			balance = withdraw ("123-12-123123", 200000);
			System.err.println("잔액 : " +balance);
		} catch (InsufficientBalanceException e) {
			System.err.println(e.getMessage());
		} catch (InCorrectAccountException e) {
			System.err.println(e.getMessage());
		}
		
	}
}
