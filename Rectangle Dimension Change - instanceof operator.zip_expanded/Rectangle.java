public class Rectangle {
    		
	Integer	length;
	Integer	width;
	

	public Rectangle(Integer length, Integer width) {
		super();
		this.length = length;
		this.width = width;
	}
	public Integer area() {		

		
		return length*width;	

	}
	public void display(){
		
		System.out.println("Rectangle Dimension");
		System.out.println("Length:"+length);
		System.out.println("Width:"+width);

	}
	
	Rectangle dimensionChange(Integer newDimension){

		Rectangle rectangleObject = new Rectangle(length*newDimension, width*newDimension);
		return rectangleObject;
	}
	

}
