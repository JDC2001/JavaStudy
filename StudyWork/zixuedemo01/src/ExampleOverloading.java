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
    //    在上述示例中，Calculator类定义了三个add方法，分别接受两个整数、两个浮点数和三个整数作为参数。
    //    这三个方法都被称为add方法，但它们的参数类型和数量不同，因此它们构成了方法重载。

    public static void main(String[] args) {
        int a = 11;
        int b = 22;
        double d = 2.1;
        double c = 4.6;
        int result01 = getMin(a,b);
        double result02 = getMin(c,d);
        //result01,result02两个的参数类型不同；


        System.out.println("最小的数：= " + result01);//输出int结果
        System.out.println("最小的数：= " + result02);//输出double结果

    }
    //处理double类型的方法从重载
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

    //处理int类型的方法从重载
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
