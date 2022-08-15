class StageEvent extends Event{
       private Integer totalShow,seatsPerShow;

	public Integer getTotalShow() {
		return totalShow;
	}

	public void setTotalShow(Integer totalShow) {
		this.totalShow = totalShow;
	}

	public Integer getSeatsPerShow() {
		return seatsPerShow;
	}

	public void setSeatsPerShow(Integer seatsPerShow) {
		this.seatsPerShow = seatsPerShow;
	}

	public StageEvent(String name, String detail, String organizer, Integer totalShow, Integer seatsPerShow) {
		super(name, detail, organizer);
		this.totalShow = totalShow;
		this.seatsPerShow = seatsPerShow;
	}
       @Override
    public void totalCredit() {
    	System.out.println("Credit Details\nTotal Credit Gained is "+(this.totalShow*this.seatsPerShow*100));
    }
       @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return super.toString()+"\nTotal Events : "+this.totalShow+"\nTotal Seats : "+this.seatsPerShow;
    }
    }
