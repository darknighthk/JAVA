import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person{
	private String name;
	private Date dateOfBirth;
	private String gender,mobileNumber,bloodBankName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getBloodBankName() {
		return bloodBankName;
	}
	public void setBloodBankName(String bloodBankName) {
		this.bloodBankName = bloodBankName;
	}
	public Person(String name, Date dateOfBirth, String gender, String mobileNumber, String bloodBankName) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.bloodBankName = bloodBankName;
	}
	
	public void displayDetails() throws ParseException {
		System.out.println("Name: "+this.name);
		SimpleDateFormat dt = new SimpleDateFormat("dd-MM-yyyy"); 
		//this.dateOfBirth=dt.parse(this.dateOfBirth.toString());
		System.out.println("Date Of Birth: "+ dt.format(this.dateOfBirth));
		System.out.println("Gender: "+this.gender);
		System.out.println("Mobile Number: "+this.mobileNumber);
		System.out.println("Blood BankName: "+this.bloodBankName);

	}
    }


