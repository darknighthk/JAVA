import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception, IOException {
    	Integer	length;
    	Integer	width;
    	Scanner scanner=new Scanner(System.in);
    	
    	System.out.println("Enter the length of the rectangle");
    	length=scanner.nextInt();
    	System.out.println("Enter the width of the rectangle");
    	width=scanner.nextInt();
    	
    	Rectangle r1=new Rectangle(length, width);
    	
    	r1.display();
    	System.out.println("Area of the Rectangle:"+r1.area());
    	
    	System.out.println("Enter the new dimension");
    	int n=scanner.nextInt();
    	if(r1.dimensionChange(n) instanceof  Rectangle)    	
    	{
    		r1=r1.dimensionChange(n);
    		r1.display();
    		System.out.println("Area of the Rectangle:"+r1.area());
    	}
    	
    	

		
				

	}
}



