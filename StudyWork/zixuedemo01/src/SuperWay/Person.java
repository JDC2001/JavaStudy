package SuperWay;
//javaֻ�г�Ա�����;ֲ������ĸ���
public class Person {
    int id;
    String name;
    Person(int id,String name) {
        this.id = id;
        this.name = name;
    }

}

class Emp extends Person {
    float salary;//����һ�����ʳ�Ա����

    Emp(int id, String name, float salary) {
        //super() Ҳ�����������ø�����вι��췽��������������ߴ���Ŀ������ԡ�
        super(id, name);
        this.salary = salary;
    }



    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}

class CeShi03 {
    public static void main(String[] args) {
    new Emp(202013016,"��س�",10000f).display();
    new Emp(22232423,"����",22232f).display();
    }
}
