package No_11_work;
import java.util.ArrayList;
import java.util.Scanner;
public class MyPoint {
	private double x,y;
	 
	public MyPoint(){
	    x = 0;
	    y = 0;
	}
	 
	public MyPoint(double x, double y){
	    this.x = x;
	    this.y = y;
	}
	 
	public double getX(){
	    return x;
	}
	 
	public double getY(){
	    return y;
	}
	 
	public void setX(double x) {
	    this.x = x;
	}
	 
	public void setY(double y) {
	    this.y = y;
	}
	 
	public double distance(MyPoint p){
	    return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
	}
	 
	public double diatance(double x, double y){
	    return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
	}


public static void main(String[] args) {
    polygon polygon = new polygon();
    int pointNum = 0;
    Scanner in = new Scanner(System.in);
    System.out.println("请输入多边形顶点数,个数不能超过100个(顺时针）：");
    pointNum=in.nextInt();
    for(int i=0;i<pointNum;i++)
    {
        System.out.println("第"+i+"个顶点的横坐标:");
        double x = in.nextDouble();
        System.out.println("第"+i+"个顶点的纵坐标:");
        double y = in.nextDouble();
        MyPoint p1 = new MyPoint(x,y);
        polygon.setPoint(p1);
    }
    System.out.println("输出polygon中存储的所有点的坐标:");
    polygon.shuchu();
    System.out.println("多边形面积是：" + polygon.Area(pointNum));
	}
}
