public class Main {
    public static void main(String[] args) {
        Point[] point1 = new Point[1];
        point1[0] = new Point(4, 5);// масив, що містить одну вершину, належитиме всім фігурам,де використовують за умовою одну вершину
        Circle circle = new Circle(point1, 4);
        circle.getArea();
        circle.getPerimeter();
        Point[] pointThree = new Point[3];// масив з трьох вершин, використовується для трикутника
        pointThree[0] = new Point(2, 3);
        pointThree[1] = new Point(-1, 0);
        pointThree[2] = new Point(-5, 6);
        Triangle triangle = new Triangle(pointThree);
        triangle.getPerimeter();
        triangle.getArea();
        Point[] pointOfRectangle = new Point[1];
        pointOfRectangle[0] = new Point(1, 2);
        Rectangle rectangle = new Rectangle(pointOfRectangle, 4, 6);
        rectangle.getArea();
        rectangle.getPerimeter();
        SquarePyramid squarePyramid = new SquarePyramid(point1, 4, 6);
        squarePyramid.getArea();
        squarePyramid.getVolume();
        Cuboid cuboid = new Cuboid(point1, 6, 7, 8);
        cuboid.getArea();
        cuboid.getVolume();
        Sphere sphere = new Sphere(point1, 6);
        sphere.getArea();
        sphere.getVolume();
        Shape[] figures = new Shape[6];
        figures[0] = triangle;
        figures[1] = circle;
        figures[2] = rectangle;
        figures[3] = squarePyramid;
        figures[4] = cuboid;
        figures[5] = sphere;
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i]);
        }

    }
}
