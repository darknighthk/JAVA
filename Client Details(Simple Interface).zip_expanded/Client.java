public class Client implements Display{
	private Integer clientId;
	private String firstName,middleName,lastName,phoneNumber,email,passport,iataCountryCode;
	
	public Client(Integer clientId, String firstName, String middleName, String lastName, String phoneNumber,
			String email, String passport, String iataCountryCode) {
		super();
		this.clientId = clientId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.passport = passport;
		this.iataCountryCode = iataCountryCode;
	}

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public String getIataCountryCode() {
		return iataCountryCode;
	}

	public void setIataCountryCode(String iataCountryCode) {
		this.iataCountryCode = iataCountryCode;
	}

	@Override
	public void displayClientDetails() {
		System.out.println("Client Details\n"
				+ "Client Id : "+this.clientId);
		System.out.println("First Name : "+this.firstName);
		System.out.println("Middle Name : "+this.middleName);
		System.out.println("Last Name : "+this.lastName);
		System.out.println("Phone Number : "+this.phoneNumber);
		System.out.println("Email : "+this.email);
		System.out.println("Passport : "+this.passport);
		System.out.println("IATA Country Code : "+this.iataCountryCode);
		
	}
	//Fill your code
}
