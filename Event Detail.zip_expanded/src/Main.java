
import com.spring.entity.*;
import com.spring.dao.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) throws IOException {
		Logger log = Logger.getLogger("org.hibernate");
		log.setLevel(Level.OFF);
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EventDAO dao = (EventDAO) context.getBean("eventDAO");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("Before inserting\n%-15s %-15s %-15s %-15s %-15s %s\n", "Id", "Event Name", "Organiser Name",
				"Organiser Number", "Hall Name", "Location");
		List<Event> lo = dao.getAllEvents();
		for (Event e : lo) {
			System.out.printf("%-15s %-15s %-15s %-15s %-15s %s\n", e.getId(), e.getEventName(), e.getOrganiser(),
					e.getOrganiserNumber(), e.getHallName(), e.getLocation());
		}
		System.out.println("Enter the id of the Event : ");
		int id = Integer.parseInt(br.readLine());

		
		Event e = dao.getEventById(id);
		if (e != null)
			System.out.println("Invalid id");
		// if(s==null) System.out.println("No such owner!");
		else {
			e = new Event();
			e.setId(id);
			System.out.println("Enter the name of the Event : ");
			e.setEventName(br.readLine());
			System.out.println("Enter the Organiser name : ");
			e.setOrganiser(br.readLine());
			System.out.println("Enter the organiser number : ");
			e.setOrganiserNumber(br.readLine());
			System.out.println("Enter the Hall name : ");
			e.setHallName(br.readLine());
			System.out.println("Enter the location : ");
			e.setLocation(br.readLine());
			dao.createEvent(e.getId(),e.getEventName(),e.getOrganiser(),e.getOrganiserNumber(), e.getHallName(),e.getLocation());
			System.out.printf("After insertion\n%-15s %-15s %-15s %-15s %-15s %s\n", "Id", "Event Name",
					"Organiser Name", "Organiser Number", "Hall Name", "Location");
			lo = dao.getAllEvents();
			for (Event e1 : lo) {
				System.out.printf("%-15s %-15s %-15s %-15s %-15s %s\n", e1.getId(), e1.getEventName(), e1.getOrganiser(),
						e1.getOrganiserNumber(), e1.getHallName(), e1.getLocation());
			}
		}
	}

}
