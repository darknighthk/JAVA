import java.io.BufferedReader;
import java.util.ArrayList;

public class EventBO {

	public static ArrayList<Event> readFile(BufferedReader br) throws Exception {
		ArrayList<Event> e = new ArrayList<Event>();
		Event event;
		String line;
		while ((line = br.readLine()) != null) {
			String name = line.substring(0, 19).trim();
			String detail = line.substring(19, 39).trim();
			String type = line.substring(39, 51).trim();
			String organiser = line.substring(51, 61).trim();
			String attendeesCont = line.substring(61, 67).trim();
			String projectedExpense = line.substring(67, 74).trim();
			event = new Event(name, detail, type, organiser, Integer.parseInt(attendeesCont),
					Double.parseDouble(projectedExpense));
			e.add(event);
		}
		br.close();
		return e;
//write your code here
	}

	public static ArrayList<Event> eventsByPerson(ArrayList<Event> eventList, String organiser) {
		ArrayList<Event> e = new ArrayList<Event>();
		for (int i = 0; i < eventList.size(); i++) {
			if (eventList.get(i).getOrganiser().equals(organiser)) {
				e.add(eventList.get(i));
			}
		}
		return e;
//write your code here
	}
}
