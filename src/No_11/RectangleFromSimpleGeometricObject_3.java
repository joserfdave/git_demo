package No_11;

public class RectangleFromSimpleGeometricObject_3 
	extends SimpleGeometricObject_1{
	private double width;
	private double height;
	
	public RectangleFromSimpleGeometricObject_3() {}
	public RectangleFromSimpleGeometricObject_3(double width, double height){
		this.width = width;
		this.height = height;
 }

	public RectangleFromSimpleGeometricObject_3(
			double width, double height, String color, boolean filled) {
		this.width = width;
		this.height=height;
		setcolor(color);
		setFilled(filled);}

	/** Return width */
	public double getWidthf() {
		return width;
	}

	/** Set a new width */
	public void setWidth(double width) {
		this.width = width;
	}
	
	/** Return height*/ 
	public double getHeight() {
	 return height;
	 }
	
	 /**Set a new height*/
	 public void setHeight(double height) {
	 this.height=height;
	 }
	
	 /**Return area */
	 public double getArea() {
	 return width *height;
	 }
	
	 /** Return perimeter */
	 public double getPerimeter() {
	 return 2 * (width + height);
	 }
}