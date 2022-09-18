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
		while (true) {
			System.out.println("Menu\n1.Add item\n2.Change item\n3.Display items\n4.Exit\nEnter choice");
			switch (Integer.parseInt(br.readLine())) {
			
			case 1:
				System.out.println("Enter item id");
				int id1 = Integer.parseInt(br.readLine());
//				Item item = dao.find(id1);
//				if (item == null)
//					System.out.println("Item not found");
//				else {
					
					System.out.println("Enter name");
					item.setName(br.readLine());
					System.out.println("Enter category");
					item.setCategory(br.readLine());
					System.out.println("Enter quantity");
					item.setNumber(Integer.parseInt(br.readLine()));
					System.out.println("Enter price");
					item.setPrice(Float.parseFloat(br.readLine()));
					dao.update(item);
					System.out.println("Changes are updated successfully");
				
				break;
			case 3:
				List<Item> itemList = dao.list();
				if (itemList.isEmpty()) {
					System.out.println("Empty list");
				} else {
					System.out.printf("%-15s %-15s %-15s %-15s %s\n", "Id", "Name", "Category", "Quantity", "Price");
					for (Item i : itemList) {
						System.out.printf("%-15s %-15s %-15s %-15s %s\n", i.getId(), i.getName(), i.getCategory(),
								i.getQuantity(), i.getPrice());
					}
				}
				break;
			case 4:
				System.out.println("Bye");
				System.exit(0);
			default:
				System.out.println("Invalid choice");
			}
		}
	}
}