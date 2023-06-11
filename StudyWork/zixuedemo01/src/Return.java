public class Return {
    static int sum(int n1,int n2) {
        return n1+n2;
    }

    private String color;


    //get/set专门针对于pravite变量
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        int sum1 = sum(23,45);//返回int类型68
        System.out.println(sum1);//返回的值在显示器打印
        System.out.println();
        System.out.println("很快就但是v还是");
    }
}
