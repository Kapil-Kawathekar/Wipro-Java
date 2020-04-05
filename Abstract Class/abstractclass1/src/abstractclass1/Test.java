package abstractclass1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ICICIBank i=new ICICIBank();
		System.out.println("Savings Interest Rate : "+i.getSavingInterestRate()+"%");
		System.out.println("Fixed Deposit Interest Rate : "+i.getFixedDepositInterestRate()+"%");
		
		KotMBank k=new KotMBank();
		System.out.println("Savings Interest Rate : "+k.getSavingInterestRate()+"%");
		System.out.println("Fixed Deposit Interest Rate : "+k.getFixedDepositInterestRate()+"%");
	
		GeneralBank g=new KotMBank();
		System.out.println("Savings Interest Rate : "+g.getSavingInterestRate()+"%");
		System.out.println("Fixed Deposit Interest Rate : "+g.getFixedDepositInterestRate()+"%");
		
		GeneralBank h=new ICICIBank();
		System.out.println("Savings Interest Rate : "+h.getSavingInterestRate()+"%");
		System.out.println("Fixed Deposit Interest Rate : "+h.getFixedDepositInterestRate()+"%");
		
		
	}

}
