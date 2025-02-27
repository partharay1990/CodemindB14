package JavaPratices;

class Test {

	int a = 10;
	static int b = 1000;

	void show() {

	}
}

public class TestExample {

	public static void main(String[] args) {

		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();

		System.out.println("variable a is :" + t1.a);
		System.out.println("variable a is :" + t2.a);
		System.out.println("variable a is :" + t3.a);

		t2.a = 100;

		System.out.println("*********************************");

		System.out.println("variable a is :" + t1.a);
		System.out.println("variable a is :" + t2.a);
		System.out.println("variable a is :" + t3.a);

		System.out.println("*********************************");

		System.out.println("variable b is :" + t1.b);
		System.out.println("variable b is :" + t2.b);
		System.out.println("variable b is :" + t3.b);

		t3.b = 300;

		System.out.println("*********************************");

		System.out.println("variable b is :" + t1.b);
		System.out.println("variable b is :" + t2.b);
		System.out.println("variable b is :" + t3.b);

	}

}
