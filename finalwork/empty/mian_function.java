package empty;

import java.util.Scanner;
import java.util.Objects;

public class mian_function {
	private static int m = 0;		//��Ŀ����
	private static int n = 5;		//ѧ������(�˶�Ա����)
	private static String announce; //����
	private static String[] a = new String[50];
	private static Infomation ac = new Infomation("Admin","123456");	//����Ա��ʼ��
	private static Player su[] = new Player[100];		//ʵ�л��˶�Ա����
	private static Infomation Pla[] = new Infomation[100];  //ʵ�л��˶�Ա�˻���
	private static String[] s=new String[20];			//�洢����
	public static void main(String[] args) {
		main_window();
	}
	
	//ϵͳ��ʼҳ��
	private static void main_window() {
//		su[0].setName("����");
//		su[0].setNumber(1000);
//		su[0].setAge(20);
//		Pla[0].setAccont("����");
//		Pla[0].setCode("123456");
//		
		System.out.println("----------��ӭ������������Ϣ����ϵͳ----------");
		  System.out.println("-     ���ȵ�¼��     -");
		  System.out.println("-     1.����Ա��¼    -");
		  System.out.println("-     2.�˶�Աע��    -");
		  System.out.println("-     3.�˶�Ա��¼     -");
		  System.out.println("-     0.�˳�      -");
		  System.out.println("------------------------------------------------");
		  Scanner in = new Scanner(System.in);
		  int ch = in.nextInt();
		  if(ch == 1)Login(ac);
		  else if(ch == 2)StudentSubmit();
		  else if(ch == 3)StudentLogin();
		  else if(ch==0)System.exit(0);
		  else System.exit(1);
	}
	//����Ա��½ҳ��
	private static void Login(Infomation ac) {
		Scanner in = new Scanner(System.in);
		System.out.println("�������˻�����:  ");
		String c = in.nextLine();
		if(!Objects.equals(c,ac.getAccont())) {
			System.out.println("�˻�������! ");
			mian_function.Login(ac);
		}
		System.out.println("���������룺");
		  String b=in.nextLine();
		  {
		   if (!Objects.equals(b, ac.getCode()))
		   {
		    System.out.println("�������");
		    mian_function.Login(ac);
		   }
		  }
		  System.out.println("��¼�ɹ���");
		  mian_function.Teacher();
		 }
	private static void Teacher() {
		System.out.println("-----------------------------------------------");
		  System.out.println("-----��ѡ����Ҫִ�еĲ�����  ---------------");
		  System.out.println("-----1.�����˶�Ա��Ϣ    ---------------");
		  System.out.println("-----2.�������    ---------------");
		  System.out.println("-----3.��������ɼ�    ---------------");
		  System.out.println("-----4.��������ͨ��    ---------------");
		  System.out.println("-----5.�˳�ϵͳ    ---------------");
		 System.out.println("-----------------------------------------------");
		  Scanner ch = new Scanner(System.in);
		  int c = ch.nextInt();
		  if(c == 1) Player_message();
		  else if(c == 2) Activity();
		  else if(c == 3) Score();
		  else if(c == 4) News();
		  else if(c == 5) main_window();
		  else {
			  System.out.println("�������! ");
			  Teacher();
		  }
	}
	
	private static void StudentSubmit() {
		int temp = 0;
		int num,t;
		String str;
		Scanner in = new Scanner(System.in);
		System.out.println("�����������˻�����");
		String account = in.next();
//		for(int i = 0;i<n;i++) {
//			if(Objects.equals(account,Pla[n].getAccont())) {
//				System.out.println("�����˻��ѱ�ע�ᣬ����������");
//				StudentSubmit();
//			}	
//		}
			Pla[temp+1].setAccont(account);
			System.out.println("�����������˻�����");
			String password = in.next();
			Pla[temp+1].setCode(password);
			System.out.println("ע��ɹ�! ");
			n++;
			System.out.println("�������˶�Ա���: ");
			num = in.nextInt();
			if(n != 0) {
			for(int i = 0;i<n;i++) { //������Ƿ��ظ�
				while (su[i].getNumber() == num) {
					System.out.println("����Ѵ��ڣ�����������: ");
					num = in.nextInt();
					}
				}
			}
			su[n].setNumber(num);
			System.out.println("�������˶�Ա����");
			str = in.next();
			su[n].setName(str);
			System.out.println("�������˶�Ա����: ");
			t = in.nextInt();
			su[n].setAge(t);
			System.out.println("¼�����! ");
			main_window();	
	}
	
