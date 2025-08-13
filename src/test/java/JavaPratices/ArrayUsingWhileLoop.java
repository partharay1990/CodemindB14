package JavaPratices;

public class ArrayUsingWhileLoop {

	public static void main(String[] args) {

		int arr[] = { 20, 40, 60, 50, 30, 70, 80 };

		// Accessing Array element individually

		/*
		 * System.out.println("1st Element of Array : " + arr[0]);
		 * System.out.println("2nd Element of Array : " + arr[1]);
		 * System.out.println("3rd Element of Array : " + arr[2]);
		 * System.out.println("4th Element of Array : " + arr[3]);
		 * System.out.println("5th Element of Array : " + arr[4]);
		 * System.out.println("6th Element of Array : " + arr[5]);
		 * System.out.println("7th Element of Array : " + arr[6]);
		 */

		// Iterating Array using While Loop

//		int i = 0;
//
//		while (i < arr.length - 1) {
//
//			i++;
//
//			System.out.println("Element at position " + i + " : " + arr[i]);
//		}
//
//		System.out.println("********************************");
//
//		// Reverse Array Using while loop
//
		int j = arr.length-1;

		while (j >= 0) {

			
			System.out.println("Element at position " + j + " : " + arr[j]);
			
			j--;

			
		}

		// Occurence of given Element in Array

		int chr[]= {10,20,30,20,40,20,60,20};
		
		int count=0;
		int i=0;		
		while(i <= chr.length-1) {
			
			if(chr[i]==20) {
				
				count++;
			}
			
     		i++;
		}
		
		System.out.println("Occurence of given Element in Array :" + count);

		// array reverse using do while loop

//		int chr[] = { 100, 200, 300, 200, 400, 200, 600, 200 };
//
//		
//		 int k = chr.length-1;
//		  
//		  do { 
//			  System.out.println("Element at position " + k + " : " + chr[k]); 
//			  k--; 
//		  }
//		  while (k >= 0);
//		  System.out.println(chr.length);
//
//		// Occurence of given Element in Array
//
//		int count = 0;
//
//		int l = 0;
//
//		do {
//
//			if (chr[l] == 200) {
//
//				count++;
//			}
//
//			l++;
//
//		} while (l <= chr.length - 1);
//
//		System.out.println("Occurence of given Element in Array :" + count);

	}

}
