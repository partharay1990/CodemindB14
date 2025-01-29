package JavaPratices;

 //import packagename.classname;
//import seleniumpractices.Calculater;
//import seleniumpractices.Multiplication;

// 1. import package.*;
//import seleniumpractices.*;

public class Addition {

	public static void main(String[] args) {
		
		// Fully qualified name
		seleniumpractices.Calculater calculater= new seleniumpractices.Calculater();
		int addition = calculater.add(10, 20);

		seleniumpractices.Multiplication multiplication = new seleniumpractices.Multiplication();
		int resultMult = multiplication.mult(10, 20);

		System.out.println("Addition of given number is:" + addition);
		System.out.println("Multiplication of given number is:" + resultMult);

	}

}
