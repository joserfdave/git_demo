package No_9_hometest;
import java.util.Scanner;
public class QuadraticEquationClass_2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("������a��b��c��ֵ��");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		input.close();
		
		QuadraticEquationClass object=new QuadraticEquationClass(a,b,c);
		
		
		System.out.println("a��ֵ��"+object.getA());
		System.out.println("b��ֵ��"+object.getB());
		System.out.println("c��ֵ��"+object.getC());
		
		if(object.getDiscriminant()>0)
			System.out.println("�б�ʽ>0,������������,�ֱ�Ϊ  r1:"+object.getRoot1()+" r2:"+object.getRoot2());
		else if(object.getDiscriminant()==0)
			System.out.println("�б�ʽ=0,����ֻ��һ���� r:"+object.getRoot1());
		else
			System.out.println("The equation has no roots.");
	}
}
