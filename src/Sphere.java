import java.util.Arrays;

public class Sphere extends SpaceShape implements AreaMeasurable, VolumeMeasurable {
    private double radius;
    private double area;
    private double volume;

    public Sphere(Point[] verticles, double radius) {
        super(verticles);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        area = 4 * Math.PI * radius * radius;
        return area;
    }

    @Override
    public double getVolume() {
        volume = Math.PI * Math.pow(radius, 3) * 4 / 3;
        return volume;
    }

    @Override
    public String toString() {
        return "Sphere{" + Arrays.toString(getVerticles()) + ",radius=" + radius + ", " +
                "area=" + area +
                ", volume=" + volume +
                '}';
    }
}
