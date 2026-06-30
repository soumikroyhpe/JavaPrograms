package org.example.abstract1;

public class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("Cat Eat");
    }

    public void walk() {
        System.out.println("Cat walk");
    }
}
