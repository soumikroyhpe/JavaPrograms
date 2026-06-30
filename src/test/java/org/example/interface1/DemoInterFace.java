package org.example.interface1;

public class DemoInterFace {
    public static void main(String[] args) {

        Alto al = new Alto();
        al.display();
        al.wash();

        Car c1 = new Alto();
        al.display();
        al.wash();

    }
}



interface Car {

    default void display(){
        System.out.println("Car interface display method!!!");
    }

    void wash();
}

class Alto implements Car{
    
    public void display() {
       // Car.super.display();
        System.out.println("Alto display method");
    }

    @Override
    public void wash() {
        System.out.println("Alto wash method");
    }
}
