package Extends02;

import jdk.nashorn.api.tree.NewTree;

public class Animal {
    public void makeSound() {
        System.out.println("����Ľ���");
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
//����Ϊ��������д��Cat��Dog���̳��˸����makeSound()����������Ҫ��д����ķ�����ʵ������

class Test {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        d.makeSound();
        a.makeSound();
    }
}

