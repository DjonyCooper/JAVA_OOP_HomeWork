package Java.OOP_6.lsp1.view;

import Java.OOP_6.lsp1.shape.Quadrilaterial;
import Java.OOP_6.lsp1.shape.Rectangle;

public class ShapeView {
    private final Quadrilaterial quadrilaterial;

    public ShapeView(Quadrilaterial quadrilaterial) {
        this.quadrilaterial = quadrilaterial;
    }

    public void showArea() {
        System.out.print("Площадь четырехугольника равна:");
        System.out.println(quadrilaterial.getArea());
    }
}
