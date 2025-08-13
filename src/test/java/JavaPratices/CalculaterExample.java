package JavaPratices;

class Calculator {

	void addition() {

		int a = 10, b = 20, c;
		c = a + b;
		System.out.println("Addition of a+b is : " + c);
	}

	void substraction(int a, int b) {

		int c = a - b;

		System.out.println("Substraction of a-b is : " + c);
	}

	int multiplication() {

		int a = 20, b = 20, c;

		c = a * b;

		System.out.println("multiplication of a*b is : " + c);

		return c;

	}
	
	int division(int a, int b) {
		
		int c= a/b;
		
		return c;
	}
}

public class CalculaterExample {

	public static void main(String[] args) {

		Calculator calculater = new Calculator();
		calculater.addition();
		calculater.substraction(40, 20);
		int d = calculater.multiplication();
		System.out.println("multiplication of a*b is : " + d);
		int e =calculater.division(40, 20);
		System.out.println("Divison  of a/b is : " + e);

		

	}

}
