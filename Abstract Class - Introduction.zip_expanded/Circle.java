public class Circle extends Shape{
	private Float radius;

	public Float getRadius() {
		return radius;
	}

	public void setRadius(Float radius) {
		this.radius = radius;
	}

	public Circle(Float radius) {
		
		this.radius = radius;
	}

	@Override
	public Double calculatePerimeter() {
		Float a= this.radius*2* (float)3.14;
		return Double.parseDouble(Float.toString(a));
	}
	
}
