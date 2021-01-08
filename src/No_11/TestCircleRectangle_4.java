package No_11;

public class TestCircleRectangle_4 {
	public static void main(String[] args) { 
		CircleFromSimpleGeometricObject_2 circle =  new CircleFromSimpleGeometricObject_2(1); 
		System.out.println(".A circle " + circle.toString()); 
		System.out.println("The color is " + circle.getcolor());
		System.out.println("The radius is " + circle.getRadius());
		System.out.println("The area is " + circle.getArea());
		System.out.println("The diameter is " + circle.getDiameter());
			
		RectangleFromSimpleGeometricObject_3 rectangle =
			new RectangleFromSimpleGeometricObject_3(2, 4);
		System.out.println("\nA rectangle " + rectangle.toString());
		System.out.println("The area is " + rectangle.getArea());
		System.out.println("The perimeter is " +
			rectangle.getPerimeter());
	 }
}
