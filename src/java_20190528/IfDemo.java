package java_20190528;

public class IfDemo {
	public static void main(String[] args){
		// args[0] ���α׷� ����� �Է¹��� ��
		int month = Integer.parseInt(args[0]); 
		// Integer.parseInt() �޼ҵ�� ���ڿ��� Int�� ��ȯ�ϴ� ��� (String[] �̹Ƿ� args[0]�� ���ڿ���)
		// args ���ڸ� 12�� �Է��� �־��� 
/*		if (month==12 || month==1 || month==2){
			System.out.println(month+"���� �ܿ� �Դϴ�.");
		}else if(month==3 || month==4 || month==5){
			System.out.println(month+"���� �� �Դϴ�.");
		}else if(month==6 || month==6 || month==8){
			System.out.println(month+"���� ���� �Դϴ�.");
		}else if(month==9 || month==10 || month==11){
			System.out.println(month+"���� ���� �Դϴ�.");
		}else{
			//??
			System.out.println(month+"���� ������ �ƴմϴ�. /n 1���� 12������ �� �߿��� �Է��� �ּ���.");
		}*/

		if (month==12 || month==1 || month==2){
			System.out.println(month+"���� �ܿ� �Դϴ�.");
		}else if(month>=3 && month<=5){
			System.out.println(month+"���� �� �Դϴ�.");
		}else if(month>=6 && month<=8){
			System.out.println(month+"���� ���� �Դϴ�.");
		}else if(month>=9 && month<=11){
			System.out.println(month+"���� ���� �Դϴ�.");
		}else{
			System.out.println(month+"���� ������ �ƴմϴ�.\n1���� 12������ �� �߿��� �Է��� �ּ���.");
		}

	
	
	}
}
