package JavaPratices;

class DecisionMakingStatement {

	void ifStatement() {

		int balance = 50000;

		if (balance < 10000) {

			System.out.println("you will be chargeed 1000 rupees");
		}

		System.out.println("After If Statement");
	}

	void ifElseStatement() {

		int bal = 50000;

		if (bal < 10000) {

			System.out.println("you will be chargeed 1000 rupees");
		} else {

			System.out.println("you will be eligible for loan");
		}

		System.out.println("After If-Else Statement");
	}

	void ifElseIfStatement() {

		int bal = 300000;

		if (bal < 10000) {
			System.out.println("you will be chargeed Rupees 1000");
		} else if (bal > 10000 && bal < 100000) {
			System.out.println("you will be eligible for loan 50k");
		} else if (bal > 100000 && bal < 200000) {
			System.out.println("you will be eligible for loan 1 Lakh");
		} else if (bal > 200000 && bal < 300000) {
			System.out.println("you will be eligible for loan 1.5 Lakh");
		}else if (bal >= 300000 && bal < 400000) {
			System.out.println("you will be eligible for loan 2 Lakh");
		} else {
			
			System.out.println("you will be eligible for loan 10 Lakh");
		}

	}
}

public class DecisionMakingStatementExample {

	public static void main(String[] args) {

		DecisionMakingStatement dc = new DecisionMakingStatement();
		// dc.ifStatement();
		//dc.ifElseStatement();
		dc.ifElseIfStatement();
	}

}
