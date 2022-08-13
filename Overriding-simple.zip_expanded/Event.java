
abstract class Event{
    
       private String name,detail,ownerName;

	public String getName() {
		return name;
	}

	public String getDetail() {
		return detail;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public Event(String name, String detail, String ownerName) {
		super();
		this.name = name;
		this.detail = detail;
		this.ownerName = ownerName;
	}
	public abstract Double projectedRevenue();
}