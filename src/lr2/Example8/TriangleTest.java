package lr2.Example8;

public class TriangleTest extends Triangle{
    public TriangleTest(double side1, double side2, double side3) {
        super(side1, side2, side3);
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 9, 7);
        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
    }
}
