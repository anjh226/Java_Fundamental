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
		
		// i 값은 call by value -> 값 변경 X ,  a는 call by reference --> 값 변경 O
		change(i, a, tt);
		System.out.println("i :"+ i);
		System.out.println(a[2]);		
		System.out.println(tt); // String은 reference 인데 왜 안바 뀜? -> String 클래스의 특수성 때문.			
	}
}
