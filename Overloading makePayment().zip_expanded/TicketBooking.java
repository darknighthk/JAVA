public class TicketBooking{
	private String stageEvent,customer;
	private Integer noOfSeats;
	public String getStageEvent() {
		return stageEvent;
	}
	public void setStageEvent(String stageEvent) {
		this.stageEvent = stageEvent;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public Integer getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(Integer noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public TicketBooking(String stageEvent, String customer, Integer noOfSeats) {
		super();
		this.stageEvent = stageEvent;
		this.customer = customer;
		this.noOfSeats = noOfSeats;
	}
	public TicketBooking() {
		// TODO Auto-generated constructor stub
	}

	public void tostring() {
		System.out.println("Stage event: "+this.stageEvent);
		System.out.println("Customer: "+this.customer);
		System.out.println("Number of seats:"+this.noOfSeats);
	}
	public void MakePayment(Double amount) {
		tostring();
		System.out.printf("Amount %.1f paid in cash",amount);
	}
	public void MakePayment(String walletNumber , Double amount) {
		tostring();
		System.out.printf("Amount %.1f paid using wallet number %s",amount,walletNumber);
	}
	public void MakePayment(String creditCard,String ccv,String name,Double amount) {
		System.out.println("Stage event:"+this.stageEvent);
		System.out.println("Customer:"+this.customer);
		System.out.println("Number of seats:"+this.noOfSeats);
		System.out.println("Holder name:"+name);
		System.out.printf("Amount %.1f paid using %s card\r\n"
				+ "CCV:%s",amount,creditCard,ccv);
	}
}
