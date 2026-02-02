package ShapeArea;

public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle | radius: " + radius + " | area: " + getArea();

    }
}
