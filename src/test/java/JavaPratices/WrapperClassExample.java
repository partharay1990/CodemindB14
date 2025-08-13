package JavaPratices;

public class WrapperClassExample {

	public static void main(String[] args) {

		String str = "Welcome to 1234Codemind Technology Pune";

		for (int i = 0; i < str.length(); i++) {

			/*
			 * if(Character.isUpperCase(str.charAt(i))) {
			 * 
			 * System.out.println(str.charAt(i)); }
			 */

			if (Character.isDigit(str.charAt(i))) {

				System.out.println(str.charAt(i));
			}
		}

		int num = Integer.parseInt("34567");

	}

}
