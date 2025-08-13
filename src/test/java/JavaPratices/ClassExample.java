package JavaPratices;

class javaExample {

	int itemPrice = 19;
	String itemName = "rice";

	void item() {

		System.out.println("First Method");
	}
}

public class ClassExample {

	public static void main(String[] args) {

		javaExample jExample = new javaExample();
		jExample.item();
		System.out.println("Item pice is : " + jExample.itemPrice);
		System.out.println("Item Name is : " + jExample.itemName);
	}

}
