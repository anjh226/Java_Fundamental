package java_20190604;

public class ImplementsClass implements InterB, InterC {

	@Override
	public void mB() {
		// TODO Auto-generated method stub
		System.out.println("ImplementClass - mB()");

	}

	@Override
	public void mC() {
		// TODO Auto-generated method stub
		System.out.println("ImplementClass - mC()");

	}

	public void mA() {
		// TODO Auto-generated method stub

	}

public static void main(String[] args) {
	InterB b = new ImplementsClass();
	b.mB();
	
	InterC c = new ImplementsClass();
	c.mC();
	
}
	
}
