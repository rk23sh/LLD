package adapter;

public class Client {
    public static void main(String[] args) {
        OldPlug oldPlug = new OldPlug();
        Adapter adapter = new Adapter();
        ModernSocket modernSocket = new ModernSocket();
        adapter.insert(oldPlug);
        adapter.fit(modernSocket);
    }
}

interface Plug{
    void fit(Socket socket);
}

interface Socket{
    void insert(Plug plug);
}

interface OldPlugConcept extends Plug{ }
interface NewPlugConcept extends Plug{ }
interface OldSocketConcept extends Socket{ }
interface NewSocketConcept extends Socket{ }

class OldPlug implements OldPlugConcept{
    @Override
    public void fit(Socket socket) {

    }
}

class ModernSocket implements NewSocketConcept{
    @Override
    public void insert(Plug plug) {

    }
}

class Adapter implements OldSocketConcept, NewPlugConcept{
    @Override
    public void fit(Socket socket) {
        System.out.println("adapter fit in socket");
    }

    @Override
    public void insert(Plug plug) {
        System.out.println("plug inserted in adapter");
    }
}

