import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception, IOException {
		String customerName,customerEmail,customerType,customerAddress;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Customer Details\n"
				+ "Enter the name");
		customerName=scanner.next();
		System.out.println("Enter the email");
		customerEmail = scanner.next();
		System.out.println("Enter the type");
		customerType = scanner.next();
		System.out.println("Enter the location");
		customerAddress =scanner.next();
		
		Customer c=new Customer(customerName, customerEmail, customerType, customerAddress);
		c.displayDetails();


	}
}


