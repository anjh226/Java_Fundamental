package java_20190607;

public class StiringBufferDemo {
	public static void main(String[] args) {
		
		StringBuffer s1 = new StringBuffer();
		StringBuffer s2 = new StringBuffer();
		
		s1.append("select name, age");
		s1.append("from menber");
		
		s2.append("select name, age");
		s2.append("from menber");

		System.out.println(s1 == s2);
		// StiringBuffer의 equals() 메서드는 object 클래스의 equals() 메소드. 따라서 객체 비교 (내용 비교 X)
		System.out.println(s1.equals(s2));
		
		String s3 = s1.toString();
		String s4 = s2.toString();
		
		System.out.println(s3.equals(s4));
		
		// StringBuffer 를 재사용 하기 위해서, s1의 값을 모두 지우기
		s1.setLength(0);
		
		s1.append("select no, write from board");
		// StringBuffer 클래스는 Object의 toString() 매서드를 오버라이딩 했기 때문에, StringBuffer 클래스의 문자열이 출력됨.
		System.out.println(s1/*.toString*/); // ** 참고 : 위에 따라,  StringBuffer 레퍼런스를 그대로 출력해도 toString을 오버라이딩 했기 때문에, 에러나지 않고 내용이 문자열이 출력 됨. 생략되어 안 보이는 것.
		
	}

}
