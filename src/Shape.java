public class Shape {
    private Point[] verticles;

    public Shape(Point[] verticles) {
        this.verticles = verticles;
    }

    public Point[] getVerticles() {
        return verticles;
    }

    public void setVerticles(Point[] verticles) {
        this.verticles = verticles;
    }

    public double distance(Point a, Point b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }
}

