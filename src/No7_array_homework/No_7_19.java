//�����������
package No7_array_homework;
import  java.util.Scanner;
import java.util.Arrays;
public class No_7_19 {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int num;
	    System.out.print("���������֣���һ������ʾ���鳤�ȣ���");
	    num = scanner.nextInt();
	    int[] numArray = new int[num];
	    for (int i = 0; i < num; i++) {
	        numArray[i] = scanner.nextInt();
	    }
	    System.out.println("���������Ϊ��" + Arrays.toString(numArray));
	    if (isSorted(numArray)) {
	        System.out.print("�������Ѿ�����������");
	    } else {
	        System.out.print("������û�а���������");
	    }
	}
	 
	private static boolean isSorted(int[] numArray) {
	    int[] tmpArray = new int[numArray.length];
	    System.arraycopy(numArray, 0, tmpArray, 0, numArray.length);
	    Arrays.sort(tmpArray);
	    return Arrays.equals(tmpArray, numArray);
	}
}
