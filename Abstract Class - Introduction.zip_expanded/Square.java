public class Square extends Shape{
	private Float side;

	public Float getSide() {
		return side;
	}

	public void setSide(Float side) {
		this.side = side;
	}

	public Square(Float side) {
		super();
		this.side = side;
	}

	@Override
	public Double calculatePerimeter() {
		Float a= this.side*4;
		return Double.parseDouble(Float.toString(a));
	}
	
}
