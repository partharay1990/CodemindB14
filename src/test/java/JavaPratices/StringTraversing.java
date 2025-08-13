package JavaPratices;

public class StringTraversing {

	public static void main(String[] args) {

	/*	String str = "Codemind Technology";

		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(4));
		System.out.println(str.charAt(6));
		System.out.println(str.charAt(7));
		System.out.println(str.charAt(8));
		System.out.println(str.charAt(9));
		System.out.println(str.charAt(10));

		for (int i = 0; i < str.length(); i++) {

			System.out.print(str.charAt(i) + " ");
		}

		System.out.println("#################################");

		// string reverse

		for (int j = str.length() - 1; j >= 0; j--) {

			System.out.println(str.charAt(j) + " ");
		} */

		String city[] = { "Cuttack", "Jajpur", "Bhubaneswar", "Rourkela", "Bhadrak", "Balasore" };
		
		for(int i= 0; i< city.length; i++) {
			
			if(city[i]=="Cuttack") {
				
				String rev = city[i];
				
				for(int j=rev.length()-1;j>=0;j--) {
					
					System.out.println(rev.charAt(j));
				}
			}
		}
		
		String str ="Radar", revstr="";
		
		for(int k=str.length()-1;k>=0; k--) {
			
			 revstr = revstr + str.charAt(k);
			
		}
		
		System.out.println(revstr);
		
		if (str.toLowerCase(). equals(revstr.toLowerCase())) {

			System.out.println(str + " is a Palindrome String.");

		} else {
			System.out.println(str + " is not a Palindrome String.");
		}

	}

}
