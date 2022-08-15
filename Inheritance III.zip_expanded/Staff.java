import java.text.ParseException;
import java.util.Date;

public class Staff extends Person{
    private Integer employeeID;
    private String designation;
	public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Staff(String name, Date dateOfBirth, String gender, String mobileNumber, String bloodBankName,
			Integer employeeID, String designation) {
		super(name, dateOfBirth, gender, mobileNumber, bloodBankName);
		this.employeeID = employeeID;
		this.designation = designation;
	}
    @Override
    public void displayDetails() throws ParseException {
    	// TODO Auto-generated method stub
    	super.displayDetails();
    	
    	System.out.println("Employee ID: "+this.employeeID);
    	System.out.println("Designation: "+this.designation);
    }
}
