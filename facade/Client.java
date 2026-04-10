package facade;

public class Client {
    public static void main(String[] args) {
        TravelAgent agent = new TravelAgent();
        agent.planTrip("Sikkim");
    }
}

class TravelAgent{
    void planTrip(String place){
        Hotel viewPoint = new Hotel();
        viewPoint.bookRoom(102);
        Car car = new Car();
        car.bookRide("02-05-26", "NJP", "Gangtok");
    }
}

class Hotel{
    void bookRoom(int roomNumber){

    }
}

class Car{
    void bookRide(String date, String from, String to){

    }
}
