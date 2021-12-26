import java.util.Arrays;

public class Triangle extends PlaneShape implements PerimeterMeasurable, AreaMeasurable {
    private double perimeter;
    private double area;

    public Triangle(Point[] verticles) {
        super(verticles);
    }


    @Override
    public double getPerimeter() {
        perimeter = 0;
        perimeter += distance(getVerticles()[0], getVerticles()[1]);
        perimeter += distance(getVerticles()[1], getVerticles()[2]);
        perimeter += distance(getVerticles()[0], getVerticles()[2]);
        return perimeter;
    }

    @Override
    public double getArea() {
        double p = perimeter / 2;
        area = Math.sqrt(p * (p - distance(getVerticles()[0], getVerticles()[1])) * (p - distance(getVerticles()[1], getVerticles()[2])) * (p - distance(getVerticles()[0], getVerticles()[2])));
        return area;
    }

    @Override
    public String toString() {
        return "Triangle{" + Arrays.toString(getVerticles()) + " " +
                "perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
