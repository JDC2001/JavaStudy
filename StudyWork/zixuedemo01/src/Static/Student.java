package Static;


public class Student{
        static String schoolName;//��̬�ĳ�Ա��������ֱ�ӱ�������ĸ����������
        static final double PI = 3.14;//final���峣��
    }


    class Demo{
        public static void main(String[] args){
            Student.schoolName="SUST";//����������Ϳ��Է��ʱ���
            Student s1=new Student();//����ѧ������
            Student s2=new Student();
            System.out.println("�ҵ�ѧУ:"+s1.schoolName);//����������Թ���̬����
            System.out.println("�ҵ�ѧУ:"+s2.schoolName);
			/*���û��static���εı�������Ӧ�ø�ÿһ������Ҫ���и�ֵ������
			s1.schoolName="SUST";
			s2.schoolName="SUST";
			System.out.println("�ҵ�ѧУ:"+s1.schoolName);
			System.out.println("�ҵ�ѧУ:"+s2.schoolName);
			*/
        }
    }


