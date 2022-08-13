class Account{
	
	private String holderName;
	private Long accountNumber;
	private String IFSCCode;
	private Long contactNumber;
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getIFSCCode() {
		return IFSCCode;
	}
	public void setIFSCCode(String IFSCCode) {
		IFSCCode = IFSCCode;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Account(String holderName, Long accountNumber, String IFSCCode, Long contactNumber) {
		
		this.holderName = holderName;
		this.accountNumber = accountNumber;
		this.IFSCCode = IFSCCode;
		this.contactNumber = contactNumber;
	}
	
	public void display() {
		String s= "Your Contact Details\nHolderName : "+this.holderName+"\nAccount Number : "+this.accountNumber+
				"\nIFSCCode : "+this.IFSCCode+"\nContactNumber : "+this.contactNumber;
		System.out.println(s);

	}
	
	

}