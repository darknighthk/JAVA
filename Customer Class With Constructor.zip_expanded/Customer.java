public class Customer{
	private String customerName,customerEmail,customerType,customerAddress;
	
	public Customer(String customerName, String customerEmail, String customerType, String customerAddress) {
		super();
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerType = customerType;
		this.customerAddress = customerAddress;
	}

	public void displayDetails(){

		System.out.println("Name: "+this.customerName);
		System.out.println("E-mail: "+this.customerEmail);
		System.out.println("Type: "+this.customerType);
		System.out.println("Location: "+this.customerAddress);

	}
	
}
