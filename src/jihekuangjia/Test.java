package jihekuangjia;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class Test
{
    public static void main(String[] args)
    {
        //����������Ϣ��set��
        Set<Student> stuSet = saveStudentInfo();
        //����set
        Iterator<Student> it = stuSet.iterator();
        while (it.hasNext())
        {
            String info = it.next().toString();
            System.out.println(info);
        }
    }
    private static Set<Student> saveStudentInfo()
    {
        Scanner input = new Scanner(System.in);
        // ����ѧ����Ϣ��TreeSet���϶���
        Set<Student> stuSet = new TreeSet<Student>();
        while (true)
        {
            // ������ʾ
            System.out.println("������ѧ����Ϣ:(ѧ��#����#����)");
            String inputData = input.nextLine();
            // �ж��Ƿ��˳� inputData.equals("exit")
            if ("exit".equals(inputData))
            {
                break;
            }
            // ���û������ѧ����Ϣ�ָ�ΪString[]
            String[] info = inputData.split("#");
            // ��������Ϣ��װ��Student������
            Student stu = new Student();
            // ��ѧ��������뼯��
            stuSet.add(stu);
        }
        return stuSet;
    }
}

