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
		
		System.out.println(str1.toUpperCase());
		
		System.out.println(str3);
		

		String city[]= {"pune", "Mumbai","Kolhapur","Nagpur","Nashik" };
		
		for (int i=0;i<city.length;i++) {
			
			if(city[i]=="Nashik") {
				
				String str = city[i];
				
			for(int j=city.length;j>=0; j--) {
				
				System.out.print(str.charAt(j));
			}
				
			}
			
			else {
				System.out.println(city[i]);
				
			}
		}
	}

}
