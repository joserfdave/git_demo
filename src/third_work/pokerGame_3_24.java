package third_work;

public class pokerGame_3_24 {

	public static void main(String[] args) {
		int num = (int)(1 + Math.random() * 13);
	    switch(num) {
	        case 1:System.out.print("The card of you picked is Ace "); break;
	        case 2:System.out.print("The card of you picked is 2 "); break;
	        case 3:System.out.print("The card of you picked is 3 "); break;
	        case 4:System.out.print("The card of you picked is 4 "); break;
	        case 5:System.out.print("The card of you picked is 5 "); break;
	        case 6:System.out.print("The card of you picked is 6 "); break;
	        case 7:System.out.print("The card of you picked is 7 "); break;
	        case 8:System.out.print("The card of you picked is 8 "); break;
	        case 9:System.out.print("The card of you picked is 9 "); break;
	        case 10:System.out.print("The card of you picked is 10 "); break;
	        case 11:System.out.print("The card of you picked is Jack "); break;
	        case 12:System.out.print("The card of you picked is Queen "); break;
	        case 13:System.out.print("The card of you picked is King "); break;
	    }

	    int color = (int)(1 + Math.random() * 4);
	    switch(color) {
	        case 1:System.out.println("of Hearts"); break;
	        case 2:System.out.println("of Diamonds"); break;
	        case 3:System.out.println("of Spades"); break;
	        case 4:System.out.println("of Clubs"); break;
	    }	

	}
}
