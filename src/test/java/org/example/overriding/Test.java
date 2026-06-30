package org.example.overriding;

public class Test {
    public static void main(String[] args) {
        Animal an = new Dog();
        //Dog an = new Dog();
        an.move();
        an.eat();
        //an.bark();
    }
}