	private static void StudentLogin() {
		int temp = 0;
		System.out.println("�������˻�: ");
		Scanner in = new Scanner(System.in);
		String account = in.next();
		for(int i = 0;i<n;i++) {
			if(Objects.equals(account,Pla[n].getAccont())) {
				System.out.println("��������������: ");
				String passcode = in.next();
				for(int j = 0;j<n;j++) {
					if(Objects.equals(passcode,Pla[n].getCode())) {
						System.out.println("��¼�ɹ���");
						Student();
					}
					else {
						System.out.println("�����������������: ");
						StudentLogin();
					}
				}
			}
			else {
				System.out.println("�˺Ų�����! ");
				StudentLogin();
			}
			
		}
	}
	
	private static void Student() {
		System.out.println("-----------------------------------------------");
		  System.out.println("-----��ѡ����Ҫִ�еĲ���:   ---------------");
		  System.out.println("-----1.��������    ---------------");
		  System.out.println("-----2.������Ϣ��ѯ     ---------------");
		  System.out.println("-----3.�鿴���а�    ---------------");
		  System.out.println("-----4.�鿴����    ---------------");
		  System.out.println("-----5.�˳�ϵͳ    ---------------");
		 System.out.println("-----------------------------------------------");
		  Scanner In = new Scanner(System.in);
		  int ch = In.nextInt();
		  if(ch == 1) Signup();
		  else if(ch == 2) Message();
		  else if(ch == 3) checkRanking();
		  else if(ch == 4) SeeNews();
		  else if(ch == 5) main_window();
		  else {
			  System.out.println("�������! ");
			  Student();
		  }
		  
	}
	private static void Player_message() {
		System.out.println("-----------------------------------------------");
		  System.out.println("-----��ѡ����Ҫִ�еĲ���:   ---------------");
		  System.out.println("-----1.¼���û�    ---------------");
		  System.out.println("-----2.�����û�    ---------------");
		  System.out.println("-----3.�����˻�    ---------------");
		  System.out.println("-----4.��������    ---------------");
		  System.out.println("-----5.�˳�ϵͳ    ---------------");
		 System.out.println("-----------------------------------------------");
		  Scanner ch1 = new Scanner(System.in);
		  int c1 = ch1.nextInt();
		  if(c1 == 1) Apply();
		  else if(c1 == 2) checkUser();
		  else if(c1 == 3) Forbodden();
		  else if(c1 == 4) Reset();
		  else if(c1 == 5) Teacher();
		  else {
			  System.out.println("�������! ");
			  Player_message();
		  }
	}
	private static void Activity() {
		System.out.println("-----------------------------------------------");
		  System.out.println("-----��ѡ����Ҫִ�еĲ���:   ---------------");
		  System.out.println("-----1.���ñ����    ---------------");
		  System.out.println("-----2.ͳ�Ʊ������    ---------------");
		  System.out.println("-----3.�˳�ϵͳ    ---------------");
		 System.out.println("-----------------------------------------------");
		  Scanner ch2 = new Scanner(System.in);
		  int c2 = ch2.nextInt();
		  if(c2 == 1) StartApply();
		  else if(c2 == 2) statisticsApply();
		  else if(c2 == 3) Teacher();
		  else {
			  System.out.println("�������! ");
			  Activity();
		  }
	}
	private static void Score() {
		System.out.println("-----------------------------------------------");
		  System.out.println("-----��ѡ����Ҫִ�еĲ���:   ---------------");
		  System.out.println("-----1.¼������ɼ�    ---------------");
		  System.out.println("-----2.��ѯ�ɼ�����     ---------------");
		  System.out.println("-----3.�鿴���а�    ---------------");
		  System.out.println("-----4.�˳�ϵͳ    ---------------");
		 System.out.println("-----------------------------------------------");
		  Scanner ch3 = new Scanner(System.in);
		  int c3 = ch3.nextInt();
		  if(c3 == 1) recodeScore();
		  else if(c3 == 2) checkRanking();
		  else if(c3 == 3) checkRankList();
		  else if(c3 == 4) Teacher();
		  else {
			  System.out.println("�������! ");
			  Score();
		  }
	}
	private static void News() {
		System.out.println("-----------------------------------------------");
		System.out.println("��׫д����:(���»س�����)\n");
		Scanner gg = new Scanner(System.in);
		String str;
		if(gg.hasNextLine()){
            s[1]=gg.nextLine();
        }			
		 System.out.println("-----------------------------------------------");
	}
	
	
	private static void Apply() {
		//����Ա¼��
		String str;
		int num1 = 0,t;
		String acc;
		String password;
		while(true)
		{
//			su[n] = new Player();
			System.out.println("�������˶�Ա���: ");
			Scanner in = new Scanner(System.in);
			num1 = in.nextInt();
			if(n != 0) {
			for(int i = 0;i<n;i++) { //������Ƿ��ظ�
				while (su[i].getNumber() == num1) {
					System.out.println("����Ѵ��ڣ�����������: ");
					num1 = in.nextInt();
				}
			}
			}
			su[n].setNumber(num1);
			System.out.println("�������˶�Ա����");
			str = in.next();
			su[n].setName(str);
			System.out.println("�������˶�Ա����: ");
			t = in.nextInt();
			su[n].setAge(t);
			System.out.println("�������˶�Ա�˻�");
			acc = in.next();
			Pla[n].setAccont(acc);
			System.out.println("�������˶�Ա�˻�����");
			password = in.next();
			Pla[n].setCode(password);
			n++;
			System.out.println("�Ƿ�������? Y / N");
			String choice = in.next();
			char cho = choice.charAt(0);
			if(cho == 'N' || cho == 'n')
				Teacher();
			while(cho!='N'&&cho!='n'&&cho!='Y'&&cho!='y')
			{
				System.out.println("������Ч������������: ");
				choice = in.next();
				cho = choice.charAt(0);
			}
		}
	}
	
