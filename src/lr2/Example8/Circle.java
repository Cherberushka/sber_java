package lr2.Example8;

// Класс круга
public class Circle implements Shape {
    private double radius;

    // Конструктор, позволяющий создавать объекты класса Circle, используя значения радиуса
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
