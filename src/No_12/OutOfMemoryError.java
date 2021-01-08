package No_12;
import java.util.*;
import java.util.concurrent.ExecutionException;
public class OutOfMemoryError {
	public static void main(String[] args){
    	List list=new ArrayList();
    	try {
			while(true) {
				list.add(new Object());
			}
		} catch (Exception e) {
			System.exit(0);
		}
    }
}
