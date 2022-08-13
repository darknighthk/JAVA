
public class CurrentAccount extends Account{
	private String organizationName;
	private Long TIN;
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public Long getTIN() {
		return TIN;
	}
	public void setTIN(Long tIN) {
		TIN = tIN;
	}
	public CurrentAccount(String holderName, Long accountNumber, String IFSCCode, Long contactNumber,
			String organizationName, Long tIN) {
		super(holderName, accountNumber, IFSCCode, contactNumber);
		this.organizationName = organizationName;
		TIN = tIN;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		String s= "\nOrganization Name : "+this.organizationName+"\nTIN : "+this.TIN;
		System.out.println(s);
	}
	

		
	//Fill your code
		
	

}
