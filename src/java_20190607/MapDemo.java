package java_20190607;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		
		// 데이터 넣기 :: ---.put("key값", "value");
		map.put("a", "1");
		map.put("b", "2");
		map.put("c", "3");
		map.put("d", "4");
		map.put("b", "22"); // key 값 중복되면 나중 입력값이 덮어 씌워짐

		// 데이터 출력 :: get
		String temp1 = map.get("a");
		String temp2 = map.get("b");
		String temp3 = map.get("c");
		String temp4 = map.get("d");
		
		System.out.printf("%s, %s, %s, %s,", temp1, temp2, temp3, temp4);
		
		// 키 값을 모를때, (모두) 출력하는 방법
		// keySet() :: HashMap에 있는 모든 키 값을 Set으로 반환
		Set<String> keys = map.keySet();
		Iterator<String> i = keys.iterator();
		while (i.hasNext()){
			String key = i.next();
			String value = map.get(key);
			System.out.printf("key: %s, value: %s %n",  key, value);
			
		}
	
	}

}
