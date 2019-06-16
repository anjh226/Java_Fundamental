package java_20190530;

// 클래스
public class Customer {
	
	// 멤버변수 (인스턴스, 스테틱, 파이널)
	private String name; // <- 인스턴스 변수(객체 변수), 모든 개체가 생성될 때마다 다른 값을 넣어야 하는 경우 인스턴스 변수를 사용해야
	String cphone; // <- 인스턴스 변수(객체 변수), 접근한정자 private를 안 붙인 경우.
	
	static double interestRate; // <- static variable

	static final String BANKNAME = "신한은행";	// <- static final , 관례상 대문자로 변수명 작성
	
	// 멤버변수 항목은 접근한정자 private 로 ENCAPSULATION 할 것! 습관적으로 private 붙이자! --  & 은닉된 정보를 변경하기 위한 getter, setter 함수 만들기!
	// ㄴ 정보의 은닉화 information hide 는 인캡슐레이션의 기본.
	
	/*public void setName(Sting n){
		neme = n;
	}
	
	public String getNmae() {
		return name;
	}
	*/
	
	// setter, getter 자동 생성 방법 마우스 우클릭 > Source > ... > Select All > 생성
	// 단축 : 알트 + 쉬프트 + S > R
	
	
	
	// 메서드
	public void register(){
		// DB 연결 -- DB insert ?? (우리는 연결할 DB가 없지..  메인에 저장한 값을 출력해보자)
		System.out.println("고객이 등록 되었습니다.");
		System.out.println("이름 : "+ name + "\n핸드폰 번호 : "+ cphone 
				+ ", 이자율 : "+interestRate
				+ ", 은행명 : "+BANKNAME );
		// 사용할 main 클래스는 별도 파일에서
		
		// (Select -- DB에서 값을 불러오기 필요)
			
	}

	// getter setter 자동생성 결과 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCphone() {
		return cphone;
	}

	public void setCphone(String cphone) {
		this.cphone = cphone;
	}

	public static double getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(double interestRate) {
		Customer.interestRate = interestRate;
	}

	public static String getBankname() {
		return BANKNAME;
	}
}
