public class Return {
    static int sum(int n1,int n2) {
        return n1+n2;
    }

    private String color;


    //get/setר�������pravite����
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        int sum1 = sum(23,45);//����int����68
        System.out.println(sum1);//���ص�ֵ����ʾ����ӡ
        System.out.println();
        System.out.println("�ܿ�͵���v����");
    }
}
