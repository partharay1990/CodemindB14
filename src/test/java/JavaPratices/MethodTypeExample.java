package JavaPratices;

public class MethodTypeExample {

	public static void main(String[] args) {

		MethodType mt = new MethodType();
		mt.noReturnTypeNoArgument();
		mt.noReturnTypeWithArgument(101, "Shweta");
		int a = mt.withReturntypeNoArgument();
		System.out.println("Returned value : " + a);
		int b = mt.withReturntypeWithArgument(10, 20);
		System.out.println("Returned value : " + b);

	}

}

class MethodType {

	// No Return_Type, No Argument

	void noReturnTypeNoArgument() {
		System.out.println("No Return_Type, No Argument");
	}

	// No Return_Type, With Argument

	void noReturnTypeWithArgument(int rollNo, String name) {
		System.out.println("No Return_Type, With Argument");

		System.out.println("Roll no: " + rollNo);
		System.out.println("Name: " + name);
	}

	// With Return_Type, No Argument

	int withReturntypeNoArgument() {
		System.out.println("With Return_Type, No Argument");
		return 10;
	}

	// With Return_Type, With Argument

	int withReturntypeWithArgument(int a, int b) {

		int c;
		System.out.println("With Return_Type, No Argument");
		c = a + b;
		return c;
	}

}
