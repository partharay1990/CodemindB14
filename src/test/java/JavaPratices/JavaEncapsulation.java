package JavaPratices;

class Lapitop {

	private String name;

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

}

public class JavaEncapsulation {

	public static void main(String[] args) {

		Lapitop ll = new Lapitop();

		ll.setName("Partha"); // write

		System.out.println(ll.getName());

	}

}
