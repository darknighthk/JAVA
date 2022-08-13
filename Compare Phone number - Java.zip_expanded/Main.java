import java.io.*;
import java.nio.channels.NonReadableChannelException;
import java.util.Scanner;

class Main{
	
	public static void main(String[] args) throws Exception{ 		
		Scanner scanner=new Scanner(System.in);
		String name,username,password;
	    long phoneNumber;
	    
	    
	    System.out.println("Enter Name");
	    name=scanner.next();
	    System.out.println("Enter UserName");
	    username=scanner.next();
	    System.out.println("Enter Password");
	    password=scanner.next();
	    System.out.println("Enter PhoneNumber");
	    phoneNumber=scanner.nextLong();
	    User u1=new User(name, username, password, phoneNumber);
	    
	    System.out.println("Enter Name");
	    name=scanner.next();
	    System.out.println("Enter UserName");
	    username=scanner.next();
	    System.out.println("Enter Password");
	    password=scanner.next();
	    System.out.println("Enter PhoneNumber");
	    phoneNumber=scanner.nextLong();
	    User u2=new User(name, username, password, phoneNumber);
	    
	    if(u1.comparePhoneNumber(u2))
	    	System.out.println("Same Users");
	    else System.out.println("Different Users");
	    
		
	}
}
