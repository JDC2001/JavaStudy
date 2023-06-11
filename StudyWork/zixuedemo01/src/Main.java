public class Main {

//    public static int minFun(int a,int b) {
//        int min;
//        if (a>b)
//            min=b;
//        else
//            min=a;
//        return  min;
//    }
//
//
//
//    public static void main(String[] args) {
//        System.out.println("a");
//    }

    public static void main(String[] args) {
        int a = 11;
        int b =22;
        int c = getMin(a,b);
        System.out.println("isowudqwfiu 基地啊好的：" + c);
        System.out.println("这是 访问");
    }

    public static int getMin(int n1,int n2) //形式参数可以随便变换，这里写a，b也可以
    {
        int min;
        if(n1>n2)
            min=n1;
        else
            min=n2;
        return min;
    }
}
