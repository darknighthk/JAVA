class StageEvent extends Event{
	private Integer noOfShows,noOfSeatsPerShow;

	public Integer getNoOfShows() {
		return noOfShows;
	}

	public void setNoOfShows(Integer noOfShows) {
		this.noOfShows = noOfShows;
	}

	public Integer getNoOfSeatsPerShow() {
		return noOfSeatsPerShow;
	}

	public void setNoOfSeatsPerShow(Integer noOfSeatsPerShow) {
		this.noOfSeatsPerShow = noOfSeatsPerShow;
	}

	

	public StageEvent(String name, String detail, String ownerName, Integer noOfShows, Integer noOfSeatsPerShow) {
		super(name, detail, ownerName);
		this.noOfShows = noOfShows;
		this.noOfSeatsPerShow = noOfSeatsPerShow;
	}

	@Override
	public Double projectedRevenue() {
		// TODO Auto-generated method stub
		return this.noOfSeatsPerShow*this.noOfShows*50.0;
	}
	
}