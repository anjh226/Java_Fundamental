package java_20190603;
 
public class CallByReferenceDemo {
	
	public static void change (int k, int[] b, String str){
		k += 20;
		b[2] += 3000;
		str += "def";
	}

	public static void  main (String[] args) {
		int i = 10;
		int[] a= {10, 20, 30, 40};
		String tt = "abc";
		
		System.out.println("i : " + i);
		System.out.println(a[2]);
		System.out.println(tt);
		
		// i ���� call by value -> �� ���� X ,  a�� call by reference --> �� ���� O
		change(i, a, tt);
		System.out.println("i :"+ i);
		System.out.println(a[2]);		
		System.out.println(tt); // String�� reference �ε� �� �ȹ� ��? -> String Ŭ������ Ư���� ����.			
	}
}
