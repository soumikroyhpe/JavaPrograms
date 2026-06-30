package org.example.abstract1;

public class Demo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.walk();
        a.eat();

        ((Cat)a).eat();
        ((Cat)a).walk();
    }
}
