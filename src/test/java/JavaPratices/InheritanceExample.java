package JavaPratices;

class Paaarent {

	int pid = 100;

	void pshow() {

		System.out.println("Parent show method");
	}
}

class child extends Paaarent {

	int cid = 200;

	void cshow() {
		System.out.println("Child show method");
	}
}

public class InheritanceExample {

	public static void main(String[] args) {
		
		child ch= new child();
		ch.cshow();
		ch.pshow();

	}

}
