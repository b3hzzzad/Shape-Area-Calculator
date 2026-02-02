package ShapeArea;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Shape rectangle;
        Shape circle;
        Shape triangle;

        ArrayList<Shape> arrayList = new ArrayList<>();
        ShapeManager shapeManager = new ShapeManager();
        var console = new Console();


        while (true) {
            var userInput = console.getInput("1. Add a Circle\n" +
                    "2. Add a Rectangle\n" +
                    "3. Add a Triangle\n" +
                    "4. List all shapes\n" +
                    "5. Exit");
            switch (userInput) {
                case 1:
                    var userInput_radius = console.getInput("Enter radius: ");
                    circle = new Circle(userInput_radius);
                    shapeManager.addShape(circle);
                    System.out.println("Area is: " + circle.getArea());
                    break;
                case 2:
                    var rectangleX = console.getInput("Enter X: ");
                    var rectangleY = console.getInput("Enter Y: ");
                    rectangle = new Rectangle(rectangleX, rectangleY);
                    shapeManager.addShape(rectangle);
                    System.out.println("Area is: " + rectangle.getArea());
                    break;
                case 3:
                    var triangleBase = console.getInput("Enter Base: ");
                    var triangleHeight = console.getInput("Enter Height: ");
                    triangle = new Triangle(triangleBase, triangleHeight);
                    shapeManager.addShape(triangle);
                    System.out.println("Area is: " + triangle.getArea());
                    break;
                case 4:
                    shapeManager.printAllShapes();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Enter a valid number: ");
            }
        }

    }
}
