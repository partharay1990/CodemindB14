package JavaPratices;

class TypesOfVariableExmpl {

	int i = 200; // Class level => Instance variable
	static int j = 500;

	final float p = 3.14f;

	void show() {

		int a = 10; // Local variable

		System.out.println("Local variable a : " + a);
		System.out.println("Instance variable in method : " + i);

	}

	void print() {

		int b = 20;

		// System.out.println("Local variable b : " + b);
		System.out.println("Instance variable in method : " + i);
	}
}

public class TypesOfVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TypesOfVariableExmpl tv = new TypesOfVariableExmpl();
		tv.show();

		// tv.a; // as a is local variable of show method
		System.out.println("Instance variable with Object : " + tv.i);
		System.out.println("final variable : " + tv.p);
		System.out.println("static variable with class name :" + TypesOfVariableExmpl.j);
		System.out.println("static variable with Object : " + tv.j);

	}

}
