package lr2.Example8;

// Класс квадрата
public class Square implements Shape {
    private double sideLength;

    // Конструктор, позволяющий создавать объекты класса Square, используя значения длины стороны
    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return Math.pow(sideLength, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 4 * sideLength;
    }
}
