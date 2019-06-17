package java_20190607;

import java.util.ArrayList;

public class GenericDemo {

	// 제너릭  
	// : 데이터 안정성을 보장하기 위해. 컴파일 단계에서 에러 잡아내지 못함. (콜렉션은 타입 구분 없이 모두 들어갈 수 있음)
    //	 enhance for 실행시 에러 방지, 캐스팅 필요 없음.
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
//		list.add(10); // <- int는 못 들어감.boxing 되서 int Class로 들어가는 것.
		
	for (int i =0; i < list.size(); i++){
		
	}
		
	}

}
