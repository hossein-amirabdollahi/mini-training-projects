public class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public String toString() {
//        return String.format("Circle: [radius= %s ]", radius);
        return "Circle: [radius= " +radius + " ]";
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        System.out.println(c1);
    }
}

