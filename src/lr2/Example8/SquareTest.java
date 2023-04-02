package lr2.Example8;

public class SquareTest extends Square{

    public SquareTest(double sideLength){
        super(sideLength);
    }

    public static void main(String[] args) {
        Square square = new Square(10);
        System.out.println("Square area: " + square.calculateArea());
        System.out.println("Square perimeter: " + square.calculatePerimeter());
    }
}
