package InterFace01;
//Drawable是一个接口，它只包含了一个抽象方法draw()。实现该接口的类必须提供具体的实现来完成该方法。
public interface Drawable {
    void draw();
}

//定义了两个实现了Drawable接口的具体类Circle和Rectangle，
// 它们都拥有自己的属性和行为，并且都实现了Drawable中的抽象方法draw()。
 class Circle implements Drawable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}

class Rectangle implements Drawable {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with width " + width + " and height " + height);
    }
}

class Test {
    public static void main(String[] args) {
        Circle c = new Circle(23);
        Rectangle r = new Rectangle(23,45);
        c.draw();
        r.draw();
    }
}

//接口提供了一种将行为和实现分离的方式，使得代码更加灵活和可扩展。
//接口就是一些定义未实现的抽象方法集合，需要配合implements来实现接口，其中方法必须重写
