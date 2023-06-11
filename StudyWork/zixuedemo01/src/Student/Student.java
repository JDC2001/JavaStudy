package Student;

/**
 * @作者：金敦超
 * @项目：学生类的封装，get/set方法，this的使用，有参构造函数，无参构造函数
 * @时间：2023.4.24
 */
public class Student {
    private String name;
    private int age;
    private String major;

    public Student(String name, int age, String major) {
        System.out.println("我是学生类的有参构造函数");
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public Student() {
        System.out.println("我是学生类的无参构造函数");
        this.name = "金";
        this.age = 2;
        this.major = "软";
        return;
    }//创建无参构造函数

    //针对private的成员变量
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    public void setName(String name) {
        this.name = name;
//        name = "李四";这是一句冗余废话
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}

class Test {
    public static void main(String[] args) {
        Student stu = new Student();
        Student stu01 = new Student("金敦超",21,"软件工程");
        //设置参数传值给成员变量，故不需要在get/set方法发中定义变量值

        //输出
        System.out.println(stu01.getName());
        System.out.println(stu01.getAge());
        System.out.println(stu01.getMajor());
        System.out.println(stu.getName());
        System.out.println(stu.getMajor());
        System.out.println(stu.getAge());

    }
}