package ZhouXiang;
public abstract class Shape {
    public abstract double getArea();//���󷽷�getArea()

    public abstract double getPerimeter();//���󷽷�getPerimeter()

    // Shape��һ�������࣬���������������󷽷�getArea()��getPerimeter()
}

//Ȼ�������������������Circle��Rectangle���ֱ�ʵ����Shape�е��������󷽷���
// Circle��Rectangle�඼ӵ���Լ������Ժ���Ϊ�����Ҷ��ܹ�����Shape�еĹ���������
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    //��д����
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

class Test {
    public static void main(String[] args) {
        //ʵ����Circle
        Circle c = new Circle(2);
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());

        //ʵ����Rectangle
        Rectangle r = new Rectangle(20,35);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
    }
}
