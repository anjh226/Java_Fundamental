package java_20190607;

import java.util.ArrayList;

public class ListDemo {
	public static void main (String[] args) {
		// List : �������� �ߺ��� ����ϰ�, ������ �����Ѵ�.
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("1");
		list.add("3");
		list.add("4");
		
		System.out.println(list.size());
		list.remove (2);
		// String temp = list.get(2); // list �߰� �� ������ �ڵ� ����Ʈ
		System.out.println(list.size());
		
	}
}
