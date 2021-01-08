package No9_classAndObject;

public class TotalArea_9_11 {
	/* Main method */ 
	public static void main(String[] args){ 
		// Declare circleArray
		CircleWithPrivateDataFields_9_8[] circleArray; 
		// Create circleArray
		circleArray = createCircleArray(); 
		// Print circleArray and total areas of the circles
		printCircleArray(circleArray);
	}
		
		 /** Create an array of Circle objects */
		 public static CircleWithPrivateDataFields_9_8[] createCircleArray(){
		 CircleWithPrivateDataFields_9_8[] circleArray =
		 new CircleWithPrivateDataFields_9_8[5];
		
		 for (int i = 0;i < circleArray.length; i++){
		 circleArray[i] =
			new CircleWithPrivateDataFields_9_8(Math.random() * 100);
		}
		
		 // Return Circle array
		 return circleArray;
		 }
		
		 /** Print an array of circles and their total area */
		 public static void printCircleArray(
		 CircleWithPrivateDataFields_9_8[] circleArray){
		 System.out.printf("%-30s%-15s\n","Radius", "Area");
		 for (int i = 0;i < circleArray.length;i++){
			 
		 System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(),
			circleArray[i].getArea());	 
		 }
		 
		 System.out.println("----------------------");
		 
		// Compute and display the result
		  System.out.printf("%-30s%-15f\n", "The total area of circles is",
		  sum(circleArray) );
		  }
		 
		  /**Add circle areas */
		  public static double sum(CircleWithPrivateDataFields_9_8[] circleArray) {
			  // Initialize sum
			  double sum = 0;
		 
		  // Add areas to sum
		  for (int i = 0; i < circleArray.length; i++)
		  sum +=circleArray[i].getArea();
		  return sum;
		  }
		 
		 
		 
		 
		 
		 
}
