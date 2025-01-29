package JavaPratices;

public class UseOfThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UseOfThrow us = new UseOfThrow();
		System.out.println(us.div(20, 10));

	}

	public int div(int num, int num2) {

		if (num2 < 1) {

			throw new ArithmeticException("Please Don't try to Divide By zero");
		}

		int result = num / num2;

		return result;

	}

}
