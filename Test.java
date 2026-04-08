public class Test {
    public static void main(String[] args) {
        Custom custom = null;
        System.out.println(custom);
    }
}

class Custom{
    @Override
    public String toString() {
        return "custom";
    }
}