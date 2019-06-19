package practice_self;

public class Dog extends Animal {
	
	public void sleep() {
		System.out.println(this.name+" : ZZZ");
	}
	
	
	public static void main(String[] args) {
		Dog dog = new Dog();
	dog.setName("jjong");
	System.out.println(dog.name);
	}
}


