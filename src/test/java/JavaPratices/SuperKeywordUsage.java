package JavaPratices;

class Parenit {

	int parentA = 100;
}

class childd extends Parenit {

	public childd() {
		super();
	}

	int parentA = 200;

	public void testParent() {

		System.out.println(super.parentA + parentA);
	}
}

public class SuperKeywordUsage {

	public static void main(String[] args) {

		childd ch = new childd();
		ch.testParent();

	}

}
