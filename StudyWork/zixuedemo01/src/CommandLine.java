public class CommandLine {
//    public static void main(String args[]) {
//        for (int i = 0; i<args.length; i++){
//            System.out.println("args[" + i + "]: " + args[i]);
//        }
//    }
    static void sayHello(String name)//����һ���вεĺ������������ʱ�������ݣ�����˳���ƥ��
    {

        System.out.println("hi" + name);
    }

    public static void main(String[] args) {
        sayHello("��س�");
        sayHello("lihua");
    }
}
