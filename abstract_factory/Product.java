package abstract_factory;

public class Product { }

interface Food{
    void up();
}

interface IceCream extends Food{

}

class Cornetto implements IceCream{
    @Override
    public void up() {
        System.out.println("cornetto up");
    }
}

class Popsicle implements IceCream{
    @Override
    public void up() {
        System.out.println("Popscile up");
    }
}

class Cup implements IceCream{
    @Override
    public void up() {
        System.out.println("Cup up");
    }
}

interface Pizza extends Food{

}

class Volcano implements Pizza{
    @Override
    public void up() {
        System.out.println("Volcano up");
    }
}

class CheeseBurst implements Pizza{
    @Override
    public void up() {
        System.out.println("CheeseBurst up");
    }
}

class ChickenPizza implements Pizza{
    @Override
    public void up() {
        System.out.println("ChickenPizza up");
    }
}

