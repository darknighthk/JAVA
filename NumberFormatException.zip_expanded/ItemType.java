public class ItemType {
    
    private String name;
	private Double deposit;
	private Double costPerDay;

	public ItemType(String name, Double deposit, Double costPerDay) {
		this.name = name;
		this.deposit = deposit;
		this.costPerDay = costPerDay;
	}

	public ItemType() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(Double costPerDay) {
		this.costPerDay = costPerDay;
	}

	public Double getDeposit() {
		return deposit;
	}

	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}
	
	@Override
	public String toString() {
		return "Name:" + this.name + "\n" + "Deposit:" + this.deposit + "\n" + "Cost Per Day:" + this.costPerDay;
	}

	
}