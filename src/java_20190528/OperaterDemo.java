package java_20190528;

public class OperaterDemo {

	public static void main(String[] args) {
		/*
		 *  �޷� �����
		 *  1.  1�� 1�� 1�� ������
		 *  2.  ������ 4�� ���� �߻���. 
		 *  	��, �� �߿� 100���� ����� ���⿡�� �����ϰ�, 400���� ����� �����̴�.
		 * 
		 * - 2019�� 5�� 28���� ������ ���Ϸ���
		 * 2018�� ���� �� �ϼ��� ���ϰ�, (2019����) 1~4������ �ϼ��� ���ϰ�
		 * (���� ��¥�� 5����) 28���� ���ϸ� ���ϼ��� ����. 
		 *   
		 * - ���ϼ� 7�� ���� �������� 1 �̸� ������, 2 �̸� ȭ����, ....
		 * 6 �̸� �����, 0 �̸� �Ͽ���. 
		 */
		
		int year = 2019;
		int month = 5;
		int date = 30; // ������ ��, ��, ��
		
		int preYear = year - 1;
		int preMonth = month -1; // �� �н��� �ʿ��ϹǷ� �����ޱ��� �ϼ��� ���� ��ġ�� �־�����.
		
		int totalCnt = 0;
	
		// 2018�⵵ �� �ϼ� ���ϱ�
		totalCnt = preYear * 365 + (preYear/4 - preYear/100 + preYear/400);
		
		// 2019�� 1�� 1�� ~ 4�� 30�ϱ��� �� �� ���ϱ�
		// ���� 1~4������ �� ���� �߰� �н� �ʿ�. ���� ��ġ �ֱ�� ��. 
		totalCnt += 31+28+31+30;
		
		totalCnt += date;
		
		int rest = totalCnt % 7;
		System.out.println(rest);
		
		char s = '\"';
		System.out.println(s);
		
		int a = 10;
		System.out.println(a++); // a���� +1+1 �϶� -> 12
		System.out.println(++a); // ���� �Ŀ� ������ 12���� a�� ���
		// ���� 94 ������ ����
		
		// ���� ���� (= ���� ������, ���� 3���� �������̱� ����)
		int v = 52%10==0? 52/10:52/10+1;
		System.out.println(v);
		
	
		int temp = 123;
		int share = temp%10==0 ? temp/10 : temp/10+1;
		System.out.println(share);
		
		// ���� ������ if���� �Ʒ��� ������, �� �����ϰ� ��Ƿ� ���� ���� ���� ���. (switch case O / for X!!) �ڵ�� �����ϰ�
		// ��� ����� ��share �ϳ��� �ݿ��ϹǷ� if �� �ʿ� ����.
		if(temp%10==0){
			share = temp/10;
	    } else {
	    	share = temp/10+1;
	    }
		System.out.println(share);
	}
}



