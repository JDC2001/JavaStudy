public class CommandLine {
//    public static void main(String args[]) {
//        for (int i = 0; i<args.length; i++){
//            System.out.println("args[" + i + "]: " + args[i]);
//        }
//    }
    static void sayHello(String name)//定义一个有参的函数用与调用他时接收数据，数据顺序得匹配
    {

        System.out.println("hi" + name);
    }

    public static void main(String[] args) {
        sayHello("金敦超");
        sayHello("lihua");
    }
}
