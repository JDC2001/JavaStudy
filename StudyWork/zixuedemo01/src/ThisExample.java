public class ThisExample {
    int num = 10;//ʵ������
    //������������һ���Ĺ��캯�������캯�����践��ֵ,(�η���ΪĬ�Ϲ��췽��)
    ThisExample() {
        System.out.println("����ʵ��1");
    }

    void ThisExample01(int b) {

    }

    //����һ���вκ����������numΪ�ֲ�����������������ı�����
    ThisExample(int num) {
        this();//���õ�ThisExample()Ĭ�Ϲ��캯��
        this.num = num;//�Ѿֲ�����num�����ʵ������
    }

    public void greet() {
        System.out.println("hi����ã�");
    }

    public void print() {
        int num = 20;//�ֲ�����num=20
        System.out.println("��ӡ�ֲ�������" + num);
        System.out.println("��ӡʵ������: " + this.num);

        this.greet();//��Ա����֮�����ͨ��this.�໥����
    }

    public static void main(String[] args) {
        //ʵ��������
        ThisExample obj01 = new ThisExample();
        obj01.greet();//�����������greet()
        obj01.print();//�����������print()

        ThisExample obj02 = new ThisExample(30);//ͨ�����������캯�����µ�numֵ
        obj02.print();


    }
}


