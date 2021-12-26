import java.util.Arrays;

public class Rectangle extends PlaneShape implements PerimeterMeasurable, AreaMeasurable {
    private double width;
    private double height;
    private double perimeter;
    private double area;

    public Rectangle(Point[] verticles, double height, double width) {
        super(verticles);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        perimeter = 2 * (width + height);
        return perimeter;
    }

    @Override
    public double getArea() {
        area = width * height;
        return area;
    }

    @Override
    public String toString() {
        return "Rectangle{" + Arrays.toString(getVerticles()) + ", width= " + width + ", heiht=" + height + " ," +
                "perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
