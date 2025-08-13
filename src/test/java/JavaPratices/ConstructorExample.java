package JavaPratices;

class Employee {

	int Eid;
	String name;
	float salary;

	Employee() {
		Eid = 101;
		name = "Asha";
		salary = 100000;

		System.out.println("This is no paramaterized constructor");
	}

	Employee(int id, String n, float s) {

		Eid = id;
		name = n;
		salary = s;

		System.out.println("This is 3 paramaterized constructor");
	}

	Employee(int id, float s) {

		Eid = id;
		salary = s;

		System.out.println("This is 2 paramaterized constructor");
	}

	Employee(int e) {

		Eid = e;

		System.out.println("This is 1 paramaterized constructor");
	}
}

public class ConstructorExample {

	public static void main(String[] args) {

		Employee e = new Employee();
		Employee e1 = new Employee(101, "Partha", 200000);
		Employee e2 = new Employee(102, 2000000);
		Employee e3 = new Employee(103);

	}

}
