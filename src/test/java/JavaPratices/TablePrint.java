package JavaPratices;

public class TablePrint {

	public static void main(String[] args) {
		
		int table=30;
		
		for(table=1;table<=30;table++) {
			
			for(int i=1;i<=10;i++) {
				
				System.out.println(table + " * " + i + " = " + table * i);
			}
			
			System.out.println("********************");
		}
		
		int num=10;
		
		for(int i=1;i<=20;i++) {
			
			System.out.println(num + " * " + i + " = " + num * i);
		}

	}

}
