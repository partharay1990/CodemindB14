package JavaPratices;

class Operater {

	void uniaryOperater() {
		int a = 10;
		int b = 20;

		System.out.println("Postfix increment : " + (a++));
		System.out.println(a);

		System.out.println("Prefix increment: " + (++b));
		System.out.println(b);
	}

	void arithmeticOperater() {

		int a = 10, b = 20, c;
		c = a + b;

		System.out.println("Addition : " + c);

		c = b - a;

		System.out.println("Substraction : " + c);

		c = b * a;

		System.out.println("Multiplication : " + c);

		c = b / a;

		System.out.println("Division : " + c);

		c = b % 3;

		System.out.println("Modulus : " + c);

	}

	void relationalOperater() {

		int a = 10, b = 20;

		if (a < 100) {

			System.out.println("< operater => value of variable a Less than 100");
		}
		if (a <= 10) {

			System.out.println(" <= operater => value of  variable a Less than or equals to 100");
		}

		if (a > 5) {

			System.out.println(" > operater => value of  variable a Greter than 5");
		}
		if (a >= 5) {

			System.out.println(" >= operater => value of  variable a Greater than or equals 5");
		}
		if (a == 10) {

			System.out.println(" == operater => value of  variable a equals to 10");
		}

		if (a != 5) {

			System.out.println("!= operater => value of a not equals to b");
		}
	}

	void logicalOperater() {

		int a = 7;

		if (a > 5 && a < 10) {

			System.out.println("Value of a is greater than 5 & less than 10");
		}

		if (a > 5 || a < 1) {

			System.out.println("Value of a is greater than 5 & less than 1");

		}
	}

	void ternerayOperater() {

		int a = 20, b;

		b = a > 10 ? 100 : 200;

		System.out.println("value of b : " + b);
	}
}

public class OperaterExample {

	public static void main(String[] args) {

		Operater operater = new Operater();
		// operater.uniaryOperater();
		// operater.arithmeticOperater();
		// operater.relationalOperater();
		// operater.logicalOperater();
		operater.ternerayOperater();

	}

}
