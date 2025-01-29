package JavaPratices;

public class ExcptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExcptionHandling eh = new ExcptionHandling();
		int result = eh.div(10, 3);

		System.out.println("Division Result:" + result);

	}

	public int div(int num, int num2) {

		int result = 0;

		try {

			// Code that may throw an exception

			result = num / num2;
		}

		catch (ArithmeticException e) {

			// Handling the exception

			System.out.println("Error: Division by zero is not allowed!");

		}

		catch (Exception a) {

			System.out.println("Error: Division by zero is not allowed!");

		}

		finally {

			System.out.println("Program continues after handling the exception.");

		}

		return result;
	}

}
