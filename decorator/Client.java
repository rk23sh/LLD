package decorator;

public class Client{
    public static void main(String[] args) {
        Popsicle iceCream = new Popsicle("orange");
        System.out.println(iceCream.cost());

        iceCream = new CaramelCoveredIceCream(iceCream);
        System.out.println(iceCream.cost());

        iceCream = new ChocolateCoveredIceCream(iceCream);
        System.out.println(iceCream.cost());
    }
}

class Product{
}

class FoodProduct extends Product{

}

class IceCream extends FoodProduct{

}

class Popsicle extends IceCream{
    protected Popsicle(){}

    Popsicle(String flavour){

    }

    int cost() {
        return 100;
    }
}

class CaramelCoveredIceCream extends Popsicle{
    private Popsicle iceCream;

    CaramelCoveredIceCream(Popsicle iceCream){
        this.iceCream = iceCream;
    }

    int cost() {
        return iceCream.cost() + 20;
    }
}

class ChocolateCoveredIceCream extends Popsicle{
    private Popsicle iceCream;

    ChocolateCoveredIceCream(Popsicle iceCream){
        this.iceCream = iceCream;
    }

    int cost() {
        return iceCream.cost() + 30;
    }
}