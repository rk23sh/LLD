package bridge;

// original structure:

//class Shape{ }
//class Color{ }
//
//class Circle extends Shape{ }
//class Square extends Shape{ }
//
//class Red extends Color{ }
//class Blue extends Color{ }

//-------------------------------------------------------
// full implementation:
// Base classes
class Shape {
    Color color;  // bridge to Color

    void setColor(Color color) {
        this.color = color;
    }

    void draw() {
        System.out.println("Drawing shape in " + color.name);
    }
}

class Color {
    String name;
    Color(String name) {
        this.name = name;
    }
}

// Concrete Shapes
class Circle extends Shape { }
class Square extends Shape { }

// Concrete Colors
class Red extends Color {
    Red() {
        super("Red");
    }
}
class Blue extends Color {
    Blue() {
        super("Blue");
    }
}

// Test
public class Client {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.setColor(new Red());
        circle.draw();   // Drawing shape in Red

        Shape square = new Square();
        square.setColor(new Blue());
        square.draw();   // Drawing shape in Blue
    }
}