package Abstraction;

public class App {

	public static void main(String[] args) {
		HDFCBank ob1 = new HDFCBank();
		ob1.depositMoney();
		ob1.withdrawMoney();
		ob1.balanceCheckMoney();
		ob1.notification();
		ob1.longTermTreading();
		
		ISEBI obj = new HDFCBank();
		obj.shortTermTreading();
		
	}

}
