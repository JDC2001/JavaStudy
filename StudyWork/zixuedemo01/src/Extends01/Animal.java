package Extends01;

public class Animal {
    protected int legs;

    private void sleep(int time) {
        System.out.println("����˯" + time +"��Сʱ");

    }
    public void run() {
        System.out.println("�������ܲ�");
    }
    public void eat() {
        System.out.println("����Է��ķ���");
    }
}

class Dog extends Animal {
    Dog() {
        legs = 4;
        System.out.println("��������Ĺ��췽�����");
    }
}
class Test {
    public static void main(String[] args) {
    Animal aa = new Animal();
    Dog d01 = new Dog();
    d01.legs=3;
    d01.eat();
    d01.run();
//    d01.sleep(10);//�޷��̳г����private����
        System.out.println("һ�Ź�����ֻ����������");
    }
}

