package ZhouXiang;
public abstract class Shape {
    public abstract double getArea();//抽象方法getArea()

    public abstract double getPerimeter();//抽象方法getPerimeter()

    // Shape是一个抽象类，它包含了两个抽象方法getArea()和getPerimeter()
}

//然后定义了两个具体的子类Circle和Rectangle，分别实现了Shape中的两个抽象方法。
// Circle和Rectangle类都拥有自己的属性和行为，并且都能够调用Shape中的公共方法。
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    //重写方法
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
        //实例化Circle
        Circle c = new Circle(2);
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());

        //实例化Rectangle
        Rectangle r = new Rectangle(20,35);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
    }
}
