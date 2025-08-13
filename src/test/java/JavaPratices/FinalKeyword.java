package JavaPratices;



class Vechile {

	final int adharNumber = 20;

	final public void changeGear() {

		System.out.println("Change Gear");
	}
}

 final class TwoWheeler extends Vechile {

	// we cannot override final method

//	public void changeGear() {
//
//		System.out.println("Change Gear");
//	}
}
// final class cannot be inherited
//class Bicycle extends TwoWheeler{
//	
//}

public class FinalKeyword {

	public static void main(String[] args) {

	}

}
