package JavaPratices;

class sstudent {

	// Data member's

	int rollNo = 101;
	String name = "Partha";
	float marks = 98.2f;

	void printData() {

		System.out.println("Rollno" + rollNo);
		System.out.println("Name" + name);
		System.out.println("Marks" + marks);
	}
}

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sstudent s1 = new sstudent();
		System.out.println("Rollno : " + s1.rollNo);
		System.out.println("Name : " + s1.name);

	}

}
