package JavaPratices;

class OldColor {

	String color = "Black";

	OldColor() {
		System.out.println("Parent class constructer");
	}

	public void show() {

		System.out.println("Parent class method");
	}

}

class NewColor extends OldColor {

	String color = "Red";

	NewColor() {
		super();

		System.out.println("Child class constructer");
	}

	public void print() {

		System.out.println("New class color : " + color);
		System.out.println("Old class color : " + super.color);
	}
}

public class SuperKeywordUse {

	public static void main(String[] args) {

		NewColor nw = new NewColor();
		//nw.print();

	}

}
