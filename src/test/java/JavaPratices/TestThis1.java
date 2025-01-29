package JavaPratices;

// local variable instance variables are same

/*class Student {
	int rollno;
	String name;
	float fee;

	Student(int rollno, String name, float fee) {
		rollno = rollno;
		name = name;
		fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
} */

// using this keyword to distinguish local variable and instance variable

class Student {
	int rollno;
	String name;
	float fee;

	Student(int rollno, String name, float fee) {
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}

public class TestThis1 {

	public static void main(String[] args) {

		Student s1 = new Student(111, "ankit", 5000f);
		Student s2 = new Student(112, "sumit", 6000f);
		Student s3 = new Student(113, "Partha", 6050f);

		s1.display();
		s2.display();

	}

}
