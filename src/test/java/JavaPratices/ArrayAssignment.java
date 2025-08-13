package JavaPratices;

public class ArrayAssignment {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 20, 50, 20, 500 };

		// Accessing indivisual Array

		
		  System.out.println("1st Element of Array : " + arr[0]);
		  System.out.println("3rd Element of Array : " + arr[2]);
		  System.out.println("4th Element of Array : " + arr[3]);
		  System.out.println("2nd Element of Array : " + arr[1]);
		  System.out.println("5th Element of Array : " + arr[4]);
		 
		  System.out.println("Lenght of Array : " + arr.length);
		  
		  // Iterating Array
		  
		  for (int i = 0; i <= arr.length-1; i++) {
		  
		  System.out.println("Element at position " + i + " : "+ arr[i]); }
		  
		  // Array Reverse
		  
		  for (int i = arr.length-1;i>=0;i--) {
		  
		  System.out.println("Element at position " + i + " : "+ arr[i]);
		  
		  }
		 

		// Occurence of given Element in Array

		int count = 0;

		for (int i = 0; i <= arr.length - 1; i++) {

			if (arr[i] == 20) {

				count++;
			}
		}

		System.out.println("Occurence of Given Elemeent is : " + count);
		
		//

	}

}
