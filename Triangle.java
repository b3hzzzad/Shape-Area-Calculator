package ShapeArea;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public String toString() {
        return "Triangle | base: " + base + " height: " + height + " | area: " + getArea();

    }
}
