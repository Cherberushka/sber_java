package lr2.Example7;

public class Rectangle {
    private double length; // field for the length of the rectangle
    private double width; // field for the width of the rectangle

    // Конструктор, позволяющий создавать объекты класса Rectangle, используя значения длины и ширины
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Метод, позволяющий установить значение поля длины (length)
    public void setLength(double length) {
        this.length = length;
    }

    // Метод, позволяющий установить значение поля ширины (width)
    public void setWidth(double width) {
        this.width = width;
    }

    // Метод, позволяющий получить значение поля длины(length)
    public double getLength() {
        return length;
    }

    // Метод, позволяющий получить значение поля ширины(width)
    public double getWidth() {
        return width;
    }

    // Метод, который вычисляет площадь прямоугольника, используя поля length и width
    public double getArea() {
        return length * width;
    }

    // Метод, который вычисляет периметр прямоугольника, используя поля length и width
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
