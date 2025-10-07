public class Square extends Rectangle {
    public Square(Point centerPoint, double side) {
        super(centerPoint, side, side);
        super.height = side;
        super.width = side;
    }

    @Override
    public String toString() {
        return "Square[a=" + width + "],center=" + getCenterPoint();
    }
}
