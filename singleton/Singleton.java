package singleton;

public final class Singleton {
    private final int x;
    private static Singleton instance;

    private Singleton(int x){
        this.x = x;
    }

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton(12);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "" + this.x;
    }
}
