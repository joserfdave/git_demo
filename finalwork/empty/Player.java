package empty;
import java.util.Scanner;
public class Player {
	private int number; 	//编号
	private String name;	//姓名
	private int age;		//年龄
	private int mes;        //报名信息   1=已成功报名 0=报名失败
	private int ranks;		//排名
	private int grade;	//成绩   例如1小时3分22秒表示为     1 3 22 ；
	private int forbid;   	//运动员账户情况 1=禁止 0=未禁止
	private int start;      //比赛开始信息
	public void setNumber(int num) {
		this.number = num;
	}
	public int getNumber() {
		return number;
	}
	public void setName(String name) {
		this.name = name;                           
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setMes(int message) {
		this.mes = message;
	}
	public int getMes() {
		return mes;
	}
	public void setRanks(int rank) {
		this.ranks = rank;
	}
	public int getRanks() {
		return ranks;
	}
	public void setGrages(int gra) {
		this.grade = gra;
	}
	public int getGrade() {
		return grade;
	}
	public void setForbid(int forbiddon) {
		this.forbid = forbiddon;
	}
	public int getForbid() {
		return forbid;
	}
	public void setStart(int sta) {
		this.start = sta;
	}
	public int getStart() {
		return start;
	}
}