	private static void Signup() {
		int num = 0;
		System.out.println("���������ı��: ");
		Scanner in = new Scanner(System.in);
		int mes = in.nextInt();
		for(int i = 0;i<n;i++) {
			if(Objects.equals(mes,su[i].getMes())){
				num = i;
			}
		}
		System.out.println("�Ƿ�����(���롰1������ע�ᣬ���롰0���ܾ�ע��)");
		int temp = in.nextInt();
		if(temp == 1) {
			su[num].setMes(temp);
			System.out.println("�����ɹ�");
		}
		if(temp == 0) {
			Student();
		}
	}
	
	private static void Message() {
		String str;
		int num1 = 0,t;
		System.out.println("�������˶�Ա���");
		Scanner in = new Scanner(System.in);
		num1 = in.nextInt();
		for(int i = 0;i<n;i++) {
			if(su[i].getNumber() == num1) {
				System.out.println("��������Ϊ: " + su[i].getName() + "\t��������Ϊ: " + su[i].getAge() + "\n");
				if(su[i].getStart() == 0)
					System.out.println("������Ϊ��ʼ");
				if(su[i].getStart() == 1) {
					if(su[i].getMes() == 1)
						System.out.println("��������Ϊ: " + su[i].getRanks() + "\t���ĳɼ�Ϊ:  " + su[i].getGrade() + "\n");
					else if(su[i].getMes() == 0)
						System.out.println("����δ����! ");
				}
			}
		}
	}

	private static void SeeNews() {
		//�鿴����
				System.out.println("-----------------------------------------------\n");
				System.out.println("");
				System.out.println(s[1]);
				System.out.println("");
				 System.out.println("-----------------------------------------------");
	}
	
	private static void checkUser() {
		//�����û�
		int check;
		Scanner In = new Scanner(System.in);
		System.out.println("�˶�Ա��Ϣ����: ");
		for(int i = 0;i<n;i++) {
			System.out.println("�˶�Ա���: " + su[i].getNumber() + "\n");
			System.out.println("�˶�Ա����: "+ su[i].getName() + "\t�˶�Ա����: " + su[i].getAge() + "\n");
			System.out.println("�Ƿ�����ע��? (���롰1������ע�ᣬ���롰0���ܾ�ע��)");
			check = In.nextInt();
			if(check == 1)
				su[i].setMes(check);
				System.out.println("����ע��ɹ�");
				if(su[i].getStart() == 0)
					System.out.println("������δ��ʼ���޷��鿴�ɼ�������");
				if(su[i].getStart() == 1)
					System.out.println("�˶�Ա����: " + su[i].getRanks() + "\t�˶�Ա�ɼ� " + su[i].getGrade() + "\n");
			if(check == 0)
				su[i].setMes(check);
		}
		Player_message();
	}
	
