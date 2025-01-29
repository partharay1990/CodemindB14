package JavaPratices;

public class NumberFormateException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "123459f";

		try {

			int num = Integer.parseInt(str);

			System.out.println(num);
		}

		catch (NumberFormatException n) {

			System.out.println("NumberFormat Exception: invalid input string");
		}

	}

}
