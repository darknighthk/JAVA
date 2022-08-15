import java.io.*;
import java.util.*;
import java.text.*;
 
public class Main {
    public static void main(String args[])throws Exception{

            Scanner br=new Scanner(System.in);
            String DOB,gen,mobilenum,bloodgroup,bloodbankname,donortype,donationdate,designation;
            int employeeid;

            System.out.println("Enter the Name");
            String name = br.nextLine();

            System.out.println("Enter Date of birth");
            DOB =br.next();
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            
            System.out.println("Enter the gender");
            gen =br.next();
            System.out.println("Enter mobile number");
            mobilenum=br.next();


            System.out.println("Enter blood bank name");
            bloodbankname = br.next();
            System.out.println("Enter your Choice"+'\n'+"1. Donor"+'\n'+"2. Staff");
            int option = br.nextInt();
            switch(option) {
                    case 1: {
                            System.out.println("Enter the donor type");
                            donortype = br.next();
                            System.out.println("Enter the blood group");
                            bloodgroup = br.next();
                            System.out.println("Enter donation date");
                            donationdate = br.next();
                            Donor d = new Donor(name,formatter.parse(DOB), gen, mobilenum, bloodbankname, donortype, bloodgroup, donationdate);
                            d.setName(name);
                            d.setDateOfBirth(formatter.parse(DOB));
                            d.setGender(gen);
                            d.setMobileNumber(mobilenum);
                            d.setBloodGroup(bloodgroup);
                            d.setBloodBankName(bloodbankname);
                            d.setDonorType(donortype);
                            d.setDonationDate(donationdate);
                            d.displayDetails();
                            //d.displayDetails();
                            break;

                    }
                    case 2: {
                            System.out.println("Enter the employee ID");
                            employeeid = br.nextInt();
                            System.out.println("Enter designation");
                            designation = br.next();

                            Staff f = new Staff(name,formatter.parse(DOB), gen, mobilenum, bloodbankname, employeeid, designation);
                            f.setName(name);
                            f.setDateOfBirth(formatter.parse(DOB));
                            f.setGender(gen);
                            f.setMobileNumber(mobilenum);

                            f.setBloodBankName(bloodbankname);
                            f.setEmployeeID(employeeid);
                            f.setDesignation(designation);
                            f.displayDetails();
                            //f.displayStaffdetails();
                            break;

                    }


            }


    }
    }