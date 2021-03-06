package java_20190528;

public class CharDemo {
	public static void main (String[] args){
		//문자 표현법
		char a = 'q';
		
		// 유니코드 표현법 '\u0000'
		char b = '\uC548';
		char c = '\uC9C0';
		char d = '\uD61C';
		
		System.out.println(b); // println 프린트 라인은 춮력 후 개행
		System.out.println(c);
		System.out.println(d);
		
		System.out.print(b); // print 출력
		System.out.print(c);
		System.out.print(d);
		
		// 현 수준에서 한 줄로 출력하기 코드는 복잡하니 PASS
		
		// 아스키코드 표현법
		char e = 97;
		System.out.println(e);
		
		//이스케이프 캐릭터
		System.out.println("성영한\t만세"); // t\ tab 만큼 띄어 줌
		System.out.println("C:\\Users\\user\\Desktop\\anjh_0527"); // 백슬래시를 추력하기 위해선 '//'으로 쳐야 함.
	
		System.out.println("\""); // 쌍따옴표 \" , 
		System.out.println("성영한 '만세'"); // 홑따옴표는 인식함. 이스케이프 char 불필요	
		// 문자열 중에서 인식 못하는 것 딱 2가지 : "(쌍따옴표), \(백슬레시) 는 그대로 쓰면 문자로 인식하지 못 함. 앞에 백슬래시(\)를 붙여서 문자로 인식시켜야 함.
	
		// 문자에서 \, ' 두개의 문자는 문자에서 char에서 인식을 못하기 때문에 두 문자 압에 \를 붙여 준다.
		char f = '\\';
		char g = '\'';
		char h = '"';
			
	}
}
