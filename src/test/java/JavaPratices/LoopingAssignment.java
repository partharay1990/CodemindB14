package JavaPratices;

public class LoopingAssignment {

	public static void main(String[] args) {

		for (int j = 1; j <= 10; j++) {

			if (j % 2 == 0) {

				System.out.println("The Even is :" + j);
			}

			else {

				System.out.println("Odd number is : " + j);
			}

		}
		
		// while loop print 1 to 10 

		int i;

		i = 1;

		while (i <= 10) {

			System.out.println("Value of i :" + i);

			i++;
		}

		System.out.println("After loop Value of i :" + i);

	}

}
