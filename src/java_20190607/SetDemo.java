package java_20190607;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet; 
public class SetDemo {

	public static void main(String[] args) {
		// 자동 import : 컨트롤 + 쉬프트 + o
		
		// 1) 
		// HashSet 데이터의 중복을 허용하지 않고, 순서 없음.
		// HashSet<String> set1 = new HashSet<String>(); // <String> -- 문자열만 집어 넣어라
		
		// 2)
		// TreeSet은 데이터의 중복을 허용하지 않고, natural ordering(오름차순 정렬)
		// TreeSet<String> set1 = new TreeSet<String>();
		
		// 3) 
		// LinkedHashSet<String>은 데이터의 중복을 허용하지 않고, 입력한 순서대로 출력. 따라서, set 임에도 순서 개념 있음.
		LinkedHashSet<String> set1 = new LinkedHashSet<String>();
		
		// set은 인덱스/key가 없어서 일부~선택적 데이터 삭제가 어려움.
		
		// 데이터 추가 (집어넣기 - add)
		for (int i=0; i<20;i++){
			// valueOf(int i) 메소드는 int i를 문자열로 변환 
			set1.add(String.valueOf(i));
		}

		// HashSet size 확인
		System.out.println(set1.size());
		
		// 데이터 출력 (Iterator 사용 hasNext() -> next())
		Iterator<String>iterator = set1.iterator(); // .iterator(); :: 객체를 정렬해 줌.
		while(iterator.hasNext()) { // hasNext() : 해당 객체가 있는지 없는지
			String temp = /*(String)*/iterator.next(); // next() :: 해당 객체를 끄집어 내라
			System.out.println(temp);
	 	}
		
		Customer c1 = new Customer("홍길동", 10);
		Customer c2 = new Customer("홍길동", 10);
		Customer c3 = new Customer("홍길동", 10);
		Customer c4 = new Customer("홍길동", 10);
		// 모두 지우기
		
		HashSet<Customer> set2 = new HashSet<Customer>();
		set2.add(c1);
		set2.add(c2);
		set2.add(c3);
		set2.add(c4);
		
		// 이퀄즈, 해시코드 오버라이딩하지 않으면, set에 안 들어감
		
		// 모두 지우기/
		// set1.clear();
		
		HashSet<Integer> set3 = new HashSet<Integer>();
		
		while(true){
			int random = (int)(Math.random()*45)+1;
			set3.add(random);
			if(set3.size() == 6) break; 
		}
		Iterator<Integer> i = set3.iterator();	
		while (i.hasNext()) {
			String temp = iterator.next();
			System.out.println(temp + "\t");
	 	}
		
	}
}




class Customer {
	private String name;
	private int age;
	public Customer(String name, int age){ // <-- 생성자
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}