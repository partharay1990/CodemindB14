package JavaPratices;

import java.util.Scanner;

public class TakeInputFromKeyboard {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first Number :");
		int a = scanner.nextInt();

		System.out.println("Enter Second Number :");
		int b = scanner.nextInt();

		System.out.println("Addition of two number: " + (a + b));

		while (scanner.hasNext()) {

			String s = scanner.next();

			System.out.println(s);
		}
	}

}
