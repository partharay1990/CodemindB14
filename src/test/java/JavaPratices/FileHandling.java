package JavaPratices;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		
		File file = new File("src/test/resources/sample.txt");
		
	//	file.createNewFile(); // create a new file
		
	//	file.delete();       // delete a file
		
		boolean exist= file.exists();
		
		System.out.println("File is exist = " +  exist);
		System.out.println("File is readale = " + file.canRead());
		System.out.println("Absloute Path of File = " + file.getAbsolutePath());
		System.out.println("Size of File = " + file.length());
		System.out.println("Name of File = " + file.getName());
		
		FileWriter fileWriter = new FileWriter(file); // Write data in file
		
	/*	Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter data to write in file");
		
		String s = scanner.next(); */
		
		fileWriter.write("Welcome to India");
		
		fileWriter.close();
		
		FileReader fileReader = new FileReader(file); // Read data from file
		
		int i ;
		
		while((i = fileReader.read()) != -1) {
			
			System.out.print((char) i);
		}
		
		fileReader.close();
		
	}

}
