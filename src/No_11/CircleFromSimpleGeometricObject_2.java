package No_11;

public class CircleFromSimpleGeometricObject_2
		extends SimpleGeometricObject_1{
	private double radius;
	
	public CircleFromSimpleGeometricObject_2() {}
	public CircleFromSimpleGeometricObject_2(double radius) {
		this. radius=radius;
}
	public CircleFromSimpleGeometricObject_2(double radius,
			String color, boolean filled) {
		this.radius = radius;
		setcolor(color);
		setFilled(filled);} 
	/** Return radius */
	public double getRadius() {
		return radius;}
	/** Set a new radius */
	public void setRadius(double radius) {
		this. radius = radius;}
	/** Return area */
	public double getArea() {
		return radius * radius * Math . PI; }
	/** Return diameter */
	public double getDiameter() {
		return 2 * radius;}
	/** Return perimeter */
	public double getPerimeter() {
		return 2 * radius * Math . PI;} 
	/** Print the circle info */
	public void printCirclef() {
		System.out.println("The circle is create " + getDateCreated() + " and the radius is" + radius);
	}
}