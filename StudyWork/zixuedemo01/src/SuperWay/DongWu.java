package SuperWay;

public class DongWu {
    String color = "红色";
}

class DongWu01 extends DongWu {
    String color = "黑色";
    void printColor() {
        System.out.println("这是子类动物的颜色" + color);
        System.out.println("这是父类动物的颜色" + super.color);
        //super的第一个用法：指向父类，访问其同名字段color
    }
}

class Test {
    public static void main(String[] args) {
        //实例化类，创建对象
        DongWu01 dog = new DongWu01();
        System.out.println(dog.color);//这是dog子类动物的颜色
        dog.printColor();//调用父类的函数
    }
}
