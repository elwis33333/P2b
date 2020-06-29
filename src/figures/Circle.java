package figures;

import points.Point;

public class Circle {

    private Point p;
    private double r;

    public Circle(Point p, double r) {
        this.p = p;
        this.r = r;
    }

    public double area(){
        return 2*Math.PI*r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "środek = " + p +
                ", promień = " + r +
                ", o powierzchni = " + area() +
                '}';
    }
}
