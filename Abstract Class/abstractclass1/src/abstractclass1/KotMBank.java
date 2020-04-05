package abstractclass1;

public class KotMBank extends GeneralBank {

	@Override
	public double getSavingInterestRate() {
		// TODO Auto-generated method stub
		System.out.print("Kotak M Bank ");
		return 6;
	}

	@Override
	public double getFixedDepositInterestRate() {
		// TODO Auto-generated method stub
		System.out.print("Kotak M Bank ");
		return 9;
	}

	
}
