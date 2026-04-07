package Factory;

public class Creator {
    public static void main(String[] args) {

    }
}
//
//abstract class Factory{
//    public abstract void createVehicle(A a);
//}

interface Factory{
    Vehicle getVehicle();
}

class CarFactory implements Factory{
    @Override
    public Vehicle getVehicle() {
        return new Car();
    }
}