package JavaPratices;

class student {

	int rollNo;
	String name;
	float marks;

	void show() {
		System.out.println("Int variable : " + rollNo);
		System.out.println("String variable : " + name);
		System.out.println("Float variable : " + marks);

	}
}

public class DefaultConstructorExample {

	public static void main(String[] args) {

		student s1 = new student();
		student s2 = new student();

		s1.show();
		s2.show();
	}

}
