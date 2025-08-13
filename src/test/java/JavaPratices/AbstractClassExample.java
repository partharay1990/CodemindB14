package JavaPratices;

abstract class Calculater {

	void addition() {

		System.out.println("This is addition Method");
	}

	void substraction() {

		System.out.println("This is substraction Method");

	}

	void multiplication() {

		System.out.println("This is multiplication Method");

	}

	abstract void division();

	abstract void sincosOperation();

}

class Casio extends Calculater {

	void division() {

		System.out.println("This is Division Method.");
	}

	void sincosOperation() {
		System.out.println("This is Sincos Method.");
	}
}

public class AbstractClassExample {

	public static void main(String[] args) {

		// Calculater cal = new Calculater();
		Casio ca = new Casio();
		ca.division();
		ca.sincosOperation();

	}

}
