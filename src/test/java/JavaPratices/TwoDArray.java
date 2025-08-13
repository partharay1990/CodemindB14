package JavaPratices;

public class TwoDArray {

	public static void main(String[] args) {
		
		
	/*	for(int i=0; i< 3 ;i++) { // Outer loop for Row
			
			System.out.println("Value of i :" + i);
			
			for (int j=0; j < 3 ; j++) { // Inner loop for column
				
				System.out.println("\t Value of j :" + j);
			}
			
		} */
		
	int arr[][] = { { 10, 20, 30 }, { 40, 20, 60 }, { 70, 20, 90 } };

	// System.out.println(arr[1][2]);

	for (int i = 0; i < arr.length; i++) {

		for (int j = 0; j < 3; j++) { // Inner loop for column

			System.out.print(arr[i][j] + " ");

		}

		System.out.println(" ");
	}
	
	// Array Sum of Diagonal number
	
	int sum = 0;

	for (int k = 0; k <= arr.length - 1; k++) {

		for (int l = 0; l <= arr.length - 1; l++) {

			if (k == l) {

				sum += arr[k][l];

			}
		}
	}
	System.out.println("Sum of Principal Diagonal:" + sum);
	
	//Occurence given numer in array
	
	int count=0;
	
	for(int x=0;x<=arr.length-1;x++) {
		
		for (int y=0; y<=arr.length-1;y++) {
			
			if(arr[x][y]==20) {
				
				count++;
			}
		}
	}
	
	System.out.println("Occurence given numer in array : " + count);
}

}
