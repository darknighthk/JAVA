import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ItemType item=new ItemType();
		
		System.out.println("Enter the Item type details:");
		try {
			System.out.println("Enter the name:");
			item.setName(sc.nextLine());
			System.out.println("Enter the deposit:");
			item.setDeposit(Double.parseDouble(sc.nextLine()));
			System.out.println("Enter the cost per day:");
			item.setCostPerDay(Double.parseDouble(sc.nextLine()));
			
			System.out.println("The details of the item type are:");
			System.out.println(item.toString());
		}catch(NumberFormatException e) {
			System.out.println(e.toString());;
		}
		
		sc.close();
	}

}