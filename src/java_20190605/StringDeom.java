package java_20190605;

public class StringDeom {
	public static void main(String[] args){
	
		String str1 = new String("test");
		String str2 = new String("test");
		
		String str3 = "jave";
		String str4 = "jave";
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		
		String ssn = "234567-8923456";
		// charAt(index) : 문자열 중에 특정 인덱스에 있는 문자를 반환한다. (0은 2출력, 6-> - 출력)
		char c = ssn.charAt(7);
		System.out.println(c);
		// 문자열 연결 (ssn에 있는 문자열과 "안녕하세요"를 연결), + 와 기능 같음
		String temp = ssn.concat("안녕하세요");
		System.out.println(temp);
		// endsWith(String temp) 메서드는 temp 문자열로 끝나면 true, 그렇지 않으면 false
		// <-> startsWith(시작하는 문자열) :: http:://.../wbaseball URL로 시작하는 주소는 헤더에 OO001 메뉴를 갖는다 는 식의 코딩에 활용
		   // temp 문자열로 시작하면 T, 그렇지 않으면 F을 반환
		String fileName = "test.doc";
		if(fileName.endsWith("zip")){
			System.out.println("압축파일 입니다.");
		}else if (fileName.endsWith("doc")){
			System.out.println("Office 문서 입니다.");
		}else {
			System.out.println("파일 입니다.");
		}
		
		
		
		
		
		String s1 = "Java";
		String s2 = "JAVA";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2)); // equalsIgnoreCase => 대소문자 구별 무시하고 비교
		
		s2 = s2.toLowerCase();
		System.out.println(s2);
		
		s1 = s1.toUpperCase();
		System.out.println(s1);
		
		System.out.println(ssn.indexOf("-")); // 왼쪽부터 찾아서 순서를 셈
		System.out.println(ssn.lastIndexOf("-")); // 오른쪽 부터 찾고, 순서를 왼쪽부터 셈
		// 파일명 쪼게거나 변경할 때 활용하게 됨. (ex. dsfdgf.agdsg.dsg.zip --> 이 경우 파일명 분리시 lastIndexOf 필요)
		
		ssn = ssn.replaceAll("-", "*"); // String 문자열에서 -으로 되어 있는 것들을 *로 변경하라
		System.out.println(ssn);
		// 활용예 : 개행을 </br>로 변경할 때 활용
		
		String html = "안녕하세요\n저는 성영한입니다.\n앞으로 잘 부탁드립니다.";
		html = html.replaceAll("\n", "<br>");
		System.out.println(html);
		
		// ssn = "234567-8923456" (0=2 ~ : 컷번째 글자 = 0번째로 카운트 시작)
		String ssn1 = ssn.substring(0,6); // => 0번째부터 6번 이전까지 가져옴 (0<= ㅁㅁㅁ <6)
		String ssn2 = ssn.substring(7); // => 7부터 끝까지 다 (두번째 ~까지 숫자(<ooo)가 없으니)
		
		String ssn3 = ssn.substring(0, ssn.indexOf("*")); // * 0번째 수붜 * 이전까지 출력
		String ssn4 = ssn.substring(ssn.indexOf("*")+1); // * 이후부터 출력 
		
		System.out.println(ssn1);
		System.out.println(ssn2);
		System.out.println(ssn3);
		System.out.println(ssn4);
		
		
		String fileName0 = "abc.def.ghi.zip";
		String fileName1 = fileName0.substring(0, fileName0.lastIndexOf("."));
		String fileName2 = fileName0.substring(fileName0.lastIndexOf(".")+1);
		
		System.out.println("파일이름: "+fileName1);
		System.out.println("확장자: "+fileName2);
		
		fileName1 = "hello";
		fileName2 = "hello ";
		System.out.println(fileName1.length());
		System.out.println(fileName2.length());
		
		if (fileName1.equals(fileName2.trim())){
			System.out.println("성공");
		}else
			System.out.println("실패");
		
		int a = 10;
		String t1 = String.valueOf(a); // int를 문자열 String으로 바꾸라
		String t2 = a+""; // 위와 결과 및 기능 동일함.
		
		System.out.println(t1);
		System.out.println(t2);
		
		ssn = "234567-8923456";
		String[] t3 = ssn.split("-"); // 값을 쪼게면 여러개의 값이 나오므로 t3 배열에 순서대로 할당하라
		System.out.println(t3[0]);
		System.out.println(t3[1]);
		
		// format "~~~"의 문자열을 반환하되 다음에 쓴 숫자를 적용하여 문자열로 반환해달라
		String t4 = String.format("%,.2f and %,.2f", 10000.4212, 20000000.32533);
		System.out.println(t4);
	
		String t44 = String.format("%,d and %,d", 10000, 20000000);
		System.out.println(t44);
		
		String str = String.format("%,.2f , %2$,20.2f , %3$,20.6f",  1111.11,2222.22,3333.33);
		System.out.println(str);
		// format은 주로 숫자를 , 찍고 소수점 이하 처리할때만 씀. 그 외는 쓸 일이 거의 없음
		
		
// 		%[argument_index$] [flags] [width][.precision] conversion	
		
//		conversion 종류 3가지
//		f : 실수형 (실수형은 소수점 6째 자리까지 기본 출력)
//		d : 정수형
//		s : 문자열
		
// 		[argument_index$]
//		1$ => 첫번째 인자를 넣어라 (3$ => 3번째 인자)
// 		[argument_index$] 생략할 시, 인자 순서대로 자동으로 넣어줌.
		
//		[flags] , 
//		","(콤마)를 넣으면 천단위 콤마 붙여 출력할 수 있음
//		(이 외에도 flag 값 다양)
		
//		[width] : 자리수
//		20 => 20자리 칸 만큼 만들어라 (만약 숫자가 20자리 미만일 경우, 20자리에 맞춰 숫자 앞에 공백 생
//		
//		%n => 줄 바꿈
		
//		[.precision] : 소수점 이하 자리수
//		.2 => 소수점 이하 2자리
//
//		문자열 <= %s
		
		int b1 = 10;
		int b2 = 20;
		System.out.printf("b1의 값은 %d 이고요, b2의 값은 %d 입니다.", b1, b2);
		System.out.println();
		System.out.println("b1의 값은"+b1+"이고요, "+"b2의 값은"+b2+"입니다.");
	}
}








