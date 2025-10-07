public class Circle extends Shape{
    private final double radius;

    public Circle(Point centerPoint, double radius) {
        super("Circle", centerPoint);
        this.radius = radius;
    }

    public double getRadius() { return radius; }


    @Override
    public String toString() {
        return "Circle[r=" + radius + "], center=" + getCenterPoint();
    }
}
