public class ExampleOverloading {


//    public static int add(int x, int y) {
//        return x + y;
//    }
//
//    public  double add(double x, double y) {
//        return x + y;
//    }
//
//    public int add(int x, int y, int z) {
//        return x + y + z;
//
//    }
    //    ������ʾ���У�Calculator�ඨ��������add�������ֱ������������������������������������Ϊ������
    //    ����������������Ϊadd�����������ǵĲ������ͺ�������ͬ��������ǹ����˷������ء�

    public static void main(String[] args) {
        int a = 11;
        int b = 22;
        double d = 2.1;
        double c = 4.6;
        int result01 = getMin(a,b);
        double result02 = getMin(c,d);
        //result01,result02�����Ĳ������Ͳ�ͬ��


        System.out.println("��С������= " + result01);//���int���
        System.out.println("��С������= " + result02);//���double���

    }
    //����double���͵ķ���������
    public static double getMin(double n1, double n2) {
        double min;
        if (n1 > n2)
        {
            min = n2;
        }
        else
            min = n1;
        return min;
    }

    //����int���͵ķ���������
    public static int getMin(int n1, int n2) {
        int min;
        if (n1 > n2)
        {
            min = n2;
        }
        else
            min = n1;
        return min;
    }




}
