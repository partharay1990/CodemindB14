package JavaPratices;

class Helper {

	void add() {
		System.out.println("This add method is no Argument");
	}

	void add(int a, int b) {

		System.out.println("This add method is 2 Arguments");

	}

	void add(int a, int b, int c) {

		System.out.println("This add method is 3 Arguments");

	}

	void add(int a, int b, int c, int d) {

		System.out.println("This add method is 4 Arguments");

	}

	void add(int a, String str) {
		
		System.out.println("This add method with one int and one string");
		
	}

}

public class CompiletimePolymorphism {

	public static void main(String[] args) {

		Helper help = new Helper();
		help.add();
		help.add(20, 30);
		help.add(10, 20, 30);
		help.add(20, 30, 40, 50);
		help.add(20, "Partha");

	}

}
