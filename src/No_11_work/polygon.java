package No_11_work;
import java.util.ArrayList;
public class polygon {
	//ArrayList数组存点对象
	private ArrayList<MyPoint> array= new ArrayList<>();
	polygon(){
	}
	 
	public void setPoint(MyPoint p){
	    this.array.add(p);
	}
	//计算凸多边形的思路：从一个定点开始和它不相邻的顶点连线，这样就可以把凸多边形划分成几个三角形
	//用第十章课后题中的计算三角形面积公式求出面积即可
	//三角形面积之和等于凸多边形的面积
	public double Area(int pointNum) {
	    int i=0;
	    double temp=0;
	    for(; i <pointNum - 1;i++) {
	        temp += (this.array.get(i).getX() - this.array.get(i+1).getX())*(this.array.get(i).getY() + this.array.get(i+1).getY());
	    }
	    //防止ArrayList溢出
	    temp += (this.array.get(i).getX() - this.array.get(0).getX())*(this.array.get(i).getY() + this.array.get(0).getY());
	    if(temp < 0) temp = -temp;
	    return temp/2;
	}
	 
	public void shuchu() {
	    for(int i =0 ;i < array.size();i++) {
	        System.out.print("（" + array.get(i).getX() +"，" + array.get(i).getY() +")");
	 
	    }
	}
}
