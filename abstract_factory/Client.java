package abstract_factory;

public class Client {
    static FoodCombo getOrder(String combo){
        if (combo.equals("kids")){
            FoodCombo com = new KidsMenu();
            com.makePizza();
            com.makeIceCream();
            return com;
        }
        else if(combo.equals("general")){
            FoodCombo com = new General();
            com.makeIceCream();
            com.makePizza();
            return com;
        }
        else if (combo.equals("premium")){
            FoodCombo com = new Premium();
            com.makePizza();
            com.makeIceCream();
            return com;
        }
        return null;
    }
    public static void main(String[] args) {
        getOrder("kids");
    }
}
