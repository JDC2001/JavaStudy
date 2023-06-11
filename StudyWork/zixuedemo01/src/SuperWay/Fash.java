package SuperWay;

public class Fash {
    void eat() {
        System.out.println("大口吃");
    }

}

class LittelFash extends Fash {
    @Override//重写继承过来的方法
    void eat() {
        super.eat();
        System.out.println("小口吃");
    }

    void run() {
        super.eat();//super的第二个用法：通过 super.eat() 可以访问到父类的 eat() 方法。
        System.out.println("游动");

    }

    void juple() {
        System.out.println("跳跃");
    }

//    void run() {
//
//    }
//在java中同一个类中一定不允许定义两个完全相等的函数，但是JavaScript可以
}

class CeShi01 {
    public static void main(String[] args) {
    LittelFash f = new LittelFash();
    f.eat();
    f.juple();
    f.run();


    }
}
