public class Main{
    public static void main(String[] args){             

        if(args.length!=2)System.out.println("Invalid Input");
    	else{
        	int a=Integer.parseInt(args[0]), b=Integer.parseInt(args[1]);
        	
        	System.out.print("The sum of "+a+" and "+b+" is "+(a+b));
    	}
		
    }
}