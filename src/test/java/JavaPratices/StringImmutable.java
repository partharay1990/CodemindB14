package JavaPratices;

public class StringImmutable {

	public static void main(String[] args) {
        
		// string immutable
		
		String str1 = "Rohit";
		String str2 = "Rohit";
		String str3 = "Rohit";

		str1.concat(" Patil");
		
		System.out.println(str1); // Updating existing value
		
		str1 = str1.concat(" Patil");

		System.out.println(str1);
		System.out.println(str3);

	}

}
