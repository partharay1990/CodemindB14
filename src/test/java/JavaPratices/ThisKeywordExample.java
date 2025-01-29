/*package JavaPratices;

public class ThisKeywordExample {

	public static void main(String[] args) {

		// ThisKeywordExample thisKeywordExample = new ThisKeywordExample();

		// System.out.println(thisKeywordExample.a);

		// ThisKeywordExample thisKeywordExample2 = new ThisKeywordExample(10, 20);

		// ThisKeywordExample thisKeywordExample3 = new ThisKeywordExample(10.15f);
		
		// System.out.println("Hash Code using refrence variable = " + thisKeywordExample3.hashCode());

	}

	int a;
	int b;

	public ThisKeywordExample() {

		System.out.println("This is Default Constructor");
	}

	public ThisKeywordExample(int a) {

		System.out.println(a);
	}

	public ThisKeywordExample(int a, int b) {
		// this keyword is used differentiate between local & instance member variable

		this.a = a;
		this.b = b;

		System.out.println(this.a + this.b);
	}

	public ThisKeywordExample(float a) {
		
		this(100); // Calling one constructor from another constructor
		
		System.out.println(a);
		
		System.out.println("Hashcode using this = " + this.hashCode());
		
		
	}

} */
