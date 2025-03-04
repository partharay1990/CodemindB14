package JavaPratices;

public class ArrayExample {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50, 20, 60, 20 };

		// accessing Individual element
//		System.out.println("1st Element of array : " + arr[0]);
//		System.out.println("2nd Element of array : " + arr[1]);
//		System.out.println("3rd Element of array : " + arr[2]);
//		System.out.println("4th Element of array : " + arr[3]);
//		System.out.println("5th Element of array : " + arr[4]);
		System.out.println("Length of array: " + arr.length);

		// Iterating array
		for (int i = 0; i <= arr.length - 1; i++) {

			System.out.println("Element of position " + i + " : " + +arr[i]);
		}

		System.out.println("***************************");

		// reverse array

		for (int i = arr.length - 1; i >= 0; i--) {

			System.out.println("Element of position " + i + " : " + +arr[i]);
		}

		System.out.println("***************************");

		// Occurrence of array

		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 20) {
				count++;
			}
		}
		System.out.println("occurence of given element 20 is : " + count);

	}

}
