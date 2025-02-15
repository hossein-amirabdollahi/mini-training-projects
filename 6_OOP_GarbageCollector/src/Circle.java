public class Circle {
    private double radius;
    public Circle(double r) {
        radius = r;
    }

    public void displayCircleRadius() {
        System.out.println("Circle radius: " + radius);
    }

    public void finalize() throws Throwable {
        System.out.println("Circle finalized");
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.displayCircleRadius();
        System.gc();
    }
}
