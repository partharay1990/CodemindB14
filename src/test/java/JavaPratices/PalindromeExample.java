package JavaPratices;

public class PalindromeExample {

	public static void main(String[] args) {

		String str = "Radar", reverseStr = "";
		
		//System.out.println(str.length());

		for (int i = str.length() - 1; i >= 0; i--) {

			reverseStr = reverseStr + str.charAt(i);
		}
		
		System.out.println(reverseStr);

		if (str.toLowerCase(). equals(reverseStr.toLowerCase())) {

			System.out.println(str + " is a Palindrome String.");

		} else {
			System.out.println(str + " is not a Palindrome String.");
		}
	}

}
