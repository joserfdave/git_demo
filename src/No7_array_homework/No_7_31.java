//�ϲ����������
package No7_array_homework;
import  java.util.Scanner;
import java.util.Arrays;
public class No_7_31 {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("����������1����һ�����ֱ�ʾ���鳤�ȣ���");
	    int[] list1 = new int[scanner.nextInt()];
	    for (int i = 0; i < list1.length; i++) {
	        list1[i] = scanner.nextInt();
	    }
	    System.out.print("����������2����һ�����ֱ�ʾ���鳤�ȣ���");
	    int[] list2 = new int[scanner.nextInt()];
	    for (int i = 0; i < list2.length; i++) {
	        list2[i] = scanner.nextInt();
	    }
	    System.out.println("����1Ϊ��" + Arrays.toString(list1));
	    System.out.println("����2Ϊ��" + Arrays.toString(list2));
	    System.out.print("���Ϻ������Ϊ��" + Arrays.toString(merge(list1, list2)));
	}
	 
	private static int[] merge(int[] list1, int[] list2) {
	    int[] newList = new int[list1.length + list2.length];
	    System.arraycopy(list1, 0, newList, 0, list1.length);
	    System.arraycopy(list2, 0, newList, list1.length, list2.length);
	    Arrays.sort(newList);
	    return newList;
	}
}
