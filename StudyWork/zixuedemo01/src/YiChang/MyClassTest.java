package YiChang;

public class MyClassTest {
    public static void main(String[] args) {
        try {
            int a[] = new int[2];//创建一个有2个元素的数组，其中没有a[5]
            System.out.println(a[5]);//数组中没有第6个元素，执行catch语句
        }
        catch (Exception e)//(Exception e)附加这条语句是为了辅助捕获所有可能的异常
        {
            System.out.println("发生错误!!!");
        }
    }

}
