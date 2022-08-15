public class Villain implements GameStatus
{
    //fill your code
	private Integer damage;

	public Integer getDamage() {
		return damage;
	}

	public void setDamage(Integer damage) {
		this.damage = damage;
	}

	public Villain(Integer damage) {
		
		this.damage = damage;
	}

	@Override
	public void status() {
		
		if(damage<=100) System.out.println("The Villain Damage level is :"+damage);
		if(damage==100) System.out.println("----GAME OVER----\r\n" + "YOU WINS!!!");
	}
	
}