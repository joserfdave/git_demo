package third_work;
import java.util.Scanner;
public class Perimeter_of_triangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three sides you choose: ");
		int s1 = input.nextInt();
		int s2 = input.nextInt();
		int s3 = input.nextInt();
		
		if((s1+s2>s3) && (s3+s2>s1) && (s1+s3>s2)) {
			System.out.println("The Perimeter is:" + (s1+s2+s3));
		}
		else {
			System.out.println("illegality input");
		}
	}
}
