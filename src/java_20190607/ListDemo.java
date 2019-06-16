package java_20190607;

import java.util.ArrayList;

public class ListDemo {
	public static void main (String[] args) {
		// List : 데이터의 중복을 허용하고, 순서를 관리한다.
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("1");
		list.add("3");
		list.add("4");
		
		System.out.println(list.size());
		list.remove (2);
		// String temp = list.get(2); // list 중간 값 삭제시 자동 쉬프트
		System.out.println(list.size());
		
	}
}
