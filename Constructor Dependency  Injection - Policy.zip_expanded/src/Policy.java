public class Policy {
	String policyId;
    Double policyValue;
    Double coveragePercentage;
    Customer customer;
	
	public Policy() {
		super();
	}
	public Policy(String policyId, Double policyValue, Double coveragePercentage, Customer customer) {
		super();
		this.policyId = policyId;
		this.policyValue = policyValue;
		this.coveragePercentage = coveragePercentage;
    	this.customer = customer;
	}
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public Double getPolicyValue() {
		return policyValue;
	}
	public void setPolicyValue(Double policyValue) {
		this.policyValue = policyValue;
	}
	public Double getCoveragePercentage() {
		return coveragePercentage;
	}
	public void setCoveragePercentage(Double coveragePercentage) {
		this.coveragePercentage = coveragePercentage;
	}
    public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

    	//Fill your code here
}


