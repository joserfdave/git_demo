package empty;

import java.util.Scanner;
import java.util.Objects;

public class mian_function {
	private static int m = 0;		//科目数量
	private static int n = 5;		//学生数量(运动员数量)
	private static String announce; //公告
	private static String[] a = new String[50];
	private static Infomation ac = new Infomation("Admin","123456");	//管理员初始化
	private static Player su[] = new Player[100];		//实列化运动员类组
	private static Infomation Pla[] = new Infomation[100];  //实列化运动员账户组
	private static String[] s=new String[20];			//存储公告
	public static void main(String[] args) {
		main_window();
	}
	
	//系统初始页面
	private static void main_window() {
//		su[0].setName("张三");
//		su[0].setNumber(1000);
//		su[0].setAge(20);
//		Pla[0].setAccont("张三");
//		Pla[0].setCode("123456");
//		
		System.out.println("----------欢迎来到马拉松信息管理系统----------");
		  System.out.println("-     请先登录：     -");
		  System.out.println("-     1.管理员登录    -");
		  System.out.println("-     2.运动员注册    -");
		  System.out.println("-     3.运动员登录     -");
		  System.out.println("-     0.退出      -");
		  System.out.println("------------------------------------------------");
		  Scanner in = new Scanner(System.in);
		  int ch = in.nextInt();
		  if(ch == 1)Login(ac);
		  else if(ch == 2)StudentSubmit();
		  else if(ch == 3)StudentLogin();
		  else if(ch==0)System.exit(0);
		  else System.exit(1);
	}
	//管理员登陆页面
	private static void Login(Infomation ac) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入账户名称:  ");
		String c = in.nextLine();
		if(!Objects.equals(c,ac.getAccont())) {
			System.out.println("账户不存在! ");
			mian_function.Login(ac);
		}
		System.out.println("请输入密码：");
		  String b=in.nextLine();
		  {
		   if (!Objects.equals(b, ac.getCode()))
		   {
		    System.out.println("密码错误！");
		    mian_function.Login(ac);
		   }
		  }
		  System.out.println("登录成功！");
		  mian_function.Teacher();
		 }
	private static void Teacher() {
		System.out.println("-----------------------------------------------");
		  System.out.println("-----请选择你要执行的操作：  ---------------");
		  System.out.println("-----1.管理运动员信息    ---------------");
		  System.out.println("-----2.管理报名活动    ---------------");
		  System.out.println("-----3.管理比赛成绩    ---------------");
		  System.out.println("-----4.发布比赛通告    ---------------");
		  System.out.println("-----5.退出系统    ---------------");
		 System.out.println("-----------------------------------------------");
		  Scanner ch = new Scanner(System.in);
		  int c = ch.nextInt();
		  if(c == 1) Player_message();
		  else if(c == 2) Activity();
		  else if(c == 3) Score();
		  else if(c == 4) News();
		  else if(c == 5) main_window();
		  else {
			  System.out.println("输入错误! ");
			  Teacher();
		  }
	}
	
	private static void StudentSubmit() {
		int temp = 0;
		int num,t;
		String str;
		Scanner in = new Scanner(System.in);
		System.out.println("请输入您的账户名称");
		String account = in.next();
//		for(int i = 0;i<n;i++) {
//			if(Objects.equals(account,Pla[n].getAccont())) {
//				System.out.println("您的账户已被注册，请重新输入");
//				StudentSubmit();
//			}	
//		}
			Pla[temp+1].setAccont(account);
			System.out.println("请输入您的账户密码");
			String password = in.next();
			Pla[temp+1].setCode(password);
			System.out.println("注册成功! ");
			n++;
			System.out.println("请输入运动员编号: ");
			num = in.nextInt();
			if(n != 0) {
			for(int i = 0;i<n;i++) { //检测编号是否重复
				while (su[i].getNumber() == num) {
					System.out.println("编号已存在，请重新输入: ");
					num = in.nextInt();
					}
				}
			}
			su[n].setNumber(num);
			System.out.println("请输入运动员名字");
			str = in.next();
			su[n].setName(str);
			System.out.println("请输入运动员年龄: ");
			t = in.nextInt();
			su[n].setAge(t);
			System.out.println("录入完成! ");
			main_window();	
	}
	
	private static void StudentLogin() {
		int temp = 0;
		System.out.println("请输入账户: ");
		Scanner in = new Scanner(System.in);
		String account = in.next();
		for(int i = 0;i<n;i++) {
			if(Objects.equals(account,Pla[n].getAccont())) {
				System.out.println("请输入您的密码: ");
				String passcode = in.next();
				for(int j = 0;j<n;j++) {
					if(Objects.equals(passcode,Pla[n].getCode())) {
						System.out.println("登录成功！");
						Student();
					}
					else {
						System.out.println("密码错误，请重新输入: ");
						StudentLogin();
					}
				}
			}
			else {
				System.out.println("账号不存在! ");
				StudentLogin();
			}
			
		}
	}
	
	private static void Student() {
		System.out.println("-----------------------------------------------");
		  System.out.println("-----请选择你要执行的操作:   ---------------");
		  System.out.println("-----1.报名参赛    ---------------");
		  System.out.println("-----2.个人信息咨询     ---------------");
		  System.out.println("-----3.查看排行榜    ---------------");
		  System.out.println("-----4.查看公告    ---------------");
		  System.out.println("-----5.退出系统    ---------------");
		 System.out.println("-----------------------------------------------");
		  Scanner In = new Scanner(System.in);
		  int ch = In.nextInt();
		  if(ch == 1) Signup();
		  else if(ch == 2) Message();
		  else if(ch == 3) checkRanking();
		  else if(ch == 4) SeeNews();
		  else if(ch == 5) main_window();
		  else {
			  System.out.println("输入错误! ");
			  Student();
		  }
		  
	}
	private static void Player_message() {
		System.out.println("-----------------------------------------------");
		  System.out.println("-----请选择你要执行的操作:   ---------------");
		  System.out.println("-----1.录入用户    ---------------");
		  System.out.println("-----2.审批用户    ---------------");
		  System.out.println("-----3.禁用账户    ---------------");
		  System.out.println("-----4.重置密码    ---------------");
		  System.out.println("-----5.退出系统    ---------------");
		 System.out.println("-----------------------------------------------");
		  Scanner ch1 = new Scanner(System.in);
		  int c1 = ch1.nextInt();
		  if(c1 == 1) Apply();
		  else if(c1 == 2) checkUser();
		  else if(c1 == 3) Forbodden();
		  else if(c1 == 4) Reset();
		  else if(c1 == 5) Teacher();
		  else {
			  System.out.println("输入错误! ");
			  Player_message();
		  }
	}
	private static void Activity() {
		System.out.println("-----------------------------------------------");
		  System.out.println("-----请选择你要执行的操作:   ---------------");
		  System.out.println("-----1.启用报名活动    ---------------");
		  System.out.println("-----2.统计报名情况    ---------------");
		  System.out.println("-----3.退出系统    ---------------");
		 System.out.println("-----------------------------------------------");
		  Scanner ch2 = new Scanner(System.in);
		  int c2 = ch2.nextInt();
		  if(c2 == 1) StartApply();
		  else if(c2 == 2) statisticsApply();
		  else if(c2 == 3) Teacher();
		  else {
			  System.out.println("输入错误! ");
			  Activity();
		  }
	}
	private static void Score() {
		System.out.println("-----------------------------------------------");
		  System.out.println("-----请选择你要执行的操作:   ---------------");
		  System.out.println("-----1.录入比赛成绩    ---------------");
		  System.out.println("-----2.咨询成绩排名     ---------------");
		  System.out.println("-----3.查看排行榜    ---------------");
		  System.out.println("-----4.退出系统    ---------------");
		 System.out.println("-----------------------------------------------");
		  Scanner ch3 = new Scanner(System.in);
		  int c3 = ch3.nextInt();
		  if(c3 == 1) recodeScore();
		  else if(c3 == 2) checkRanking();
		  else if(c3 == 3) checkRankList();
		  else if(c3 == 4) Teacher();
		  else {
			  System.out.println("输入错误! ");
			  Score();
		  }
	}
	private static void News() {
		System.out.println("-----------------------------------------------");
		System.out.println("请撰写公告:(按下回车结束)\n");
		Scanner gg = new Scanner(System.in);
		String str;
		if(gg.hasNextLine()){
            s[1]=gg.nextLine();
        }			
		 System.out.println("-----------------------------------------------");
	}
	
	
	private static void Apply() {
		//管理员录入
		String str;
		int num1 = 0,t;
		String acc;
		String password;
		while(true)
		{
//			su[n] = new Player();
			System.out.println("请输入运动员编号: ");
			Scanner in = new Scanner(System.in);
			num1 = in.nextInt();
			if(n != 0) {
			for(int i = 0;i<n;i++) { //检测编号是否重复
				while (su[i].getNumber() == num1) {
					System.out.println("编号已存在，请重新输入: ");
					num1 = in.nextInt();
				}
			}
			}
			su[n].setNumber(num1);
			System.out.println("请输入运动员名字");
			str = in.next();
			su[n].setName(str);
			System.out.println("请输入运动员年龄: ");
			t = in.nextInt();
			su[n].setAge(t);
			System.out.println("请输入运动员账户");
			acc = in.next();
			Pla[n].setAccont(acc);
			System.out.println("请输入运动员账户密码");
			password = in.next();
			Pla[n].setCode(password);
			n++;
			System.out.println("是否继续添加? Y / N");
			String choice = in.next();
			char cho = choice.charAt(0);
			if(cho == 'N' || cho == 'n')
				Teacher();
			while(cho!='N'&&cho!='n'&&cho!='Y'&&cho!='y')
			{
				System.out.println("输入无效，请重新输入: ");
				choice = in.next();
				cho = choice.charAt(0);
			}
		}
	}
	
	private static void Signup() {
		int num = 0;
		System.out.println("请输入您的编号: ");
		Scanner in = new Scanner(System.in);
		int mes = in.nextInt();
		for(int i = 0;i<n;i++) {
			if(Objects.equals(mes,su[i].getMes())){
				num = i;
			}
		}
		System.out.println("是否报名？(键入“1”允许注册，键入“0”拒绝注册)");
		int temp = in.nextInt();
		if(temp == 1) {
			su[num].setMes(temp);
			System.out.println("报名成功");
		}
		if(temp == 0) {
			Student();
		}
	}
	
	private static void Message() {
		String str;
		int num1 = 0,t;
		System.out.println("请输入运动员编号");
		Scanner in = new Scanner(System.in);
		num1 = in.nextInt();
		for(int i = 0;i<n;i++) {
			if(su[i].getNumber() == num1) {
				System.out.println("您的姓名为: " + su[i].getName() + "\t您的年龄为: " + su[i].getAge() + "\n");
				if(su[i].getStart() == 0)
					System.out.println("比赛尚为开始");
				if(su[i].getStart() == 1) {
					if(su[i].getMes() == 1)
						System.out.println("您的排名为: " + su[i].getRanks() + "\t您的成绩为:  " + su[i].getGrade() + "\n");
					else if(su[i].getMes() == 0)
						System.out.println("您尚未报名! ");
				}
			}
		}
	}

	private static void SeeNews() {
		//查看公告
				System.out.println("-----------------------------------------------\n");
				System.out.println("");
				System.out.println(s[1]);
				System.out.println("");
				 System.out.println("-----------------------------------------------");
	}
	
	private static void checkUser() {
		//审批用户
		int check;
		Scanner In = new Scanner(System.in);
		System.out.println("运动员信息如下: ");
		for(int i = 0;i<n;i++) {
			System.out.println("运动员编号: " + su[i].getNumber() + "\n");
			System.out.println("运动员姓名: "+ su[i].getName() + "\t运动员年龄: " + su[i].getAge() + "\n");
			System.out.println("是否允许注册? (键入“1”允许注册，键入“0”拒绝注册)");
			check = In.nextInt();
			if(check == 1)
				su[i].setMes(check);
				System.out.println("允许注册成功");
				if(su[i].getStart() == 0)
					System.out.println("比赛尚未开始，无法查看成绩与排名");
				if(su[i].getStart() == 1)
					System.out.println("运动员排名: " + su[i].getRanks() + "\t运动员成绩 " + su[i].getGrade() + "\n");
			if(check == 0)
				su[i].setMes(check);
		}
		Player_message();
	}
	
	private static void Forbodden() {
		int check;
		Scanner In = new Scanner(System.in);
		System.out.println("运动员信息如下: ");
		for(int i = 0;i<n;i++) {
			System.out.println("运动员编号: " + su[i].getNumber() + "\n");
			System.out.println("运动员姓名: "+ su[i].getName() + "\t运动员年龄: " + su[i].getAge() + "\n");
			System.out.println("是否禁用该运动员信息? (键入“1”执行操作，键入“0”保留信息)");
			check = In.nextInt();
			if(check == 1)
				su[i].setForbid(check);
			if(check == 0)
				System.out.println("运动员信息已保留");
		}
		Player_message();
	}
	
	private static void Reset() {
		 System.out.println("请输入原来的密码:");
		  Scanner In=new Scanner(System.in);
		  String code =In.nextLine();
		  if (!Objects.equals(code, ac.getCode()))
		  {
		   System.out.println("密码输入错误！");
		   Teacher();
		  }
		  System.out.println("请输入新密码:"); //要求输入两次新密码
		  String co1=In.nextLine();
		  System.out.println("请再次输入新密码:");
		  String co2=In.nextLine();
		  if (!Objects.equals(co1, co2))
		  {
		   System.out.println("两次输入密码不一致！");
		   System.out.println("即将返回主界面");
		   Teacher();
		  }
		  else
		  {
		   ac.setCode(co1);
		   System.out.println("密码修改成功!");
		   System.out.println("输入任意值返回主菜单");
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
			System.out.println("比赛以开始! ");
			for(int i = 0;i<n;i++) {
				su[i].setStart(1);
			}
		if(temp == 0)
			System.out.println("不开始比赛，需要开始比赛请重新登入此界面");
		Activity();
	}
		
	private static void statisticsApply() {
		for(int i=0;i<n;i++) {
			System.out.println("运动员编号" + su[i].getNumber() + "\n");
			System.out.println("运动员姓名: " + su[i].getName() + "\t运动员年龄: " + su[i].getAge());
			if(su[i].getMes() == 1)
				System.out.println("该运动员已报名");
			if(su[i].getMes() == 0)
				System.out.println("该运动员未报名");
		}
		Activity();
	}
	
	private static void recodeScore() {
		System.out.println("请输入您的运动员编号:");
		Scanner in = new Scanner(System.in);
		int num1=in.nextInt();
//		System.out.println(num);
		for(int i = 0;i<n;i++) {
			if(su[i].getNumber() == num1) {
				
				System.out.println("输入格式：x小时x分x秒.=x,x,x,0\n");//最后的“，0”表示结束
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
		System.out.println("请输入您的运动员编号:");
		Scanner in = new Scanner(System.in);
		int num1=in.nextInt();
//		System.out.println(num);
		for(int i = 0;i<n;i++) {
			if(su[i].getNumber() == num1) {
				System.out.println("您的排名为: " + su[i].getRanks());
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
			System.out.println("第 "+i+" 名："+list3[i]+"，编号："+list2[i]);
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
