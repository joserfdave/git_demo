package No_9_hometest;
import java.util.Scanner;
public class LinearEquation_2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("«Î ‰»Îa°¢b°¢c°¢d°¢e°¢fµƒ÷µ£∫");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		double d=input.nextDouble();
		double e=input.nextDouble();
		double f=input.nextDouble();
		
		LinearEquation object=new LinearEquation(a,b,c,d,e,f);
		
		if(object.isSolvable()) 
			System.out.println("X:"+object.getX()+" y:"+object.getY());
		else
			System.out.println("The equation has no solution.");
	
	}
}