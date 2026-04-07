package abstract_factory;

public class Factory {
}

interface FoodCombo{
    IceCream makeIceCream();
    Pizza makePizza();
}

class KidsMenu implements FoodCombo{
    @Override
    public IceCream makeIceCream() {
        return new Popsicle();
    }

    @Override
    public Pizza makePizza() {
        return new CheeseBurst();
    }
}

class General implements FoodCombo{
    @Override
    public IceCream makeIceCream() {
        return new Cup();
    }

    @Override
    public Pizza makePizza() {
        return new Volcano();
    }
}

class Premium implements FoodCombo{
    @Override
    public IceCream makeIceCream() {
        return new Cornetto();
    }

    @Override
    public Pizza makePizza() {
        return new ChickenPizza();
    }
}