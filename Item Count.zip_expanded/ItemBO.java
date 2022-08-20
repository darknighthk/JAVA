import java.util.ArrayList;
import java.io.*;
import java.util.TreeMap;

class ItemBO{
    ItemBO(){

    }
    public ArrayList<Item> readFile(BufferedReader br,ArrayList<ItemType> typeList)throws IOException{
    	ArrayList<Item> list = new ArrayList<>();
    	Item item = new Item();
        String line;

 

        while ((line = br.readLine()) != null) {
        	String[] st=line.split("\\s+");
            String name = st[0]; //line.substring(0, 8).trim();
            
            String itemType_name = st[1];//line.substring(8, 23).trim();
           // System.out.println(itemType_name);
            String vendor = st[2]; //line.substring(23, 32).trim();
            for (ItemType it : typeList) {
				if(itemType_name.equals(it.name)) {
					item = new Item(name,it,vendor);
					break;
				}
			}
            
            list.add(item);
        }
		return list;
	}
	public  TreeMap<String,Integer> listitem(ArrayList<Item> itemList,ArrayList<ItemType> itemTypeList){
		TreeMap<String,Integer> map = new TreeMap<String,Integer>();		

		for (Item i : itemList) {
			String s= i.itemType.name;
            Integer j = map.get(s);
            map.put(s, (j == null) ? 1 : j + 1);
        }
		
		return map;
	}
}