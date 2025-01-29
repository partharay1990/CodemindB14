package JavaPratices;

class Laptop {

	private int rollNo;
	private String name;

	public void setRollNo(int rno) {

		rollNo = rno;
	}

	public int getRollno() {

		return rollNo;

	}

	public void setName(String nm) {

		name = nm;
	}

	public String getName() {

		return name;
	}
}

public class EncapsulationExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Laptop laptop = new Laptop();
		laptop.setRollNo(102); // write
		laptop.setName("Partha");

		System.out.println(laptop.getRollno()); // Read
		System.out.println(laptop.getName());

	}

}
