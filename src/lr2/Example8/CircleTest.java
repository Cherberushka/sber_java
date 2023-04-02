package lr2.Example8;

public class CircleTest extends Circle{

    public CircleTest(double radius) {
        super(radius);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());
    }
}
