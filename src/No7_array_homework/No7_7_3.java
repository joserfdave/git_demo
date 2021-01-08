//计算数字出现次数
package No7_array_homework;
public class No7_7_3 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Emter the integers between 1 and 100:");
		
		
		int[] flags = new int[103];
		//创建输入数组
		int number = input.nextInt();
		int i = 1;
		while(number != 0) {
			if(number >= 1 && number <= 100) {
				flags[number] += 1;
				}
			number = input.nextInt();
		}
		//条件判断&&获得输出
		for(int j = 0;j<102;j++) {
			if(flags[j] > 0) {
				System.out.println(j + " occurs " + flags[j] + " times");
			}
		}
	}
}
