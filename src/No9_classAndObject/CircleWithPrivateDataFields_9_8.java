package No9_classAndObject;
public class CircleWithPrivateDataFields_9_8 {
	/** The radius of the circle */
	private double radius = 1;
	
	/** The number of object created */
	private static int numberOfObject = 0;
	
	/** Construct a circle with radius 1 */
	public CircleWithPrivateDataFields_9_8(double newRadius) {
		radius = newRadius;
		numberOfObject++;
	}
	
	/** Return radius */
	public double getRadius() {
		return radius;
	}
	
	/** Set a new radius */
	public void setRadius(double newRadius) {
		radius = (newRadius >= 0)? newRadius : 0;
	}
	
	/** Return numberOfobject */
	public static int getNumberOfObject() {
		return numberOfObject;
	}
	
	/** Return the area of this circle */
	public double getArea() {
		return radius * radius * Math.PI;
	}
}
