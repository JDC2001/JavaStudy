public class SwappingExample {
    public static void main(String[] args) {
        int a = 30;
        int b = 45;
//        System.out.println("调换前：a=" + a + "b=" + b);

        //调用交换方法
        swapFunction(a,b);
        System.out.println("这是调换后的数据：a" + a + "b=" +b);
        //有换回来了

    }

    public static void swapFunction(int a,int b) {
        System.out.println("交换前：a=" + a + "b=" + b);

        //交换a,b
        int temp = a;
        a = b;
        b = temp;
        System.out.println("交换后：a=" + a + "b=" + b);


    }

}
