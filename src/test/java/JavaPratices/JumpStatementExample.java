package JavaPratices;

public class JumpStatementExample {

	public static void main(String[] args) {
		
		// break statement
		
		for(int i=1;i<=10;i++) {
			
			if(i==5) {
				break;
			}
			
			else {
				
				System.out.println("Value of i : " + i);
			}
		}

		System.out.println("******************");
		
		// continue statement
		
		for(int j=1;j<=10;j++) {
			
			if(j==5) {
				
				continue;
			}
			
			else {
				
				System.out.println("Value of j : " + j);
			}
		}

	}

}
