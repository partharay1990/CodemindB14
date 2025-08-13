package JavaPratices;

public class StringAssignment {

	public static void main(String[] args) {

		String string = "CodeMind";

		// System.out.println("Character At 0th Index" + string.charAt(0));

		// Iterating String using for Loop

		for (int i = 0; i <= string.length() - 1; i++) {

			System.out.println("Character At " + i + " Index is: " + string.charAt(i));
		}

		System.out.println("*******************************");

		// Reverse of string

		for (int j = string.length() - 1; j >= 0; j--) {

			System.out.println("Character At " + j + " Index is: " + string.charAt(j));

			System.out.println("*******************************");

			// String Literal

			String str = "Rohit";
			str.concat("Patil");
			System.out.println(str);
			str = str.concat(" Patil");
			System.out.println(str);

		}
	}

}
