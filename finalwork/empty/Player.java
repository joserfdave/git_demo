package empty;
import java.util.Scanner;
public class Player {
	private int number; 	//���
	private String name;	//����
	private int age;		//����
	private int mes;        //������Ϣ   1=�ѳɹ����� 0=����ʧ��
	private int ranks;		//����
	private int grade;	//�ɼ�   ����1Сʱ3��22���ʾΪ     1 3 22 ��
	private int forbid;   	//�˶�Ա�˻���� 1=��ֹ 0=δ��ֹ
	private int start;      //������ʼ��Ϣ
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
