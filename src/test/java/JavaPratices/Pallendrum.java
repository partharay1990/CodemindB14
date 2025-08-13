package JavaPratices;

public class Pallendrum {

	public static void main(String[] args) {

		String str = "radar";
		String revstr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			revstr = revstr + str.charAt(i);
		}

		if (str.equals(revstr)) {
			System.out.println("Given string is a Palindrome");
		} else {
			System.out.println(str + " is not a Palindrome String.");
		}

	}

}
