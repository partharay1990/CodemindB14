package JavaPratices;

public class ErrorInJava {

	public static void main(String[] args) {

		ErrorInJava errorInJava = new ErrorInJava();
		errorInJava.add(10, 20);
	}

	public void add(int a, int b) {

		System.out.println(a + b);
		add(10, 20);

	}

}
