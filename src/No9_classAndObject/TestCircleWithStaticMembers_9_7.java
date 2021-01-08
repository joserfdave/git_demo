package No9_classAndObject;

public class TestCircleWithStaticMembers_9_7 {
/** Main method */
	public static void main(String[] args) {
		System.out.println("Before creating object");
		System.out.println("The numner of Circle object is " + CircleWithStaticMembers_9_6.numberOfObjects);
		
		//Create c1
		CircleWithStaticMembers_9_6 c1 = new CircleWithStaticMembers_9_6();
		
		//Display c1 BEFORE c2 is created
		System.out.println("\nAfter creating c1");
		System.out.println("c1: radius (" + c1.radius + c1.numberOfObjects + ")");
		
		//Create c2
		CircleWithStaticMembers_9_6 c2 = new CircleWithStaticMembers_9_6();
		//Modify c1
		c1.radius = 9;
		
		//Display c1 and c2 AFTER c2 was created
		System.out.println("\nAfter creating c2 and modifying c1");
		System.out.println("cl: radius (" + c1.radius +
		" ) and number of Circle objects (" +
		 c1.numberOfObjects + ")");
		 System.out.println("c2: radius (" + c2.radius +
		 ") and number of Circle objects (" +
			c2.numberOfObjects + ")");
	}
	
}
