public class ItemType {
	// Your code here
	String name;
	double deposit;
	double costPerDay;

	public ItemType() {
		super();
	}

	public ItemType(String name, double deposit, double costPerDay) {
		super();
		this.name = name;
		this.deposit = deposit;
		this.costPerDay = costPerDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public double getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}
}