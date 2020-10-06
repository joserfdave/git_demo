package third_work;
import java.util.Scanner;
public class dayToWeek_3_21 {
	public static void main(String[] args) {
		int year,month,day;
		int today;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year: (e.g., 2012): ");
		year = input.nextInt();
		System.out.println("Enter month: 1-12: ");
		month = input.nextInt();
		System.out.println("Enter the day of the month: 1-31: ");
		day = input.nextInt();
		
		if(month == 1 || month == 2) {
			month += 12;
			year -= 1;
		}
		int temp = (int)(26*(month+1)/10);
		int k = year % 100;
		int j = (int)(year/100);
		today = (int)((day + temp + k + (int)(k/4) + (int)(j/4) + 5*j)%7);
		
		switch(today) {
		case 0: System.out.println("day of the week is Saturday"); break;
		case 1: System.out.println("day of the week is Sunday"); break;
		case 2: System.out.println("day of the week is Monday"); break;
		case 3: System.out.println("day of the week is Tuesday"); break;
		case 4: System.out.println("day of the week is Wednesday"); break;
		case 5: System.out.println("day of the week is Thursday"); break;
		case 6: System.out.println("day of the week is Friday"); break;
		
		}
		
	
	}
	
}
