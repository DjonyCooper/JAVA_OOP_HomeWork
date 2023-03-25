package Java.OOP_6.srp1;

import Java.OOP_6.srp1.figure.Brush;
import Java.OOP_6.srp1.figure.Point;
import Java.OOP_6.srp1.figure.Square;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);
        Brush brush = new Brush(square);
        System.out.printf("Площадь фигуры: %d \n", square.getArea());
        brush.draw(square);
    }
}
