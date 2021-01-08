//检查数组排序
package No7_array_homework;
import  java.util.Scanner;
import java.util.Arrays;
public class No_7_19 {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int num;
	    System.out.print("请输入数字（第一个数表示数组长度）：");
	    num = scanner.nextInt();
	    int[] numArray = new int[num];
	    for (int i = 0; i < num; i++) {
	        numArray[i] = scanner.nextInt();
	    }
	    System.out.println("输入的数组为：" + Arrays.toString(numArray));
	    if (isSorted(numArray)) {
	        System.out.print("该数组已经按升序排列");
	    } else {
	        System.out.print("该数组没有按升序排列");
	    }
	}
	 
	private static boolean isSorted(int[] numArray) {
	    int[] tmpArray = new int[numArray.length];
	    System.arraycopy(numArray, 0, tmpArray, 0, numArray.length);
	    Arrays.sort(tmpArray);
	    return Arrays.equals(tmpArray, numArray);
	}
}
