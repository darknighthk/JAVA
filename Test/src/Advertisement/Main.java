import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    static AdvertisementDAO dao=new AdvertisementDAO();
    public static void out() {
		

		System.out.println("Advertisement details");
		System.out.printf("%-5s %-20s %-15s %s\n","Id","Advertisement media","Amount spent","No Of audience attracted");
		List<Advertisement> list=dao.list();
		for (Advertisement i : list) {
			System.out.printf("%-5s %-20s %-15s %s\n",i.getId(),i.getAdvertisementMedia(),i.amountSpent,i.noOfAudienceAttracted);
		}
	}
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		Logger log = Logger.getLogger("org.hibernate");
    	log.setLevel(Level.OFF);
		System.setProperty("org.apache.commons.logging.Log",
		"org.apache.commons.logging.impl.NoOpLog");
        System.out.println("Enter no. of advertisements done :");
		
		int n = Integer.parseInt(br.readLine());
		Advertisement a=null;
		for (int i = 0; i < n; i++) {
			a=new Advertisement();
			String[]s=br.readLine().split(",");
			//a.setId(Integer.parseInt(s[0]));
			a.setAdvertisementMedia(s[0]);
			a.setAmountSpent(Double.parseDouble(s[1]));
			a.setNoOfAudienceAttracted(Integer.parseInt(s[2]));
			dao.insert(a);
		
		}
		
		out();
		
		System.out.println("Enter advertisement id :");
		a=dao.find(Integer.parseInt(br.readLine()));
		if(a==null)
			System.out.println("Advertisement not found!");
		else {
			System.out.println("Enter no of new users attracted :");
			a.setNoOfAudienceAttracted(a.getNoOfAudienceAttracted()+Integer.parseInt(br.readLine()));
		    dao.update(a);
    	
		}
		
		out();
	}
}
