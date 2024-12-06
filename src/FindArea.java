// Define the Shape interface
interface Shape {
    void findArea(); // Abstract method to calculate area
}

// Implement the Rectangle class
class Rectangle implements Shape {
    private double length;
    private double breadth;

    // Constructor to initialize length and breadth
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Implement the findArea method
    @Override
    public void findArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Implement the Circle class
class Circle implements Shape {
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement the findArea method
    @Override
    public void findArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Main class to test the implementation
public class FindArea {
    public static void main(String[] args) {
        // Create instances of Rectangle and Circle
        Shape rectangle = new Rectangle(5, 3);
        Shape circle = new Circle(4);

        // Call the findArea method
        rectangle.findArea();
        circle.findArea();
    }
}
