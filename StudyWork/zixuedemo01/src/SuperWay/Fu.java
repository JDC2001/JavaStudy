package SuperWay;

public class Fu {
     Fu() {
        System.out.println("���������");
    }
}

class Zi extends Fu{
    Zi() {
        super();//�������������ø���Ĺ��췽����
        System.out.println("���������!");
    }
}

class CeShe02 {
    public static void main(String[] args) {
//        Zi z = new Zi();
        new Zi();//���ù��캯������Ҫ���������в��޲ζ�һ��


    }
}
