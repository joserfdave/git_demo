//冒泡排序
package No7_array_homework;
import  java.util.Scanner;
import java.util.Arrays;
public class No_7_18 {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("请输入十个数：");
	    double[] list = new double[10];
	    for (int i = 0; i < 10; i++) {
	        list[i] = scanner.nextDouble();
	    }
	    System.out.println("原始数组为：" + Arrays.toString(list));
	    System.out.print("排序后的数组为：" + Arrays.toString(arraySort(list)));
	}
	 
	private static double[] arraySort(double[] list) {
	    double tmp;
	    for (int i = 0; i < list.length - 1; i++) {
	        for (int j = 0; j < list.length - 1 - i; j++) {
	            if (list[j] > list[j + 1]) {
	                tmp = list[j + 1];
	                list[j + 1] = list[j];
	                list[j] = tmp;
	            }
	        }
	    }
	    return list;
	}
}
