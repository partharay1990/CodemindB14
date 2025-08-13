package JavaPratices;

class Animall {

	void Asound() {
		System.out.println("Animall makes a sound");
	}
}

class Dogg extends Animall {

	void Dsound() {
		System.out.println("Dogg barks");
	}
}

class Catt extends Animall {

	void Csound() {
		System.out.println("Catt meows");
	}
}

class Coww extends Animall {

	void Cwsound() {
		System.out.println("Coww moos");
	}
}

public class HierarchicalInheritanceExmp {

	public static void main(String[] args) {

		Coww cw = new Coww();
		cw.Asound();
		cw.Cwsound();

		Catt ca = new Catt();
		ca.Asound();
		ca.Csound();

		Dogg dg = new Dogg();
		dg.Asound();
		dg.Dsound();

	}

}
