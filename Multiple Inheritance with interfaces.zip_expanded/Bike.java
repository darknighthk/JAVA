public class Bike implements BikeDistance,BikeSpeed
{
	private Integer distance,speed;

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public Bike(Integer distance, Integer speed) {
		
		this.distance = distance;
		this.speed = speed;
	}

	@Override
	public int averageSpeed() {
		// TODO Auto-generated method stub
		return this.distance;
	}

	@Override
	public int totalDistance() {
		// TODO Auto-generated method stub
		return this.speed*this.distance;
	}
	
}
	

	