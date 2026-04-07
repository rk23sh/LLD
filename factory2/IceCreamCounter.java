package factory2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class IceCreamCounter {
    public static void main(String[] args) {
        Food icecream = new IceCream();
        ScheduledExecutorService schedular = Executors.newScheduledThreadPool(1);

        schedular.scheduleAtFixedRate(icecream::up, 0, 1, TimeUnit.SECONDS);
    }
}
