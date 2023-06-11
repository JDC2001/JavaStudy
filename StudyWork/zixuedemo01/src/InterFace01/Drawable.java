package InterFace01;
//Drawable��һ���ӿڣ���ֻ������һ�����󷽷�draw()��ʵ�ָýӿڵ�������ṩ�����ʵ������ɸ÷�����
public interface Drawable {
    void draw();
}

//����������ʵ����Drawable�ӿڵľ�����Circle��Rectangle��
// ���Ƕ�ӵ���Լ������Ժ���Ϊ�����Ҷ�ʵ����Drawable�еĳ��󷽷�draw()��
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

//�ӿ��ṩ��һ�ֽ���Ϊ��ʵ�ַ���ķ�ʽ��ʹ�ô���������Ϳ���չ��
//�ӿھ���һЩ����δʵ�ֵĳ��󷽷����ϣ���Ҫ���implements��ʵ�ֽӿڣ����з���������д
