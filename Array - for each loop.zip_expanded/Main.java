import java.io.*; 
import java.util.*; 
public class Main{ 
	public static void main (String[] args) throws Exception{ 

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int n=sc.nextInt();
		
		int[] a=new int[n];
		System.out.println("Enter numbers : ");
		for (int i = 0; i < n; i++) 
			a[i]=sc.nextInt();
		
		String[] s=new String[n];
		System.out.println("Enter strings : ");
		for (int i = 0; i < n; i++) 
			s[i]=sc.next();
			
		System.out.println("Displaying numbers");
		for (int i:a) {
			System.out.println(i);
		}
		
		System.out.println("Displaying strings");
		for (String string : s) {
			System.out.println(string);
		}

	} 
} 



