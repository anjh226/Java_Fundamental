
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

		// 2018�⵵ �� �� �� ���ϱ�
		totalCnt = preYear * 365 + (preYear / 4 - preYear / 100 + preYear / 400);

		// 2019�� 1�� 1�� ~ 4�� 30�ϱ��� �� �� ���ϱ�
		// �� �迭�� �����Ѵ�. -> for������ 1~4������ �迭�� ���� ���� �� �ֵ��� �Ѵ�.
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 0; i < preMonth; i++) {
			totalCnt += monthArray[i];
		}

		// totalCnt++; // ������ ���� 2�� ���� �������ڱ��� �� ���� ���ҽÿ��� ����(29)�� ������ ���� +1�� ����� ��.
		// �� �Ǵ��� for���� �̿��� �ڵ�ȭ : �ش� ������ 3�� �̻��̸� 1�� �߰��� �ش�.
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
		
		System.out.println(year+"�޷��Դϴ�.");
		for(int i=1; i<=12; i++){
			print(year, i);
		}
	}
	
	private void print(int year, int month) {
		// TODO Auto-generated method stub
		System.out.println(year + "�� " + month + "�� �޷� �Դϴ�.");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");

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

		// �ߺ��Ǵ� �ڵ� ��ܿ��� totalCnt �޼ҵ� ���� �� ��, �� �� ���� ���ϴ� �ߺ��ϴ� �ڵ带 ������.
		int totalCnt = getCount(year, month, day);

		int rest = totalCnt % 7;
		String dayofweek = "";
		switch (rest) {
		case Calendar.MONDAY:dayofweek = "������"; break;
		case Calendar.TUESDAY:dayofweek = "ȭ����"; break;
		case Calendar.WENDSDAY:dayofweek = "������"; break;
		case Calendar.THURDAY:dayofweek = "�����"; break;
		case Calendar.FRIDAY:dayofweek = "�ݿ���"; break;
		case Calendar.SATURDAY:dayofweek = "�����"; break;
		case Calendar.SUNDAY:dayofweek = "�Ͽ���"; break;
		}
		System.out.println(year + "�� " + month + "�� " + day + "�� " + dayofweek + " �Դϴ�.");
		// ���� ǥ��� ���� ���� ���߹�� (�ٸ� ����� �˾� �� �� �ִ� �ڵ�) => static ������� ������ 1 ->
		// MONDAY �� ����

	}
}
