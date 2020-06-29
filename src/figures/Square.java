package figures;

import points.Point;

import java.util.Arrays;

public class Square {

    private Point[] points = new Point[4];

    public Square(Point[] points) {
        this.points = points;
    }

    public Square(Point p1, Point p2, Point p3, Point p4){
        this.points[0] = p1;
        this.points[1] = p2;
        this.points[2] = p3;
        this.points[3] = p4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "points=" + Arrays.toString(points) +
                '}';
    }
}
