package listitem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		
			Logger log = Logger.getLogger("org.hibernate");
			log.setLevel(Level.OFF);
			System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
			ItemDAO dao = new ItemDAO();
		while(true) {
			System.out.println("Menu\n1.Display by Category\n2.Display items\n3.Exit\nEnter choice");
			switch(Integer.parseInt(br.readLine())) {
			case 1:
				System.out.println("Enter item category");
				List<Item>  item = dao.listByCategory(br.readLine());
				if(item.isEmpty())
				{
					System.out.println("No items in category kitchenware");
				}
				else
				{
				System.out.printf("%-15s %-15s %-15s %-15s %s\n","Id","Name","Category","Quantity","Price");
				for(Item i:item) {
					System.out.printf("%-15d %-15s %-15s %-15d %.1f\n", i.getId(),i.getName(),i.getCategory(),i.getQuantity(),i.getPrice());
				}
				}
				break;
			case 2:
				item = dao.list();
				
				System.out.printf("%-15s %-15s %-15s %-15s %s\n","Id","Name","Category","Quantity","Price");
				for(Item i:item) {
					System.out.printf("%-15d %-15s %-15s %-15d %.1f\n", i.getId(),i.getName(),i.getCategory(),i.getQuantity(),i.getPrice());
				}
				
				break;
			case 3:
				System.out.println("Bye");
				System.exit(0);
				
			default:
				System.out.println("Invalid choice");
			}
		}
		
	}
}