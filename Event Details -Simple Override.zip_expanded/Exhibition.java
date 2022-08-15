class Exhibition extends Event {
    private Integer stallCount;

	public Integer getStallCount() {
		return stallCount;
	}

	public void setStallCount(Integer stallCount) {
		this.stallCount = stallCount;
	}

	public Exhibition(String name, String detail, String organizer, Integer stallCount) {
		super(name, detail, organizer);
		this.stallCount = stallCount;
	}
	@Override
	public void totalCredit() {
		System.out.println("Credit Details\nTotal Credit Gained is "+(this.stallCount*50));
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nStall Count: "+this.stallCount;
	}


}