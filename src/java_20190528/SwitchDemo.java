package java_20190528;

public class SwitchDemo {
	public static void main(String[] args){
		int month = Integer.parseInt(args[0]); 
	/* if (month==12 || month==1 || month==2){
		System.out.println(month+"월은 겨울 입니다.");
	}else if(month==3 || month==4 || month==5){
		System.out.println(month+"월은 봄 입니다.");
	}else if(month==6 || month==6 || month==8){
		System.out.println(month+"월은 여름 입니다.");
	}else if(month==9 || month==10 || month==11){
		System.out.println(month+"월은 가을 입니다.");
	}else{
		//??
		System.out.println(month+"월은 계절이 아닙니다. /n 1부터 12까지의 수 중에서 입력해 주세요.");
	}*/
		
	/*switch(month){
	case 12 :
	case 1 :
	case 2 :
		System.out.println(month+"월은 겨울 입니다.");break;
	case 3 :
	case 4 :
	case 5 :
		System.out.println(month+"월은 봄 입니다.");break;
	case 6 :
	case 7 :
	case 8 :
		System.out.println(month+"월은 여름 입니다.");break;
	case 9 :
	case 10 :
	case 11 :
		System.out.println(month+"월은 가을 입니다.");break;
	default :
		System.out.println(month+"월은 계절이 아닙니다."); // 맨 위로 올릴 수 있으나 다음 break 문까지 처리되므로 예상치 못한 값 나올 수 있음. 활용시 주의.
	}*/
		
/*	
	String season = null;
		
	switch(month){
	
	case 12 :
	case 1 :
	case 2 :
		season = "겨울"; break;
	case 3 :
	case 4 :
	case 5 :
		season = "봄"; break;
	case 6 :
	case 7 :
	case 8 :
		season = "여름"; break;
	case 9 :
	case 10 :
	case 11 :
		season = "가을"; break;
//  default : //?? ;
	}
	if (month <= 12){
		System.out.println("N:"+month+"월은"+season+"입니다.");	
	} else {System.out.println(month+"월은 계절이 아닙니다.");		
	} 
*/
	
	String season = null;
	switch(month){
		case 12 : 
		case 1 : 
		case 2 : 
			season = "겨울";break;
		case 3 :
		case 4 : 
		case 5 :
			season = "봄"; break;
		case 6 :
		case 7 : 
		case 8 :
			season = "여름"; break;
		case 9 :
		case 10 : 
		case 11 :
			season = "가을"; break;
		default :
			System.out.println(month+"월은 계절이 아닙니다.");
	}
	System.out.println(month+"월은 "+season+" 입니다.");
	
}
}
