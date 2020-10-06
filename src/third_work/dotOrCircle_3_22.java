package third_work;
import java.util.Scanner;
public class dotOrCircle_3_22 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
	System.out.println("Enter a point with two coordinates: ");
	int x = input.nextInt();
	int y = input.nextInt();
	
	double area = x*x+y*y;
	if(Math.pow(area, 0.5)<10) {
		System.out.println("Point (" + (double)x + ", " + (double)y +
                ") is in the circle");
	}
	else {
		System.out.println("Point (" + (double)x + ", " + (double)y +
                ") is not in the circle");
	}
	
	}
}
