package No_9_hometest;
import java.util.GregorianCalendar;
public class useGregorianCalendarClass {
	public static void main(String[] args) {
		
		GregorianCalendar object=new GregorianCalendar(2020,4,8);
		
		System.out.println(object.get(GregorianCalendar.YEAR)+"��"
				+ object.get(GregorianCalendar.MONTH)+"��"
				+ object.get(GregorianCalendar.DATE)+"��");
 
		
		object.setTimeInMillis(1234567898765L);
		
		System.out.println(object.get(GregorianCalendar.YEAR)+"��"
				+ object.get(GregorianCalendar.MONTH)+"��"
				+ object.get(GregorianCalendar.DATE)+"��");
		
	}
}
