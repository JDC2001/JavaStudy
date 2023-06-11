package Extends01;

public class Animal {
    protected int legs;

    private void sleep(int time) {
        System.out.println("动物睡" + time +"个小时");

    }
    public void run() {
        System.out.println("狗狗在跑步");
    }
    public void eat() {
        System.out.println("动物吃饭的方法");
    }
}

class Dog extends Animal {
    Dog() {
        legs = 4;
        System.out.println("这是子类的构造方法输出");
    }
}
class Test {
    public static void main(String[] args) {
    Animal aa = new Animal();
    Dog d01 = new Dog();
    d01.legs=3;
    d01.eat();
    d01.run();
//    d01.sleep(10);//无法继承超类的private变量
        System.out.println("一号狗现在只有三条腿了");
    }
}

