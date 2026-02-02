package ShapeArea;

public class Rectangle extends Shape {
    private int x;
    private int y;

    public Rectangle(int x, int y) {
        this.y = y;
        this.x = x;
    }

    @Override
    public double getArea() {
        return x * y;
    }

    @Override
    public String toString() {
        return "Rectangle | width: " + x + " height: " + y + " | area: " + getArea();

    }
}
