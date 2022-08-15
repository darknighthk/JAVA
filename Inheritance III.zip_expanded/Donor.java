import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Donor extends Person{
	private String donorType,bloodGroup,donationDate;

	public String getDonorType() {
		return donorType;
	}

	public void setDonorType(String donorType) {
		this.donorType = donorType;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getDonationDate() {
		return donationDate;
	}

	public void setDonationDate(String donationDate) {
		this.donationDate = donationDate;
	}

	public Donor(String name, Date dateOfBirth, String gender, String mobileNumber, String bloodBankName,
			String donorType, String bloodGroup, String donationDate) {
		super(name, dateOfBirth, gender, mobileNumber, bloodBankName);
		this.donorType = donorType;
		this.bloodGroup = bloodGroup;
		this.donationDate = donationDate;
	}
	@Override
	public void displayDetails() throws ParseException {
		// TODO Auto-generated method stub
		super.displayDetails();
		//SimpleDateFormat dt = new SimpleDateFormat("dd-MM-yyyy"); 
		System.out.println("Donor Type: "+this.donorType);
		System.out.println("Blood Group: "+this.bloodGroup);
		System.out.println("Donation Date: "+this.donationDate);
	}

}

