
import java.util.Arrays;

public class SquarePyramid extends SpaceShape implements AreaMeasurable, VolumeMeasurable {
    private double baseWidth;
    private double baseHeight;
    private double volume;
    private double area;

    public SquarePyramid(Point[] verticles, double baseHeight, double baseWidth) {
        super(verticles);
        this.baseHeight = baseHeight;
        this.baseWidth = baseWidth;
    }

    @Override
    public double getArea() {
        area = Math.sqrt(Math.pow(baseWidth / 2, 2) + Math.pow(baseHeight, 2)) * baseWidth;
        return area;
    }

    @Override
    public double getVolume() {
        volume = baseWidth * baseWidth * baseHeight / 3;
        return volume;
    }

    @Override
    public String toString() {
        return "SquarePyramid{" + Arrays.toString(getVerticles()) + ",baseHeight= " + baseHeight + ", baseWidth=" + baseWidth + ", " +
                "volume=" + volume +
                ", area=" + area +
                '}';
    }
}
