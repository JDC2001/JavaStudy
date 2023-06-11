package SuperWay;
//java只有成员变量和局部变量的概念
public class Person {
    int id;
    String name;
    Person(int id,String name) {
        this.id = id;
        this.name = name;
    }

}

class Emp extends Person {
    float salary;//增加一个工资成员变量

    Emp(int id, String name, float salary) {
        //super() 也可以用来调用父类的有参构造方法，这样可以提高代码的可重用性。
        super(id, name);
        this.salary = salary;
    }



    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}

class CeShi03 {
    public static void main(String[] args) {
    new Emp(202013016,"金敦超",10000f).display();
    new Emp(22232423,"李四",22232f).display();
    }
}
