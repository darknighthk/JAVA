import java.util.*;
import java.io.*;


public class Main {
    @SuppressWarnings({ "removal",  })
	public static void main(String args[])throws IOException{
        
    	ArrayList<ItemType> itemTypeList=new ArrayList<>();
		itemTypeList.add(new ItemType("Electronics",new Double(1000),new Double(100)));
		itemTypeList.add(new ItemType("Furniture",new Double(1000),new Double(100)));
		itemTypeList.add(new ItemType("Decorations",new Double(1000),new Double(100)));
		
		ItemBO ibo=new ItemBO();
		BufferedReader br = new BufferedReader(new FileReader("input.csv"));
        try {
			ArrayList<Item> list = ibo.readFile(br,itemTypeList);
			
			TreeMap<String,Integer> tm= ibo.listitem(list, itemTypeList);
			
			System.out.println("The item types along with count of each:");
			for (Map.Entry<String, Integer> val : tm.entrySet()) {
	            System.out.println(val.getKey() + "--"  + val.getValue());
	        }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
