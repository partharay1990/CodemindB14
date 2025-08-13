package JavaPratices;

class Tata {

	int Tid = 200;

	void car() {

		System.out.println("parent class method");
	}
}

class Nexon extends Tata {

	int Nid = 300;

	void Ncar() {

		System.out.println("child class method");
	}
}

class Curvv extends Nexon {

	int Cid = 400;

	void Ccar() {

		System.out.println("Grand Child method");
	}
}

public class MultipleInheritanceExample {

	public static void main(String[] args) {

		Curvv cv = new Curvv();
		cv.car();
		cv.Ncar();
		cv.Ccar();
		System.out.println("Parent class data member :" + cv.Tid);
		System.out.println("Child class data member :" + cv.Nid);
		System.out.println("Grand child class data member :" + cv.Cid);

	}

}
