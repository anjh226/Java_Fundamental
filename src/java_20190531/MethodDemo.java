package java_20190531;

public class MethodDemo {
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		int sum = c.plus(10, 20); // sum ������ �ڷ����� int �� ���� �Ϸ�
		c.p(sum);
		
		sum = c.minus(100, 20); // ������ �̹� ���� �Ϸ�� sum ������ ����ϹǷ�, �缱�� ���ʿ�. �����ϰ� int sum �� ���, sum�̶�� �̸��� ������ �� ������ �����ϴ� ���̹Ƿ� ����. (�������� �Ӽ� ���� �ߺ� �Ұ�)
		
		sum = c.multi(9, 3);
		c.p(sum);
	
		
	}
}


