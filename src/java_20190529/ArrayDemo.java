package java_20190529;

public class ArrayDemo {
	public static void main(String[] args) {
		//int 배열 생성
		int[] test = new int [4];
		int index = 0;		
		// 배열 할당
		test[index++] = 1; // index++ = 0 , ++index = 1  
		test[index++] = 2;
		test[index++] = 3;
		test[index++] = 4;
		
		// 배열 출력
		System.out.println(test[0]);
		System.out.println(test[1]);
		System.out.println(test[2]);
		System.out.println(test[3]);
		
/*		for(int i=0; i>test.length; i++){ // test.length : 변수명.length = 변수명 배열의 길이를 의미
			System.out.println(test[i]);
		}	*/	
		
		// cntl + 스페이스 : 자동입력 기능
		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
		}
		
		// 배열 할당과 생성 동시
		int[] test1 = {100, 200, 300, 400};
		System.out.println(test1[0]);
		
		// adp test1 일차원 배열의 두 번째 값을 할당하기
		int a = test1[1];
		System.out.println(a);
		
		// ENHANCEED FOR 문
		for (int i : test){
			System.out.println(i);
		}
		
		// test2는 test1의 참조변수가 가리키는 배열과 같은 곳을 참조한다.
		int[] test2 = test1;
		// test2[3]의 값을 변경하면 test1[3]의 값도 변경된다. test1[], test2[]가 같은 배열을 참조하기 때문이다.
		test2[3] = 4000;
		System.out.println(test1[3]);
		System.out.println(test2[3]);
		
		// []은 어디에 붙어도 정상동작 ex. int test1 [] , int []test1 (O) // 이건 no []int test1 (X)
		
		// 2차원 배열 
		int[ ][ ] test3 = new int[2][3];
		test3 [0][0] = 10;
		test3 [0][1] = 20;
		test3 [0][2] = 30;
		test3 [1][0] = 40;
		test3 [1][1] = 50;
		test3 [1][2] = 60;
		
		int[ ][ ] test4 = {{10,20,30}, {40,50,60}};
		
		for (int i = 0; i < test4.length; i++) {
			for (int j = 0; j < test4[i].length; j++) {
				System.out.println(test4[i][j]);				
			}			
		}
		
		// ENHANCED문 활용 2차원 배열 출력
		for (int[ ] is : test4) {
			for (int value : is) {
				System.out.println(value);
			}
		}		
		
		// 배열의 copy - 배열 사이즈 늘리기
		int [ ] test5 = new int[8];
		System.arraycopy(test1, 0, test5, 0, 4);
		test5[4] = 500;
		test5[5] = 600;
		test5[6] = 700;
		test5[7] = 800;
		
	    for (int i : test5) {
	    	System.out.println(i);
			}
	           
	    
	    
	}		
}
