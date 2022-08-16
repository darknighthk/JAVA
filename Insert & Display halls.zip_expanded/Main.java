import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the details of hall in csv format:");
		String s[]=sc.nextLine().split(",");
		
		System.out.println("Enter the username:");
		UserDAO ud=new UserDAO();
		User u=ud.getUser(sc.nextLine());
		while(u==null) {			
			System.out.println("Username seems to be wrong!! Enter the correct username:");
			u=ud.getUser(sc.nextLine());
		}
		
		Hall h=new Hall(s[1],s[2],Double.parseDouble(s[3]),u);
		HallDAO hd=new HallDAO();
		hd.saveHall(h);
		
		List<Hall> lh=hd.getAllHall();
		
		System.out.println("The hall details are:");
		System.out.printf("%-15s%-15s%-15s%-15s","Name","Moblide","Cost","Owner");
		for (Hall hall : lh) {
			System.out.printf("%-15s%-15s%-15.1f%-15s",hall.getName(),hall.getContactNumber(),hall.getCostPerDay(),hall.getOwner().getName());
		}
		
		
	}
}
