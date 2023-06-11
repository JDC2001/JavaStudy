package Extends02;

import jdk.nashorn.api.tree.NewTree;

public class Animal {
    public void makeSound() {
        System.out.println("动物的叫声");
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
//以上为方法的重写，Cat，Dog都继承了父类的makeSound()方法，我需要重写子类的方法来实现需求

class Test {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        d.makeSound();
        a.makeSound();
    }
}

