public class Test {
    public static void main(String[] args) {
        FlyCapable jet = new F35Variant1();

    }
}

interface LandCapable{
    void land();
}

interface FlyCapable{
    void fly();
}

interface FireCapable{
    void fireMissile();
}

interface VerticalTakeOffCapable{
    void verticalTakeOff();
}

interface MoreRadarCoverageCapable{
    void moreRadarCoverage();
}

class Plane implements LandCapable, FlyCapable{
    @Override
    public void land() {
        System.out.println("plane can land");
    }

    @Override
    public void fly() {
        System.out.println("plane can fly");
    }
}

class F35 extends Plane implements FireCapable{
    @Override
    public void fireMissile() {
        System.out.println("F35 can shoot missiles");
    }
}

class F35Variant1 extends F35 implements VerticalTakeOffCapable{
    @Override
    public void verticalTakeOff() {
        System.out.println("F35 variant1 can take-off vertically");
    }
}

class F35Variant2 extends F35 implements MoreRadarCoverageCapable{
    @Override
    public void moreRadarCoverage() {
        System.out.println("F35 variant2 has greater radar coverage");
    }
}