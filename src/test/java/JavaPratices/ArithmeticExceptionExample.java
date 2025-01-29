package JavaPratices;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArithmeticExceptionExample ar = new ArithmeticExceptionExample();
		int result = ar.div(20, 0);

		System.out.println("Division Result:" + result);

	}

	public int div(int m, int n) {

		int p = 0;

		try {

			p = m / n;
		}

		catch (Exception r) {

			System.out.println("Error: Division by zero is not allowed!");
		}

		return p;
	}

}
