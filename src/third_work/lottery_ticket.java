package third_work;
import java.util.Scanner;
public class lottery_ticket {
	public static void main(String[] args) {
		int lottery =(int)(Math.random() * 1000);
		String str_lottery = String.format("%03d",lottery);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your lottery pick (three digits): ");
		int guess = input.nextInt();
		String str_guess = String.format("%03d",guess);
		
		System.out.println("The lottery number is: " + str_lottery);
		
		String lottery1 = str_lottery.substring(0,1);
		String lottery2 = str_lottery.substring(1,2);
		String lottery3 = str_lottery.substring(2,3);
		
		String guess1 = str_guess.substring(0,1);
		String guess2 = str_guess.substring(1,2);
		String guess3 = str_guess.substring(2,3);
		
		if(str_guess.equals(str_lottery)) {
			System.out.println("Exact match: you win $10,000");
		}
		else if((guess3.equals(lottery2) && guess2.equals(lottery1) && guess1.equals(lottery3)) ||
				(guess3.equals(lottery3) && guess2.equals(lottery1) && guess1.equals(lottery2)) ||
				(guess3.equals(lottery1) && guess2.equals(lottery2) && guess1.equals(lottery3)) ||
				(guess3.equals(lottery1) && guess2.equals(lottery3) && guess1.equals(lottery2)) ||
				(guess3.equals(lottery2) && guess2.equals(lottery3) && guess1.equals(lottery1))){
				System.out.println("Math all digits: you win $3000");}
		else if((guess1.equals(lottery3)||guess1.equals(lottery2)||guess1.equals(lottery1)||guess2.equals(lottery3)||guess2.equals(lottery2)||guess2.equals(lottery1)||guess1.equals(lottery3)||guess1.equals(lottery2)||guess1.equals(lottery1))) {
			System.out.println("Math one digits: you win $1000");
		}
		else {
			System.out.println("Sorry,no match");
		}
		
	}
}
