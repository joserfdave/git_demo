package third_work;
import java.util.Scanner;
public class dotInTriangle_3_27 {
	public static void main(String[] args) {
		System.out.println("Enter a point's x- and y-coordinates: ");
		Scanner input = new Scanner(System.in);
		
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double A = x - y*((200.0-0)/(0-100.0));
		if(x>200||y>100||x<0||y<0)
			System.out.println("The point is not in the triangle");
		else {
			if(A<=200)
				System.out.println("The point is in the triangle");
			else
				System.out.println("The point is not in the triangle");
		}
	}
}
