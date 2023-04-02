package lr2.Example8;

// Triangle class implementing the Shape interface
public class Triangle implements Shape {
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    // Конструктор, позволяющий создавать объекты класса Triangle, используя значения длин 3 сторон
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        double p = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        return area;
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
