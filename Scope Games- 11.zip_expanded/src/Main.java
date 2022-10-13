
import com.spring.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		Logger log = Logger.getLogger("org.hibernate");
		log.setLevel(Level.OFF);
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("applicationContext.xml");
		// e = (Event) context.getBean("event");

		List<Owner> lo = new ArrayList<>();
		System.out.println("Enter the number of owners you want to create");
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			System.out.println("...Creating an owner...");
			Owner o = new Owner(1);
			System.out.println("Enter the Name and Password of the Owner");
			o.setName(br.readLine());
			o.setPassword(br.readLine());
			lo.add(o);
		}

		List<Event> le = new ArrayList<>();
		System.out.println("Enter the number of events you want to create");
		n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			System.out.println("...Creating a new event...");
			Event e = new Event(1);
			e.setId(i + 1);
			System.out.println("Enter the  Event name");
			e.setEventName(br.readLine());
			System.out.println("Select any option from the list and enter the number");
			int j = 1;
			for (Owner owner : lo) {
				System.out.println((j++) + ")" + owner.getName());
			}
			System.out.println("Enter the choice");
			e.setEventOrganiser(lo.get(Integer.parseInt(br.readLine()) - 1));
			le.add(e);
		}
		System.out.println("...Listing events...");

		for (Event ev : le) {
			System.out.println(ev.getId() + ")" + ev.getEventName() + " - " + ev.getEventOrganiser().getName());
		}
	}

}
