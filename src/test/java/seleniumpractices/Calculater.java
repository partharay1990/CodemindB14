package seleniumpractices;

class CalculaterExample {

	// no return_type no argument

	void addition() {

		int a = 10;
		int b = 20;
		int c = a + b;

		System.out.println("Addition of a+b : " + c);
	}

	// no return_type with_argument

	void substraction(int a, int b) {
		int c = a - b;

		System.out.println("Substraction of a- b :" + c);
	}

	// with return_type no_argument

	int multiplication() {

		int a = 20;
		int b = 10;
		int c = a * b;
		return c;
	}

	// with return_type with_argument

	int division(int a, int b) {

		int c;
		c = a * b;
		return c;
	}
}

public class Calculater {

	public static void main(String[] args) {

		CalculaterExample cl = new CalculaterExample();
		cl.addition();
		cl.substraction(20, 10);
		int d = cl.multiplication();
		System.out.println("Multiplication of a*b : " + d);
		int e = cl.division(20, 10);
		System.out.println("DIvision of a/b : " + e);
		

	}

}
