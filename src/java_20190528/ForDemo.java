package java_20190528;

public class ForDemo {
	public static void main(String[] args){
		
/*		int sum = 0;
		int i = 0;
		int max = 100;
		
		for (�ʱⰪ�� for �� ������ ���� OK; i <= max; i++ ){
			sum = sum + i;
		}
		// System.out.println("1����"+(i-1)+"���� ���� : "+sum);
		System.out.println("1����"+max+"���� ���� : "+sum);
		
	    // for �ݺ��� �ʺ��� �ۼ� �� �ùķ��̼�&���� ��� �غ� ��.
		
		
		// 1~100���� Ȧ���� ������
		int sum2 = 0;
		int i2 = 0;
		
		for ( ; i2 <= 100 ; i2++ ){
			if (i2%2==1){			
				sum2 = sum2 + i2;
			}			
		}
		System.out.println("1���� 100���� Ȧ���� ���� : "+sum2);
		
		// ������ ���
		for(int j=2 ; j<=9; j++){
				for(int k=1; k<=9; k++){
					System.out.println(j+"*"+k+"="+(j*k));
				}
		}*/
		
		
		// 1~100���� �Ҽ� ���� ���ϱ�
		/*for(int m=1 ; m<=100; m++){
			for(int z=1 ; z<=(m-1); z++) {
				if(m%z==1 && m%z==m){
				} 
			}
		}
		*/
		
		// �Ҽ� ��� & �Ҽ� ���� ���ϱ�
		int primeCount = 0;
		for (int a=2; a<=100; a++){
			int count = 0;
			for(int k=2; k<a; k++){
				if(a%k==0){
					count +=1;
					break; // �ڡ� ��   �ٸ� ���� 1ȸ �̻� ���������� ���� ���̻� �Ҽ��� ���ɼ��� �������� ���� ���� �ʿ� ���� ���� ��Ű�� ��. ������ �Ƴ� �� ����.
				}
			}
			if(count==0){
				System.out.println(a+"�� �Ҽ� �Դϴ�.");
				primeCount +=1;
			}
		}
		System.out.println("�Ҽ��� ������ : "+primeCount);
			
		// (��Ʈ) �Ҽ� �Ǻ� : 2~�ڱ� �ڽ����� ���������� 0���� �������� ��찡 2��	3�� �̻��̸� �Ҽ��� �ƴ�
		// ����� �ڵ�(����ȭ��)�� �ٽ� Ȯ���غ���
		
		// �극��ũ
		for(int j=2 ; j<=9; j++){
			if(j==3) break; // break ��� continue; �� �ᵵ ��� ���� --> 3���� ��� �� ��.
			for(int k=1; k<=9; k++){
				System.out.println(j+"*"+k+"="+(j*k));
			}
		}
		
		// outter ������ ���������� ��� (�� �߿���!!!) 
		tt : for(int j=2 ; j<=9; j++){
			for(int k=1; k<=9; k++){
				if(k==4) break tt; // ���̺�(�̸��� ����(tt)�� ���ؼ�) ���� ���� ���� (�Ҽӵ� �� �������� ����. �ٸ� ������� ���� ��� ����)
				System.out.println(j+"*"+k+"="+(j*k));
			}
		}
				
	
// 	
}	
}
