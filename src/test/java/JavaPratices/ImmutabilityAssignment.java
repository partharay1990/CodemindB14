package JavaPratices;

public class ImmutabilityAssignment {

	public static void main(String[] args) {

		// String Buffer

		StringBuffer stringBuffer = new StringBuffer("Rohit");
		stringBuffer.append(" Ray");
		System.out.println(stringBuffer);

		// String Builder

		StringBuilder sb1 = new StringBuilder("Codemind");
		sb1.append(" Technology");
		System.out.println(sb1);

		// Counting of vowels
		
		String str = "Codemind";
		int count = 0;

		for (int i = 0; i <= str.length() - 1; i++) {

			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' ||str.charAt(i) == 'i'|| str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				count++;

			}
		}
		System.out.println("Number of vowels are present on current string  are :" + count);
		
		System.out.println("******************************");
		
		// COvert string to upper case
		
		for(int j=0;j<=str.length()-1;j++) {
			
			if(str.charAt(j)=='d') {
				
				char ch = Character.toUpperCase(str.charAt(j));
				str =str.replace('d', ch);
				
				//System.out.println(ch);
				
			}
		}System.out.println(str);
	}

}
