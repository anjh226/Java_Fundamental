package java_20190604;

import kr.co.kakao.util.Util;

public class UtilDemo {
	public static void main(String[] args) {
		Util util = new Util();		
		
		int b = util.plus (10, 5);
		System.out.println(b);
		
		System.out.println(util.plus (10, 5));
		System.out.println(util.minus (10, 5));
	}
}
