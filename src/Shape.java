import java.text.DecimalFormat;

public abstract class Shape {
    private static int shapeCount = 0;

    private String name;
    private Point centerPoint;

    public Shape(String name, Point centerPoint) {
        this.centerPoint = centerPoint;
        shapeCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getShapeCount() {
        return shapeCount;
    }

    public static void setShapeCount(int shapeCount) {
        Shape.shapeCount = shapeCount;
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    public void setCenterPoint(Point centerPoint) {
        this.centerPoint = centerPoint;
    }


    @Override
    public String toString() {
        return name + " , " + centerPoint;
    }
}
