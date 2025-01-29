package JavaPratices;

interface A {

	void Add();

	void Sub();

	void Mul();

	void Div();
}

class Cal implements A {

	public void Add() {

		System.out.println("This is Addition Method");
	}

	public void Sub() {

		System.out.println("This is Substraction Method");
	}

	public void Mul() {

		System.out.println("This is Multiplaction Method");
	}

	public void Div() {

		System.out.println("This is Division Method");
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cal c = new Cal();
		c.Add();

	}

}
