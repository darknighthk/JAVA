import java.io.*; 
import java.util.*; 
public class Main{ 
	public static void main (String[] args) throws Exception{ 

		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter the first string :");
		String s1=scanner.next();
		
		System.out.println("Enter the second string :");
		String s2=scanner.next();
		System.out.println(args[0]+" - Command Line Arguments");
		System.out.println("Substring : "+s1.substring(3));
		System.out.println("The character at 3rd position in the second string is : "+s2.charAt(3));
		System.out.println("Are string 1 and string 2 equal? : "+s1.equalsIgnoreCase(s2));
		System.out.println("Concatenated string : "+s1.concat(s2));

	} 
} 



