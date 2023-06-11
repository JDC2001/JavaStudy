package InterFace;

interface Animal {
    public void eat();
    public void makeSound();
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("ß÷ß÷");
    }

    @Override
    public void eat() {
        System.out.println("³Ô·¹");
    }
}

class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.makeSound();
    }
}
