package java_20190531;

public class Calculator {
	public int plus(int first, int second){
		return first + second; // ���� ��� ���� �� �ڷ����� ��ġ�ؾ� ��. (����ο��� int �� ���� �������� int �� ��ȯ�Ǿ� ��. ��� �Ϸ��� void�� �ؾ�)
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