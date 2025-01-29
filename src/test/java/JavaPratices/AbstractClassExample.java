package JavaPratices;

abstract class Calculater {

	void addition() {

		System.out.println("This is addition Method");
	}

	void substraction() {

		System.out.println("This is substarction Method");
	}

	void multiplication() {

		System.out.println("This is multiplication Method");
	}

	abstract void division();

	abstract void sincosOperation();
}

class casio extends Calculater {

	void division() {

	}

	void sincosOperation() {

	}
}

public class AbstractClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Calculater cal = new Calculater();

	}

}
