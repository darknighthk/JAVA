
public class main {

	public static void main(String[] args) {
		String a="FR-562   Furniture     Jack      ";
		//a=a.trim();
        //a = a.replaceAll("\\s+", " ");
		String s="select * from \"user\" where username='" + a + "'";
		for (String st : a.split("\\s+")) {
			
			System.out.println(st);

		}
	
		
	}

}
