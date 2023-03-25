package Java.OOP_6.ocp1;

import Java.OOP_6.ocp1.shape.Shape;
import Java.OOP_6.ocp1.shape.impl.RightTriangle;
import Java.OOP_6.ocp1.shape.impl.Square;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new RightTriangle(2, 3));
        shapes.add(new Square(4));
        double sumArea = 0;
        for (Shape shape : shapes) {
            sumArea += shape.getArea();
        }

        System.out.printf("Сумма площадей фигур равна %f \n", sumArea);
    }
}
