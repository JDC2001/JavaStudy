public class SwappingExample {
    public static void main(String[] args) {
        int a = 30;
        int b = 45;
//        System.out.println("����ǰ��a=" + a + "b=" + b);

        //���ý�������
        swapFunction(a,b);
        System.out.println("���ǵ���������ݣ�a" + a + "b=" +b);
        //�л�������

    }

    public static void swapFunction(int a,int b) {
        System.out.println("����ǰ��a=" + a + "b=" + b);

        //����a,b
        int temp = a;
        a = b;
        b = temp;
        System.out.println("������a=" + a + "b=" + b);


    }

}
