import java.util.Arrays;

public class Cuboid extends SpaceShape implements VolumeMeasurable, AreaMeasurable {
    private double height;
    private double weight;
    private double depth;
    private double area;
    private double volume;

    public Cuboid(Point[] verticles, double height, double weight, double depth) {
        super(verticles);
        this.depth = depth;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public double getArea() {
        area = 2 * (weight * depth + weight * height + depth * height);
        return area;
    }

    @Override
    public double getVolume() {
        volume = height * weight * depth;
        return volume;
    }

    @Override
    public String toString() {
        return "Cuboid{" + Arrays.toString(getVerticles()) + ",height=" + height + ",weight=" + weight + ",depth =" + depth + " ," +
                "area=" + area +
                ", volume=" + volume +
                '}';
    }
}
