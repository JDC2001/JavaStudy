package YiChang;

public class MyClassTest {
    public static void main(String[] args) {
        try {
            int a[] = new int[2];//����һ����2��Ԫ�ص����飬����û��a[5]
            System.out.println(a[5]);//������û�е�6��Ԫ�أ�ִ��catch���
        }
        catch (Exception e)//(Exception e)�������������Ϊ�˸����������п��ܵ��쳣
        {
            System.out.println("��������!!!");
        }
    }

}
