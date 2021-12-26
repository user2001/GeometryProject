import java.util.Arrays;

public class Circle extends PlaneShape implements PerimeterMeasurable, AreaMeasurable {
    private double perimeter;
    private double area;
    private double radius;

    public Circle(Point[] verticles, double radius) {
        super(verticles);
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    @Override
    public double getArea() {

        area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public String toString() {
        return "Circle{" + Arrays.toString(getVerticles()) + "," + radius + " /" +
                "perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
