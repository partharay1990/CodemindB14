package JavaPratices;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		// nested loop

	/*	for (int i = 0; i < 3; i++) { //outer loop =>Row

			System.out.println("value of i : " + i);

			for (int j = 0; j < 3; j++) { //inner loop => column

				System.out.println("\t value of j : " + j);

			}
		} */

		int arr[][] = { { 10, 20, 30, 90 }, { 30, 50, 30, 50 }, { 70, 30, 90, 30 } };

//		System.out.println(arr[0][0]); //10
//		System.out.println(arr[1][0]); //40
//		System.out.println(arr[2][1]); //80

		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length+1; j++) {

				if (arr[i][j] == 30) { // occurrence
					count++;
				}

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();

		}

		System.out.println("occurance of given number 30 is : " + count);

	}
}
