package Abstraction;

public class HDFCBank extends AbstractClassDemo implements IRBI,ISEBI {

	@Override
	public void depositMoney() {
		System.out.println("HDFC Bank Depositing Money");
		
	}

	@Override
	public void withdrawMoney() {
		System.out.println("HDFC Bank Withdrawing Money");
		
	}

	@Override
	public void balanceCheckMoney() {
		System.out.println("HDFC Bank Checking Balance");
	}

	@Override
	public void ab1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void shortTermTreading() {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void longTermTreading() {
//		// TODO Auto-generated method stub
//		
//	}
	
	
}
