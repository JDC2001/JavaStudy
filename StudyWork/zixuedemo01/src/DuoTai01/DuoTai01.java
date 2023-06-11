package DuoTai01;

class Animal {
    public void makeSound() {
        System.out.println("¶¯ÎïµÄ½ÐÉù£º");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("mimimi~~~~");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("wowowo~~~~");
    }
}

class Test {
    public static void main(String[] args) {
        Animal x1 = new Animal();
        Animal a = new Dog();
        Animal b = new Cat();
        a.makeSound();
        b.makeSound();
        x1.makeSound();
    }
}
