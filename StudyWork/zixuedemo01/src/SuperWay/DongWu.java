package SuperWay;

public class DongWu {
    String color = "��ɫ";
}

class DongWu01 extends DongWu {
    String color = "��ɫ";
    void printColor() {
        System.out.println("�������ද�����ɫ" + color);
        System.out.println("���Ǹ��ද�����ɫ" + super.color);
        //super�ĵ�һ���÷���ָ���࣬������ͬ���ֶ�color
    }
}

class Test {
    public static void main(String[] args) {
        //ʵ�����࣬��������
        DongWu01 dog = new DongWu01();
        System.out.println(dog.color);//����dog���ද�����ɫ
        dog.printColor();//���ø���ĺ���
    }
}
