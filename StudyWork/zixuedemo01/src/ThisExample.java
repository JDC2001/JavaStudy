public class ThisExample {
    int num = 10;//实例变量
    //下面是与类名一样的构造函数，构造函数无需返回值,(次方法为默认构造方法)
    ThisExample() {
        System.out.println("这是实例1");
    }

    void ThisExample01(int b) {

    }

    //构造一个有参函数，里面的num为局部变量，（函数里面的变量）
    ThisExample(int num) {
        this();//调用的ThisExample()默认构造函数
        this.num = num;//把局部变量num分配给实例变量
    }

    public void greet() {
        System.out.println("hi，你好！");
    }

    public void print() {
        int num = 20;//局部变量num=20
        System.out.println("打印局部变量：" + num);
        System.out.println("打印实例变量: " + this.num);

        this.greet();//成员函数之间可以通过this.相互访问
    }

    public static void main(String[] args) {
        //实例化该类
        ThisExample obj01 = new ThisExample();
        obj01.greet();//调用类里面的greet()
        obj01.print();//调用类里面的print()

        ThisExample obj02 = new ThisExample(30);//通过参数化构造函数将新的num值
        obj02.print();


    }
}


