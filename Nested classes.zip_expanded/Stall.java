public class Stall 
{
	public String name, detail, owner;
	public Integer cost;

	
	public Stall(String name, String detail, String owner, Integer cost) {
		super();
		this.name = name;
		this.detail = detail;
		this.owner = owner;
		this.cost = cost;
	}

	class GoldStall
	{
		public Integer tvSet;


		GoldStall(Integer tvSet) {
			
			this.tvSet = tvSet;
		}
		class PlatinumStall {
			public Integer projector;

			PlatinumStall(Integer projector) {
				
				this.projector = projector;
			}
			public void display() {
				
				System.out.println("Stall Name:"+Stall.this.name);
				System.out.println("Details:"+Stall.this.detail);
				System.out.println("Owner Name:"+Stall.this.owner);
				System.out.println("TV Sets:"+Stall.GoldStall.this.tvSet);
				System.out.println("Projectors:"+this.projector);
				System.out.println("Total Cost:"+(Stall.this.cost+Stall.GoldStall.this.tvSet*100+this.projector*500));
			}
		}

	}
	
	

}