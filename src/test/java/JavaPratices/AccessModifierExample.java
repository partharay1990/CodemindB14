package JavaPratices;

class AccessModifier {

	public int a = 10; // public variable
	int b = 20; // Default variable
	private int c = 30; // private
	protected int d = 40;

	void Display() {

		System.out.println("Public Variable a is : " + a);
		System.out.println("Default Variable b is : " + b);
		System.out.println("Private Variable c is : " + c);
		System.out.println("Private Variable d is : " + d);

	}
}

public class AccessModifierExample {

	public static void main(String[] args) {

		AccessModifier am = new AccessModifier();

		am.Display();

		System.out.println("Public Variable a :" + am.a);
		System.out.println("Default Variable b : " + am.b);
		// System.out.println("Private Variable c : " + am.c);
		System.out.println("Protected Variable d : " + am.d);

	}

}
