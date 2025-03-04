package JavaPratices;

public class StringExample {

	public static void main(String[] args) {

		String str = "Codemind";

		// String str1 = new String("Codemind");

		/*
		 * System.out.println("Character at 0th Index : " + str.charAt(0)); // C
		 * System.out.println("Character at 3rd Index : " + str.charAt(3)); // e
		 * System.out.println("Character at 5th Index : " + str.charAt(6)); // n
		 * 
		 * // string iteration
		 * 
		 * for (int i = 0; i < str.length(); i++) {
		 * 
		 * System.out.println("Character at " + i + " index is :" + str.charAt(i)); }
		 * 
		 * System.out.println("*****************************"); // string reverse
		 * 
		 * for (int i = str.length() - 1; i >= 0; i--) {
		 * 
		 * System.out.println(" Reverse Character at " + i + " index is :" +
		 * str.charAt(i)); }
		 * 
		 * 
		 * // counting of vowels int cnt = 0;
		 * 
		 * for (int i = 0; i < str.length() - 1; i++) {
		 * 
		 * if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
		 * str.charAt(i) == 'o' || str.charAt(i) == 'o') {
		 * 
		 * cnt++; }
		 * 
		 * }
		 * 
		 * System.out.println("Vowel of current Stering : " + cnt);
		 * 
		 * System.out.println(str.toUpperCase()); System.out.println(str.toLowerCase());
		 */
		// convert given character to upper case

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'd') {
				char ch = Character.toUpperCase(str.charAt(i));
				str= str.replace('d', ch);
			}
		}
		
		System.out.println(str);

	}

}
