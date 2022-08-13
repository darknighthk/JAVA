class SavingsAccount extends Account{
	private Double interestRate;
	
	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public SavingsAccount(String holderName, Long accountNumber, String IFSCCode, Long contactNumber,
			Double interestRate) {
		super(holderName, accountNumber, IFSCCode, contactNumber);
		this.interestRate = interestRate;
	}
	
	@Override
	public void display() {
		super.display();
		String s="\nInterest Rate : "+String.format("%.2f", this.interestRate);
		System.out.println(s);
	}
	
	
}