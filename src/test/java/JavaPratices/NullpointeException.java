package JavaPratices;

public class NullpointeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = null;
		try {

			if (str.equals("Codemind")) {

				System.out.print("Same");
			} else {
				System.out.print("Not Same");
			}

		} catch (NullPointerException e) {

			System.out.println("NullPointer Exception Caught");
		}

	}

}
