package JavaPratices;

interface A {

	void addition();

	void substraction();

	void multiplication();

	void division();

	public static final int sum = 0;

}

class Cal implements A {

	public void addition() {

		System.out.println("This is addition method");
	}

	public void substraction() {

		System.out.println("This is substraction method");
	}

	public void multiplication() {

		System.out.println("This is multiplication method");
	}

	public void division() {

		System.out.println("This is division method");
	}

}

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cal c = new Cal();
		c.addition();

	}

}
