package JavaPratices;

class Gparent {

	int pid = 100;

	void parentShow() {

		System.out.println("This is Parent class method");
	}

}

class Child extends Gparent {

	int cid = 200;

	void childShow() {

		System.out.println("This is Child class method");

	}
}

public class SingleLevelInheritance {

	public static void main(String[] args) {

		Child child = new Child();

		Gparent gp = new Gparent();
		gp.parentShow();

		child.parentShow();
		child.childShow();

	}
}
