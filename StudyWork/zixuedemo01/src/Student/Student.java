package Student;

/**
 * @���ߣ���س�
 * @��Ŀ��ѧ����ķ�װ��get/set������this��ʹ�ã��вι��캯�����޲ι��캯��
 * @ʱ�䣺2023.4.24
 */
public class Student {
    private String name;
    private int age;
    private String major;

    public Student(String name, int age, String major) {
        System.out.println("����ѧ������вι��캯��");
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public Student() {
        System.out.println("����ѧ������޲ι��캯��");
        this.name = "��";
        this.age = 2;
        this.major = "��";
        return;
    }//�����޲ι��캯��

    //���private�ĳ�Ա����
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
//        name = "����";����һ������ϻ�
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
        Student stu01 = new Student("��س�",21,"�������");
        //���ò�����ֵ����Ա�������ʲ���Ҫ��get/set�������ж������ֵ

        //���
        System.out.println(stu01.getName());
        System.out.println(stu01.getAge());
        System.out.println(stu01.getMajor());
        System.out.println(stu.getName());
        System.out.println(stu.getMajor());
        System.out.println(stu.getAge());

    }
}