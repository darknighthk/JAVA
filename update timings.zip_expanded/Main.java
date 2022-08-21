
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
        EventDAO eD = new EventDAO();
        System.out.format ("%-5s %-10s %-15s %-20s %-20s %s\n","Id","Event name","Detail","Start date","End date","Organizer");
        List<Event>events = eD.getAllEvents();
        for (Event u : events) {
        	System.out.format("%-5s %-10s %-15s %-20s %-20s %s\n",u.getId(),u.getName(),u.getDetail(),
        			new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(u.getStartDate()),
        			new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(u.getEndDate()), u.getOrganizer());
        }
        System.out.println("Enter the id of the event to be updated");
        Long id = Long.parseLong(sc.nextLine());
        Event u1 = eD.getEventById(id);
        if (u1 == null) {
            System.out.println("Id not found");
        } else {
           
            System.out.println("Enter the start and end date");
            String sd = sc.nextLine();
            String ed = sc.nextLine();
            u1.setStartDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sd));
            u1.setEndDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(ed));
            eD.updateEvent(u1);
            
            System.out.format ("%-5s %-10s %-15s %-20s %-20s %s\n","Id","Event name","Detail","Start date","End date","Organizer");
            events = eD.getAllEvents();
            for (Event u : events) {
            	System.out.format("%-5s %-10s %-15s %-20s %-20s %s\n",u.getId(),u.getName(),u.getDetail(),
            			new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(u.getStartDate()),
            			new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(u.getEndDate()), u.getOrganizer());
            }
        }
	}
}