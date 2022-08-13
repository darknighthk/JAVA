import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		ItemTypeBO it = new ItemTypeBO();
		List<ItemType> itList = it.readFromFile(br);
		List<ItemType> itList1 = it.depositList(itList);
		if (itList1.isEmpty()) {
			System.out.println("No item type has deposit more than 2000");
		} else {
			String type = "Item type", dep = "Deposit", cost = "Cost per day";
			System.out.printf("%-15s %-15s %s\n", type, dep, cost);
			it.display(itList1);
		}
	}
}