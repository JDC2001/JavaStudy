package SuperWay;

public class Fu {
     Fu() {
        System.out.println("我是你爹！");
    }
}

class Zi extends Fu{
    Zi() {
        super();//它就是用来调用父类的构造方法的
        System.out.println("我是你儿子!");
    }
}

class CeShe02 {
    public static void main(String[] args) {
//        Zi z = new Zi();
        new Zi();//调用构造函数不需要创建对象，有参无参都一样


    }
}
