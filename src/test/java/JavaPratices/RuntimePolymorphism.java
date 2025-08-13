package JavaPratices;

class Paarent {

	void show(int a, String str) {

		System.out.println("Show method of Parent class");
	}

}

class Chilld extends Paarent {

	void show(int a, String str) {

		System.out.println("Show method of Child class");
	}
	
	void display() {
		
		System.out.println("display method of Child class");
	}

}

public class RuntimePolymorphism {

	public static void main(String[] args) {

		Chilld ch = new Chilld();
		ch.show(10, "Partha");
		
		Paarent pp= new Paarent();
		pp.show(20, "Lucky");
		
		Paarent p1 = new Chilld();
		p1.show(30, "Suchi");
		
		//Chilld ch1 = new Paarent(); // we can't store object of parent into child class refrence
	}

}
