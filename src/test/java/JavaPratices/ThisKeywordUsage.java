package JavaPratices;

public class ThisKeywordUsage {
	
	// instance member variable

	int a;
	int b;

	public ThisKeywordUsage() {

		System.out.println("Default Constructor");
	}

	public ThisKeywordUsage(int a) {

		System.out.println(a);
	}

	public ThisKeywordUsage(float a) {

		this(400);

		System.out.println(a);

		System.out.println("Hashcode using this = " + this.hashCode());

	}

	public ThisKeywordUsage(int a, int b) {

		this.a = a;
		this.b = b;

		System.out.println(this.a + this.b);
	}

	public static void main(String[] args) {

//		ThisKeywordUsage thisKeywordUsage = new ThisKeywordUsage();
//
//		System.out.println(thisKeywordUsage.a);

//		ThisKeywordUsage thisKeywordUsage1 = new ThisKeywordUsage(10);

//		 ThisKeywordUsage thisKeywordUsage4 = new ThisKeywordUsage(10,20);
		
		ThisKeywordUsage thisKeywordUsage3 = new ThisKeywordUsage(10.15f);

		System.out.println("Hahcode using refrence variable: " + thisKeywordUsage3.hashCode());

	}

}
