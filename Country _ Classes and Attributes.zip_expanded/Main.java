import java.util.Scanner;

public class Main{
    public static void main(String[] args){    
    	String name,countryCode,isdCode;
    	Scanner sc = new Scanner(System.in);

        System.out.println("Enter the country name");
        name=sc.next();
        
        System.out.println("Enter the country code");
        countryCode=sc.next();
        
        System.out.println("Enter the isd code");
        isdCode=sc.next();
        
        Country country=new Country(name, countryCode, isdCode);
        country.display();
    }
}