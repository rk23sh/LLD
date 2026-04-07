package Factory;

public class Product{}

interface Vehicle {
    void start();
}

class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("car starts");
    }
}

class Bike implements Vehicle{
    @Override
    public void start() {
        System.out.println("bike starts");
    }
}