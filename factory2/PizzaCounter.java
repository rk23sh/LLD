package factory2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class PizzaCounter {
    public static void main(String[] args) {
        Food pizza = new Pizza();

        ScheduledExecutorService schedular = Executors.newScheduledThreadPool(1);

        schedular.scheduleAtFixedRate(pizza::up, 0, 1, TimeUnit.SECONDS);
    }
}