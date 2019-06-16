package java_20190607;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class ConsoleApplication {
	private ArrayList<Member> list;
	
	public ConsoleApplication() {
		list = new ArrayList <Member>();
	}
	
	public void print () {
		System.out.println("***********************************************");
		System.out.println("1. Insert  2. Update  3. Delete  4. Search  5.Exit");
		System.out.println("***********************************************");
	}
	// Ű����� �Է¹��� �� ���� ��ȯ�ϴ� �Լ�
	public String console(String message) throws IOException{ 
		System.out.print(message);
		BufferedReader br = new BufferedReader (
				new InputStreamReader(System.in)); 
		return br.readLine();
	}
	
	public void execute(String message) throws IOException{
		
		if(message.equals("1")){
			insert();
		}else if (message.equals("2")){
			update();
		}else if (message.equals("3")){
			delete();
		}else if (message.equals("4")){
			search();
		} else {
			System.out.println("���α׷��� ���� �մϴ�.");
		}
	}
	//1. ���̵� �Է� �޴´�. 
	//2. �̸��� �Է� �޴´�.
	//3. ArrayList�� ���� �߰��Ѵ�
	//4. ArrayList�� �ִ� ��� ���� ����Ѵ�.
	//5. print() �Լ��� ȣ�� �Ѵ�.
	//6. �����ϼ��� : �޽��� ��� �� Ű���� �Է¹��� �غ�.
	public void insert()  throws IOException{
		String id = console ("���̵� : ");
		String name = console ("�̸� : ");
		Member m = new Member(name, id);
		list.add(m);
		
		
		for (Member m1 : list){
			/*System.out.printf("���̵� : %s, �̸� : %s,%n", m1.getId(), m1.getName());*/
			System.out.println(m1);
		}
		print();
		String message = console("�����ϼ��� : ");
		execute (message);
		
		}
	
	//1. ������ ���̵� �Է� �޴´�.
	//2. ArrayList ���� ������ ���̵� ã�Ƽ�, 
	// - 1. ������, ������ �̸��� �Է� �ް� ArrayList���� �����ϰ� 
	// - 2. ������, ������ ���̵� �����ϴ�. �޽����� ��� �Ѵ�.
	//4. ArrayList�� �ִ� ��� ���� ����Ѵ�.
	//5. print() �Լ��� ȣ�� �Ѵ�.
	//6. �����ϼ��� : �޽��� ��� �� Ű���� �Է¹��� �غ�.	
	public void update() throws IOException{
		String updateId = console("������ ���̵� : ");
		boolean isExested = false;
		for (Member m : list){
			if(updateId.equals(m.getId())){
				isExested = true;
				break;
			}
		} 
		if(isExested){
			String updateName = console("������ �̸� : ");
			for (int i = 0; i<list.size() ; i++){
				Member m1 = list.get(i);
				if(updateId.equals(m1.getId())){
					// a) ������ ����� ���� �Է�
					// list.remove(i);
					// list.add(new Member(updateName, updateId));

					// b) ������ ������Ʈ
					m1.setName(updateName);
					break;
				}
			}
		} else {
			System.out.println("������ ���̵� �����ϴ�.");
		}
		
		for (Member m1 : list){
			System.out.println(m1);
		}
		print();
		String message = console("�����ϼ��� : ");
		execute (message);
	}
		

	public void delete() throws IOException{
		String deleteId = console("������ ���̵� : ");
		boolean isExested = false;
		for (int i =0; i < list.size() ; i++ ){
			Member m = list.get(i);
			if(deleteId.equals(m.getId())){	
				isExested = true;				
				list.remove (i);			
				break;
			} 
			if (! isExested) {
				System.out.println("������ ���̵� �����ϴ�.");
			} 
		}
		for (Member m1 : list){
			System.out.println(m1);
		}
		print();
		String message = console("�����ϼ��� : ");
		execute (message);
	}
	
	public void search() throws IOException{
		String searchId = console("�˻��� ���̵� : ");
		System.out.println("***********�˻� ���***********");
		boolean isExested = false;
		
		for (int i =0; i < list.size() ; i++ ){
			Member m = list.get(i);
			if(searchId.equals(m.getId())){	
				isExested = true;				
				System.out.println(m);			
				break;
			} 	
			if (! isExested) {
			System.out.println("�˻��� ����� �����ϴ�.");
		}			
	}
	
	for (Member m1 : list){
			System.out.println(m1);
	}	
	print();
	String message = console("�����ϼ��� : ");
	execute (message);
		
	}
	
	
	
	
	public static void main(String[] args) throws IOException {
		ConsoleApplication c = new ConsoleApplication();
		c.print();
		String message =  c.console("�����ϼ��� : ");
		c.execute(message);
				
	}

}
