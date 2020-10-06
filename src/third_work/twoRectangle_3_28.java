package third_work;
import java.util.Scanner;
public class twoRectangle_3_28 {
	public static void main(String[] args) {
		System.out.println("Enter rl's center x-,y-coordinates,width,and height: ");
		Scanner input = new Scanner(System.in);
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double w1 = input.nextDouble();
		double h1 = input.nextDouble();
		
		System.out.println("Enter r2's center x-,y-coordinates,width,and height: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double w2 = input.nextDouble();
		double h2 = input.nextDouble();
		double x3 = x1 - x2 >= 0 ? x1 - x2 : x2 - x1;
	    double y3 = y1 - y2 >= 0 ? y1 - y2 : y2 - y1;
//		if(x1-x2>=0) {
//			double x3 = x1 - x2;}
//		else {
//			double x3 = x2 - x1;} 
//		if(y1-y2>=0) {
//			double y3 = y1 - y2;}
//		else {
//			double y3 = y2 - y1;}
		
		if (x3 <= (w1 - w2) / 2 && y3 <= (h1 - h2) / 2) 
	        System.out.println("r2 is inside r1");
	    else if (x3 <= (w1 + w2) / 2 && y3 <= (h1 + h2) / 2)
	        System.out.println("r2 overlaps r1");
	    else
	        System.out.println("r2 does not overlap r1");
		
		
	}
}
