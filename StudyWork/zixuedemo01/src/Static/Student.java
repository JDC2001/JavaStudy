package Static;


public class Student{
        static String schoolName;//静态的成员变量，可直接被其他类的各个对象访问
        static final double PI = 3.14;//final定义常量
    }


    class Demo{
        public static void main(String[] args){
            Student.schoolName="SUST";//不创建对象就可以访问变量
            Student s1=new Student();//创建学生对象
            Student s2=new Student();
            System.out.println("我的学校:"+s1.schoolName);//两个对象可以共享静态变量
            System.out.println("我的学校:"+s2.schoolName);
			/*如果没有static修饰的变量，则应该给每一个对象都要进行赋值操作：
			s1.schoolName="SUST";
			s2.schoolName="SUST";
			System.out.println("我的学校:"+s1.schoolName);
			System.out.println("我的学校:"+s2.schoolName);
			*/
        }
    }


