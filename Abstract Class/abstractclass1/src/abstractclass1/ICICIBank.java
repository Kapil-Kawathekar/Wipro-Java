package abstractclass1;

public class ICICIBank extends GeneralBank{

	@Override
	public double getSavingInterestRate() {
		// TODO Auto-generated method stub
		System.out.print("ICICI Bank ");
		return 4;
	}

	@Override
	public double getFixedDepositInterestRate() {
		// TODO Auto-generated method stub
		System.out.print("ICICI Bank ");
		return 8.5;
	}
	

}
