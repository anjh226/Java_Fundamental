package java_20190610;

// ���� Ŭ���� ����
class InsufficientBalanceException extends Exception{
	InsufficientBalanceException(String msg) {
		// Exceptoin Ŭ������ �Ű����� String�� �����ڸ� ȣ���Ѵ�.
		// msg�� �����޽����� ����� �������� ����Ѵ�.
		super();
	}	
}
class InCorrectAccountException extends Exception{
	InCorrectAccountException(String msg) {
		// Exceptoin Ŭ������ �Ű����� String�� �����ڸ� ȣ���Ѵ�.
		// msg�� �����޽����� ����� �������� ����Ѵ�.
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
				throw new InsufficientBalanceException ("�ܾ��� �����մϴ�."); // ���� ���� �߻� ��Ŵ1, Ŭ���� ���� ���� �θ� Exception �� �Ǿ��� ����, ���� ó�� �ʼ��� ��
			}
		} else { 
			throw new InCorrectAccountException ("���¹�ȣ�� �߸� �Ǿ����ϴ�."); // ���� ���� �߻� ��Ŵ2, "
		}
		return balance;
	}
	
	public static void main(String[] args) {	
		double balance;
		try { // try-catch ����ó��
			balance = withdraw ("123-12-123123", 200000);
			System.err.println("�ܾ� : " +balance);
		} catch (InsufficientBalanceException e) {
			System.err.println(e.getMessage());
		} catch (InCorrectAccountException e) {
			System.err.println(e.getMessage());
		}
		
	}
}
