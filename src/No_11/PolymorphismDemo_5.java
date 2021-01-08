package No_11;

public class PolymorphismDemo_5 {
	/** Main method */
	public static void main(String[] args) {
		//Display circle and rectangle properties
		displayObject(new CircleFromSimpleGeometricObject_2(1,"red",false));
		displayObject(new RectangleFromSimpleGeometricObject_3(1,1,"black",true));
	}
	
	/**Display geometric object properties */
	public static void displayObject(SimpleGeometricObject_1 object) {
		System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getcolor());
	}

}