	private static void Forbodden() {
		int check;
		Scanner In = new Scanner(System.in);
		System.out.println("�˶�Ա��Ϣ����: ");
		for(int i = 0;i<n;i++) {
			System.out.println("�˶�Ա���: " + su[i].getNumber() + "\n");
			System.out.println("�˶�Ա����: "+ su[i].getName() + "\t�˶�Ա����: " + su[i].getAge() + "\n");
			System.out.println("�Ƿ���ø��˶�Ա��Ϣ? (���롰1��ִ�в��������롰0��������Ϣ)");
			check = In.nextInt();
			if(check == 1)
				su[i].setForbid(check);
			if(check == 0)
				System.out.println("�˶�Ա��Ϣ�ѱ���");
		}
		Player_message();
	}
	
	private static void Reset() {
		 System.out.println("������ԭ��������:");
		  Scanner In=new Scanner(System.in);
		  String code =In.nextLine();
		  if (!Objects.equals(code, ac.getCode()))
		  {
		   System.out.println("�����������");
		   Teacher();
		  }
		  System.out.println("������������:"); //Ҫ����������������
		  String co1=In.nextLine();
		  System.out.println("���ٴ�����������:");
		  String co2=In.nextLine();
		  if (!Objects.equals(co1, co2))
		  {
		   System.out.println("�����������벻һ�£�");
		   System.out.println("��������������");
		   Teacher();
		  }
		  else
		  {
		   ac.setCode(co1);
		   System.out.println("�����޸ĳɹ�!");
		   System.out.println("��������ֵ�������˵�");
		   Scanner in=new Scanner(System.in);
		   in.next();
		   Teacher();
		  }
	}
	
	private static void StartApply() {
		int temp;
		Scanner in = new Scanner(System.in);
		temp = in.nextInt();
		if (temp == 1)
			System.out.println("�����Կ�ʼ! ");
			for(int i = 0;i<n;i++) {
				su[i].setStart(1);
			}
		if(temp == 0)
			System.out.println("����ʼ��������Ҫ��ʼ���������µ���˽���");
		Activity();
	}
		
	private static void statisticsApply() {
		for(int i=0;i<n;i++) {
			System.out.println("�˶�Ա���" + su[i].getNumber() + "\n");
			System.out.println("�˶�Ա����: " + su[i].getName() + "\t�˶�Ա����: " + su[i].getAge());
			if(su[i].getMes() == 1)
				System.out.println("���˶�Ա�ѱ���");
			if(su[i].getMes() == 0)
				System.out.println("���˶�Աδ����");
		}
		Activity();
	}
	
	private static void recodeScore() {
		System.out.println("�����������˶�Ա���:");
		Scanner in = new Scanner(System.in);
		int num1=in.nextInt();
//		System.out.println(num);
		for(int i = 0;i<n;i++) {
			if(su[i].getNumber() == num1) {
				
				System.out.println("�����ʽ��xСʱx��x��.=x,x,x,0\n");//���ġ���0����ʾ����
				in.useDelimiter(",");
				int h1 = in.nextInt();
				int h2 = in.nextInt();
				int h3 = in.nextInt();
				int gra=h1*3600+h2*60+h3;
				su[i].setGrages(gra);
				}
		}
	}
	
	private static void checkRanking() {
		System.out.println("�����������˶�Ա���:");
		Scanner in = new Scanner(System.in);
		int num1=in.nextInt();
//		System.out.println(num);
		for(int i = 0;i<n;i++) {
			if(su[i].getNumber() == num1) {
				System.out.println("��������Ϊ: " + su[i].getRanks());
				}
			}
			
			
	}
	
	private static void checkRankList() {
		int list[]=new int[n+1];
		int list2[]=new int[n+1];
		String list3[]=new String[n+1];
		int a,b,min=0;
		for(int i = 0;i<n;i++) {
			for(int j = i;j<n;j++) {
				a=su[i].getGrade();
				b=su[j].getGrade();
				if(a > b) {
					min=j;
					}
			}
			
			list[i]=su[min].getGrade();
			
			list2[i]=su[min].getNumber();
			list3[i]=su[min].getName();
			su[min].setRanks(i+1);
		}
		for(int i = 0;i<10;i++) {
			System.out.println("�� "+i+" ����"+list3[i]+"����ţ�"+list2[i]);
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
