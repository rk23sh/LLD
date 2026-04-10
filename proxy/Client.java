package proxy;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        Server server = new ProxyServer();
        server.put("name", "Michael Cheritto");
        String name = server.fetch("name");
        System.out.println("my name: "+name);
    }
}

interface Server{
    String fetch(String key);
    void put(String key, String value);
}

class ProxyServer implements Server{
    private MainServer mainServer;

    ProxyServer(){
        mainServer = new MainServer();
    }

    @Override
    public String fetch(String key) {
        return mainServer.fetch(key);
    }

    @Override
    public void put(String key, String value) {
        mainServer.put(key, value);
    }
}

class MainServer implements Server{
    private HashMap<String, String> database = new HashMap<>();

    public void put(String key, String value){
        database.put(key, value);
    }

    @Override
    public String fetch(String key) {
        if (!database.containsKey(key)) {
            return null;
        }
        return database.get(key);
    }
}