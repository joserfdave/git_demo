package No_11;

public class CastingDemo_7 {
	/** Main method */
	public static void main(String[] args) { 
	// Create and initialize two objects
	 Object object1 = new CircleFromSimpleGeometricObject_2(1);
	 Object object2 = new RectangleFromSimpleGeometricObject_3(1, 1);
	 
	 // Display circle and rectangle
	displayObject(object1);
	displayObject(object2);
	}
	
	/** A method for displaying an object */
	public static void displayObject(Object object) {
		 if (object instanceof CircleFromSimpleGeometricObject_2) {
		 System.out.println("The circle area is" +
		 ((CircleFromSimpleGeometricObject_2)object).getArea());
		 System.out.println("The circle diameter is " +
		 ((CircleFromSimpleGeometricObject_2)object).getDiameter());
		 }
		 else if (object instanceof
				 RectangleFromSimpleGeometricObject_3) {
		 System.out.println("The rectangle area is " +
		 ((RectangleFromSimpleGeometricObject_3)object).getArea());
		}
	}
}
