package JavaPratices;

public class RuntimeException {

	public static void main(String[] args) {

		int n = 100;
		int m = 20;

		try {

			int res = n / m;

			System.out.println("Result is : " + res);
		}

		catch (ArithmeticException e) {

			System.out.println("Error: Division by zero is not allowed!");

		}

		String str = null;
		try {

			System.out.println(str.length());
		}

		catch (NullPointerException e) {

		}

		catch (Exception e) {

		}

		finally {
			System.out.println("Program continues after handling the exception.");
		}

	}
}
