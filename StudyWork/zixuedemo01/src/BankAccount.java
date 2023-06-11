public class BankAccount {
    private static double base = 3.5;
//    Scanner sc = new Scanner();
    //*********************************封装*********************************
    public static double deposit(double x) {
        if(x > 0){
            base+=x;
        }
        return x;
    }
    public static void main(String[] args) {
//        System.out.println("现在的余额为：" +  base);
        double in = deposit(30);//只能通过调用peposit()函数来访问private base这个变量
        System.out.println(base);
    }
}
