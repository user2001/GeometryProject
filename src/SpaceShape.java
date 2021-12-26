public abstract class SpaceShape extends Shape {
    public SpaceShape(Point[] verticles) {
        super(verticles);
    }

    public abstract double getArea();

    public abstract double getVolume();
}

