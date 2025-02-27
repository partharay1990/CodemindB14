package JavaPratices;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class CompileTimeException {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		 //File file = new File ("d:/test.txt");
		  
		 //FileInputStream fis = new FileInputStream(file); file.createNewFile();
		 

		CompileTimeException cte = new CompileTimeException();
		System.out.println(cte.div(10, 2));
		// System.out.println(cte.div(10, 0)); // ArithmeticException

		String s = "12345";
		// String s = "12345tr"; // NumberFormatException
		int num = Integer.parseInt(s);
		System.out.println(num);

		// String ss= null; // NullPointerException
		String ss = "Welcome to Codemind";
		ss.length();

		String sss = "Welcome to Codemind";
		// System.out.println(sss.charAt(20)); // StringIndexOutOfBoundsException
		System.out.println(sss.charAt(17));

		int[] array = { 10, 20, 30, 40 };

		// System.out.println(array[4]); // ArrayIndexOutOfBoundsException
		System.out.println(array[3]);

		System.out.println("After getting Exception");

	}

	public float div(int a, int b) {

		return a / b;
	}

}
