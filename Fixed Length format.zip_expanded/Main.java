import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws Exception {
//write your code here
		Scanner sc = new Scanner(System.in);
		String ch = null;
		BufferedReader br = new BufferedReader(new FileReader("input.csv"));
		ArrayList<Event> e = EventBO.readFile(br);
		do {
			System.out.println("Enter the name of the person whose events to be shown:");
			String s = sc.nextLine();
			ArrayList<Event> e1 = EventBO.eventsByPerson(e, s);
			if (e1.isEmpty()) {
				System.out.println("The given person has no upcoming events");
			} else {
				String name = "Name", detail = "Detail", type = "Type", attendees = "Attendees Count", cpe = "Projected Expense";
				System.out.printf("%-15s%-20s%-15s%-15s%-15s\n", name, detail, type, attendees, cpe);
				Event event=null;
				for (int i = 0; i < e1.size(); i++) {
					event=e1.get(i);
					System.out.printf("%-15s%-20s%-15s%-15s%-15s\n", 
							event.getName(), event.getDetail(), event.getType(), event.getAttendeesCount(), event.getProjectedExpense());
				}
			}
			System.out.println("Do you want to continue?(y/n)");
			ch = sc.nextLine();
		} while (ch.equals("y"));
	}
}
