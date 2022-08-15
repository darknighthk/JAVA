public class Hero implements GameStatus
{
    // fill your code
    private Integer life;

	public Integer getLife() {
		return life;
	}

	public void setLife(Integer life) {
		this.life = life;
	}

	public Hero(Integer life) {
		
		this.life = life;
	}

	@Override
	public void status() {
		// TODO Auto-generated method stub
		
		if(life>=0)System.out.println("You have "+life+" lives left");
		if(life==0) System.out.println("You lose the GAME !!!");
		
		
	}
    
}