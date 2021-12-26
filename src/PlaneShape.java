

public abstract class PlaneShape extends Shape {

    public PlaneShape(Point[] verticles) {
        super(verticles);
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
