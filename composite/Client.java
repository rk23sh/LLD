package composite;
import java.util.*;

public class Client {
    public static void main(String[] args) {
        Folder web = new Folder("Web");
        web.add(new TextFile("index.txt"));
        web.add(new TextFile("style.txt"));
        web.add(new TextFile("scipt.txt"));

        Folder images = new Folder("images");
        images.add(new ImageFile("bird.jpg"));
        images.add(new ImageFile("sky.jpg"));

        web.add(images);

        web.show(0);
    }
}

interface Storable{

}

abstract class Container implements Storable{
    abstract void show(int level);
}

abstract class File extends Container{

}

class TextFile extends File{
    String name;
    TextFile(String name){
        this.name = name;
    }

    @Override
    void show(int level) {
        for(int i=0; i<level; i++) {
            System.out.print(" ");
        }

        System.out.println(name);
    }
}

class ImageFile extends File{
    String name;
    ImageFile(String name){
        this.name = name;
    }

    @Override
    void show(int level) {
        for(int i=0; i<level; i++) {
            System.out.print(" ");
        }

        System.out.println(name);
    }
}

class Folder extends Container{
    List<Container> files;
    String name;
    Folder(String name){
        this.name = name;
        this.files = new ArrayList<>();
    }

    void add(Container file){
        files.add(file);
    }

    void show(int level){
        for(int i=0; i<level; i++) {
            System.out.print(" ");
        }

        System.out.println("> "+this.name +": ");
        for(Container container: files){
            for(int i=0; i<level+1; i++) System.out.print(" "); // just spacing, nothing to ponder here much.
            container.show(level+1);
        }
    }
}

