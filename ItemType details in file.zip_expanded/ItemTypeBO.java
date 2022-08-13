import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ItemTypeBO {
	// Your code here
	public List<ItemType> readFromFile(BufferedReader br) {
		List<ItemType> itList = new ArrayList<ItemType>();
		ItemType it;
		try {
			String line;
			while ((line = br.readLine()) != null) {
				String sp[] = line.split("\\s+");
				it = new ItemType(sp[0], Double.parseDouble(sp[1]), Double.parseDouble(sp[2]));
				itList.add(it);
			}
			br.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return itList;
	}

	public List<ItemType> depositList(List<ItemType> list) {
		List<ItemType> itList = new ArrayList<ItemType>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getDeposit() > 2000) {
				itList.add(list.get(i));
			}
		}
		return itList;
	}

	public void display(List<ItemType> list) {
//		String type = "Item type", dep = "Deposit", cost = "Cost per day";
//		System.out.printf("%-15s %-15s %s\n", type, dep, cost);
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%-15s %-15s %s\n", list.get(i).getName(), list.get(i).getDeposit(),
					list.get(i).getCostPerDay());
		}
	}
}