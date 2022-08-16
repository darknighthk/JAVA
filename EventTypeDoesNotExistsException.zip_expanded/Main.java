import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static Boolean isValid(Long typeId, List<EventType> typeList) throws EventTypeDoesNotExistsException {
		for (EventType event : typeList)
			if (typeId == event.getId())
				return true;
		// throw new EventTypeDoesNotExistsException("User Define ExceptionMSG");
		throw new EventTypeDoesNotExistsException();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		List<EventType> typeList = new ArrayList<EventType>();
		List<Event> eventList = new ArrayList<Event>();

		typeList.add(new EventType("Stage Event",new Long(1)));
		typeList.add(new EventType("Exhibition",new Long(2)));
		typeList.add(new EventType("Sports meet",new Long(3)));
		typeList.clear();
		typeList.add(new EventType("Stage Event",1L));
		typeList.add(new EventType("Exhibition",2L));
		typeList.add(new EventType("Sports meet",3L));
		

		System.out.println("Enter the number of the events:");
		int noOfEvents = in.nextInt();
		in.nextLine();

		for (int i = 0; i < noOfEvents; i++) {
			System.out.println("Enter the details of event " + (i + 1));
			String[] eventInfo = in.nextLine().split(",");
			String name = eventInfo[0];
			String details = eventInfo[1];
			String ownerName = eventInfo[2];
			Long typeId = Long.parseLong(eventInfo[3]);

			do {
				try {
					if (isValid(typeId, typeList)) {
						Event event = new Event();
						event.setName(name);
						event.setDetail(details);
						event.setOwnerName(ownerName);
						event.setTypeId(typeId);
						eventList.add(event);
						break;
					} else {
						System.out.println("Hai");
					}

				} catch (EventTypeDoesNotExistsException e) {
					System.out.println(e);
					System.out.println("\nEnter the correct event type id:");
					typeId = in.nextLong();
					//in.nextLine();
				} // System.out.println("PRAVEEN");

			} while (true);
		}
		
		System.out.println("\nThe events entered are:\n");
		System.out.printf("%-15s%-15s%-15s%-15s\n", "Name", "Details", "Owner name", "Event typeid");
		for (Event e : eventList)
			System.out.println(e);
		in.close();
	}
}