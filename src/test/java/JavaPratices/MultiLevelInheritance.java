package JavaPratices;

class Animal {

	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal {

	void bark() {
		System.out.println("barking...");
	}
}

class Babydog extends Dog {

	void weep() {
		System.out.println("weeping...");
	}

}

public class MultiLevelInheritance {

	public static void main(String[] args) {

		Babydog babydog = new Babydog();
		babydog.eat();
		babydog.bark();
		babydog.weep();
		Animal animal = new Animal();

	}

}
