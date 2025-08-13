package JavaPratices;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileClass {

	public static void main(String[] args) throws IOException {

		File file = new File("src/test/resources/test.txt");

		// file.createNewFile();

		System.out.println("File is Readable = " + file.canRead());

		System.out.println("File is Write = " + file.canWrite());

		// file.delete();

		System.out.println("Absloute path of file = " + file.getAbsoluteFile());

		System.out.println("Size of file = " + file.length());

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter data to write in file");

		String s = scanner.next();

		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write(s);
		fileWriter.close();

		FileReader fileReader = new FileReader(file);

		int i;
		

		while ((i = fileReader.read()) != -1) {

			System.out.print((char) i);
		}

	}

}
