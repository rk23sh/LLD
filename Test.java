public class Test {
    public static void main(String[] args) {
        B b = new B();
    }
}

class A{
    A(int x){
        System.out.println("in A " + x);
    }
    void say(){
        System.out.println("say in A");
    }
}

class B extends A{
    B(){
        super(3);
        System.out.println("in B");
        this.say();
        super.say();

    }
    void say(){
        System.out.println("say in B");
    }
}