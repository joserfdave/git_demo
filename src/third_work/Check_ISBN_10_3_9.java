package third_work;
import java.util.Scanner;
public class Check_ISBN_10_3_9 {
	public static void main(String[] args) {
		int num,check0;
		String str,ISBN;
		System.out.println("Enter the first 9 digits of an ISBN as integer: ");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		 
		str = "0" + String.valueOf(num).toString();
		 
		check0 = ((Integer.valueOf(str.substring(0, 1)).intValue() * 1) +
		        (Integer.valueOf(str.substring(1, 2)).intValue() * 2) +
		        (Integer.valueOf(str.substring(2, 3)).intValue() * 3) +
		        (Integer.valueOf(str.substring(3, 4)).intValue() * 4) +
		        (Integer.valueOf(str.substring(4, 5)).intValue() * 5) +
		        (Integer.valueOf(str.substring(5, 6)).intValue() * 6) +
		        (Integer.valueOf(str.substring(6, 7)).intValue() * 7) +
		        (Integer.valueOf(str.substring(7, 8)).intValue() * 8) +
		        (Integer.valueOf(str.substring(8, 9)).intValue() * 9)) % 11;
		 
		if (check0 == 10) {
		    ISBN = str + "X";
		} else {
		    ISBN = str + String.valueOf(check0).toString();
		}
		System.out.print("The ISBN-10 number is " + ISBN);
	}
}