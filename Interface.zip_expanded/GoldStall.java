public class GoldStall implements Stall{
	private String stallName;
	private Integer cost;
	private String ownerName;
	private Integer tvSet;
	public String getStallName() {
		return stallName;
	}
	public void setStallName(String stallName) {
		this.stallName = stallName;
	}
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public Integer getTvSet() {
		return tvSet;
	}
	public void setTvSet(Integer tvSet) {
		this.tvSet = tvSet;
	}
	public GoldStall(String stallName, Integer cost, String ownerName, Integer tvSet) {
		super();
		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.tvSet = tvSet;
	}
	@Override
	public void display() {
		System.out.println("Stall Name: "+this.stallName);
		System.out.println("Cost: Rs."+this.cost);
		System.out.println("Owner Name: "+this.ownerName);
		System.out.println("Number of TV sets: "+this.tvSet);
		
	}
	
	
}

