public class Event {
	// write your code here
	String name;
	String detail;
	String type;
	String organiser;
	int attendeesCont;
	double projectedExpense;

	public Event(String name, String detail, String type, String organiser, int attendeesCont,
			double projectedExpense) {
		super();
		this.name = name;
		this.detail = detail;
		this.type = type;
		this.organiser = organiser;
		this.attendeesCont = attendeesCont;
		this.projectedExpense = projectedExpense;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOrganiser() {
		return organiser;
	}

	public void setOrganiser(String organiser) {
		this.organiser = organiser;
	}

	public int getAttendeesCount() {
		return attendeesCont;
	}

	public void setAttendeesCont(int attendeesCont) {
		this.attendeesCont = attendeesCont;
	}

	public double getProjectedExpense() {
		return projectedExpense;
	}

	public void setProjectedExpense(double projectedExpense) {
		this.projectedExpense = projectedExpense;
	}

	@Override
	public String toString() {
		return String.format("%-15s%-20s%-15s%-15s%-15s\n", this.getName(), this.getDetail(), this.type,
				this.attendeesCont, this.projectedExpense);
	}
}