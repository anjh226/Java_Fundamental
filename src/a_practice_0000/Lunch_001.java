package a_practice_0000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lunch_001 {
	static int StoreCount = 4;
	
public static void main(String[] args) {
	int randomCoice =  (int)(Math.random()* StoreCount) + 1;
	
	if (randomCoice == 1){
		System.out.println("경복관"+"/n"+"(7,000원 이하)");
	} else if (randomCoice == 2){
		System.out.println("깁밥 일번가/n(6,500원 이하)");
	} else if (randomCoice == 3){
		System.out.println("장안문/n(제육 또는 고등어 구이)");
	} else if (randomCoice == 4){
		System.out.println("서브웨이/n(7,000원 이하)");
	} else {
		System.err.println("오류 : 다시 실행해 주세요.");		
	}
}
	
}
