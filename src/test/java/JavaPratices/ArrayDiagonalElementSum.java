package JavaPratices;

public class ArrayDiagonalElementSum {

	public static void main(String[] args) {

		int sum = 0;

		int arr[][] = { { 10, 20, 30 }, { 30, 50, 30 }, { 70, 30, 90 } };

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				if (i == j) {
					sum = sum + arr[i][j];
				}

			}
		}

		System.out.println("Diagonal sum is : " + sum);

	}

}
