package JavaPratices;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			int arr[] = { 10, 20, 30, 40, 50, 60 };

			System.out.println(arr[10]);
			//System.out.println(arr[3]);
		}

		catch (Exception a) {

			System.out.println("Something went wrong.");

		}

		finally {

			System.out.println("The 'try catch' is finished.");
		}

	}

}
