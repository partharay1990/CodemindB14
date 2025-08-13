package JavaPratices;

class UniaryOperater {

	static void operater() {

		int a = 20, b = 20;
		System.out.println("Prefix increment :" + ++a);
		System.out.println("Postfix increment :" + b++);
		System.out.println("After Updation :" + b);
	}

	static void arithmaticOperater() {

		int a = 25, b = 5, c;
		c = a + b;
		System.out.println("Addition : " + c);
		c = a - b;
		System.out.println("Substraction : " + c);
		c = a * b;
		System.out.println("Multiplication : " + c);
		c = a / b;
		System.out.println("Division : " + c);
		c = a % 2;
		System.out.println("Modulus : " + c);

	}
	
	void assignmentOperater() {
		
		int a= 20, b= 30, c=40, d=100;
		
		a+=20; //a= a+20
		
		System.out.println("Value of a is : " + a);
		
		b-=10; //b= b-10;
		
		System.out.println("Value of b is : " + b);
		
		c*=10; //c=c*20;
		
		System.out.println("Value of c is : " + c);
		
		d/=20; // d=d/20;
		
		System.out.println("Value of d is : " + d);
	}
	
	void ternaryOperater() {
		
		int a=20 ,b;
		
		b = a > 50 ?100:200;
		
		System.out.println("Value of b is : " + b);
	}
}

public class UniaryOperaterExample {

	public static void main(String[] args) {

		UniaryOperater un = new UniaryOperater();
		//UniaryOperater.operater();
		//UniaryOperater.arithmaticOperater();
		//un.assignmentOperater();
		un.ternaryOperater();
	}
}
