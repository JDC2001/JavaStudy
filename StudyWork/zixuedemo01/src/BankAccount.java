public class BankAccount {
    private static double base = 3.5;
//    Scanner sc = new Scanner();
    //*********************************��װ*********************************
    public static double deposit(double x) {
        if(x > 0){
            base+=x;
        }
        return x;
    }
    public static void main(String[] args) {
//        System.out.println("���ڵ����Ϊ��" +  base);
        double in = deposit(30);//ֻ��ͨ������peposit()����������private base�������
        System.out.println(base);
    }
}
