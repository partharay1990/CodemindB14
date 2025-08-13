package JavaPratices;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class CompileTimeException {

	public static void main(String[] args) throws IOException,NullPointerException,IndexOutOfBoundsException {

		File file = new File("d:/test.txt");

		file.createNewFile();

		FileInputStream fileinputstream = new FileInputStream(file);

		CompileTimeException compileTimeException = new CompileTimeException();

		System.out.println(compileTimeException.div(10, 2));

		// System.out.println(compileTimeException.div(10, 0)); // ArithmeticEception

		String s = "1234";
		
		int num = Integer.parseInt(s);
		
		System.out.println(num);

		//String ss = null;
		String ss= "Welcome to Codemind";
		ss.length();
		
		String sss= "Welcome to Codemind";
		System.out.println(sss.charAt(18));
		
		int arr[] = {10,20,30,40};
		System.out.println(arr[3]);
	}

	public float div(int a, int b) {

		int c = a / b;

		return c;
	}

}
