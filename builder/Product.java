package builder;

public class Product {
}

class Pizza {
    String dough;
    String sauce;
    String cheese;
    String toppings;
}

// this is a concept
interface PizzaBuilder {
    void flattenDough();
    void spreadSauce();
    void addCheese();
    void addToppings();
}

class VegPizzaBuilder implements PizzaBuilder {
    public Pizza pizza = new Pizza();

    @Override
    public void flattenDough() {
        pizza.dough = "thin crust";
    }

    @Override
    public void spreadSauce() {
        pizza.sauce = "tomato";
    }

    @Override
    public void addCheese() {
        pizza.cheese = "mozzarella";
    }

    @Override
    public void addToppings() {
        pizza.toppings = "olives, onion";
    }
}

// this is not necessary, director is optional, client can handle it itself. no need for director.
class PizzaDirector {
    public void constructPizza(PizzaBuilder builder) {
        builder.flattenDough();
        builder.spreadSauce();
        builder.addCheese();
        builder.addToppings();
    }
}