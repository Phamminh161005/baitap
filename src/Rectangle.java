public class Rectangle extends Shape {
    protected double width;   // chiều rộng
    protected double height;  // chiều cao

    public Rectangle(Point centerPoint, double width, double height) {
        super("Rectangle", centerPoint);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle" + "[w=" + width + ", h=" + height + "], center=" + getCenterPoint();
    }
}
