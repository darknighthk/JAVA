class Event{
	private String name,detail,organizer;

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

	public String getOrganizer() {
		return organizer;
	}

	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}

	public Event(String name, String detail, String organizer) {
		super();
		this.name = name;
		this.detail = detail;
		this.organizer = organizer;
	}
	public void totalCredit() {
		// TODO Auto-generated method stub

	}
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "Event Name : "+this.name+"\nEvent Detail : "+this.detail+
    			"\nEvent Organizer : "+this.organizer;
    }


}