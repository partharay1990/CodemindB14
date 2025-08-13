package JavaPratices;

class AA {
	public void print_A() {
		System.out.println("Class A");
	}
}

class B extends AA {
	public void print_B() {
		System.out.println("Class B");
	}
}

class C extends AA {
	public void print_C() {
		System.out.println("Class C");
	}
}

class D extends AA {
	public void print_D() {
		System.out.println("Class D");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B obj1 = new B();
		obj1.print_A();
		obj1.print_B();

		C obj2 = new C();
		obj2.print_A();
		obj2.print_C();

		D obj = new D();
		obj.print_D();
		obj.print_A();

	}

}
