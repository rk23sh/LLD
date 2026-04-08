package prototype;

public class Test {
    public static void main(String[] args) {
        Robot robot = new Robot("T800", 2, 2, "shotgun", 1);
        Robot r1 = robot.cloneRobot();
        System.out.println(r1);
    }
}

// let's say a bad robot comes in and wants to create its own clone and take over the planet.
// how is it gonna do it?

class Robot implements CloningConcept {
    String name;
    int arms;
    int legs;
    String weapon;
    int processorVersion;

    Robot(String name, int arms, int legs, String weapon, int processorVersion){
        this.name = name;
        this.arms = arms;
        this.legs = legs;
        this.weapon = weapon;
        this.processorVersion = processorVersion;
    }

    public Robot cloneRobot() {
        return new Robot(name, arms, legs, weapon, processorVersion);
    }

    public String toString() {
        return "( " + name + ", " + arms + ", " + legs + ", " + weapon + ", " + processorVersion + " )";
    }
}

interface CloningConcept{
    Robot cloneRobot();
}

