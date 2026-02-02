package ShapeArea;

import java.util.ArrayList;

public class ShapeManager {
    private ArrayList<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void printAllShapes() {
        System.out.println("Shapes in the system:");
        System.out.println("---------------------");

        for (Shape s : shapes) {
            System.out.println(s);
        }
    }

}
