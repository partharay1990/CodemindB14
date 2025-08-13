package JavaPratices;

public class OddNumber {

	public static void main(String[] args) {

		/*
		 * int i = 1;
		 * 
		 * while (i <= 10) {
		 * 
		 * if (i % 2 == 0) { System.out.println("Even of : " + i); }
		 * 
		 * i++; }
		 */

		int j = 1;
		do {
			if (j % 2 == 0) {

				System.out.println("Even numbers:" + j);
			}
			
			j++;

		} while (j <= 20);

	}

}
