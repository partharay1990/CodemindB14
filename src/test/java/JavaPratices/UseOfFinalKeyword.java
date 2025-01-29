package JavaPratices;

public class UseOfFinalKeyword {

	public static void main(String[] args) {

		// final variable declaration

		final int adharNumber = 951356;

		int b = 34567;

	//	adharNumber = 69865; // We cannot change final variable value

		b = 456;

	}
	
	
	class Vehicle{
		
		final public void ChangeGear() {
			
			System.out.println("Changing four wheeler vehicle gear.");
		}
	}
	
	class TwoWheelerVehicle extends Vehicle{
		
		// We cannot override final method
	/*	public void ChangeGear{
			
		} */
	} 

}
