package JavaPratices;

class Calculatorr {

	void addition() {

		System.out.println("No Argument");
	}

	int addition(int a, int b) {

		return a + b;
	}

	int addition(int a, int b, int c) {

		return a + b + c;

	}

	void addition(int a, int b, String c, Float f) {

		System.out.println("Method is 4 Argument");
	}
}

public class MethodOverloadingExmp {

	public static void main(String[] args) {

		Calculatorr calc = new Calculatorr();
		calc.addition();
		System.out.println("Addition of  three number : " + calc.addition(30, 40, 50));
		calc.addition(100, 200, "Partha", 20.8f);
		System.out.println("addition of two number : " + calc.addition(10, 20));

	}

}
