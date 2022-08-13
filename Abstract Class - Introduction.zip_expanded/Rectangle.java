public class Rectangle extends Shape{
	private Float breadth,length;
	
	public Rectangle(Float breadth, Float length) {
		
		this.breadth = breadth;
		this.length = length;
	}

	public Float getBreadth() {
		return breadth;
	}

	public void setBreadth(Float breadth) {
		this.breadth = breadth;
	}

	public Float getLength() {
		return length;
	}

	public void setLength(Float length) {
		this.length = length;
	}

	@Override
	public Double calculatePerimeter() {
		Float a= (this.length+this.breadth)*2;
		return Double.parseDouble(Float.toString(a));
	}
	//write your code here
}
