package SuperWay;

public class Fash {
    void eat() {
        System.out.println("��ڳ�");
    }

}

class LittelFash extends Fash {
    @Override//��д�̳й����ķ���
    void eat() {
        super.eat();
        System.out.println("С�ڳ�");
    }

    void run() {
        super.eat();//super�ĵڶ����÷���ͨ�� super.eat() ���Է��ʵ������ eat() ������
        System.out.println("�ζ�");

    }

    void juple() {
        System.out.println("��Ծ");
    }

//    void run() {
//
//    }
//��java��ͬһ������һ����������������ȫ��ȵĺ���������JavaScript����
}

class CeShi01 {
    public static void main(String[] args) {
    LittelFash f = new LittelFash();
    f.eat();
    f.juple();
    f.run();


    }
}
