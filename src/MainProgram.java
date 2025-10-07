import java.sql.SQLOutput;
import java.util.*;

public class MainProgram {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(new Point(0, 0), 4, 6));
        shapes.add(new Square(new Point(2.5, -3), 5));
        shapes.add(new Circle(new Point(-1, 1.2), 3.5));
        shapes.add(new Rectangle(new Point(10, 8), 2.25, 7.75));

        System.out.print("TỔNG SỐ HÌNH ĐÃ KHỞI TẠO: ");
        System.out.println(Shape.getShapeCount());
        System.out.println();

        System.out.println(" DANH SÁCH CHI TIẾT HÌNH: ");
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println((i + 1) + ") " + shapes.get(i));
        }
        System.out.println();

        // 3) Danh sách tâm điểm
        System.out.println(" DANH SÁCH TÂM ĐIỂM: ");
        for (int i = 0; i < shapes.size(); i++) {
            Shape s = shapes.get(i);
            System.out.println((i + 1) + ") " + "center = " + s.getCenterPoint());
        }
    }
}
