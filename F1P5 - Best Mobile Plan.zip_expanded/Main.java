import java.io.*;
import java.util.Scanner;

class qn38 extends BestMobilePlan{
	 qn38(int a,int b,int c){
	 super(a,b,c);
	 }
	 public static void main (String arg[]){
	 int a,b,c;
	 Scanner in = new Scanner(System.in);
	 a=in.nextInt();
	 b=in.nextInt();
	 c=in.nextInt();
	 qn38 obj = new qn38(a,b,c);
	 obj.printPlanDetails();
	 }
	}

