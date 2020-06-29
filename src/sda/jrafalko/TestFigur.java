package sda.jrafalko;

import figures.Circle;
import figures.Square;
import points.Point;

public class TestFigur {
    public static void main(String[] args) {

        Point p1 = new Point();
        Point p2 = new Point(1,1);
        Point p3 = new Point(1,0);
        Point p4 = new Point(0,1);

        Square kw1 = new Square(p1, p2, p3, p4);
        System.out.println(kw1);

        Square kw2 = new Square(new Point(3), new Point(9,4),
                new Point(2,8), new Point(8,1));
        System.out.println(kw2);

        Circle kolo1 = new Circle(p3, 6.3);
        Circle kolo2 = new Circle(new Point(4,9), 7.1);

        System.out.println(kolo1);
        System.out.println(kolo2);

        Object[] obj = new Object[4];
        obj[0] = kw1;
        obj[1] = kw2;
        obj[2] = kolo1;
        obj[3] = kolo2;

        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }

        for (int i = 0; i < obj.length; i++) {

            if(obj[i] instanceof Circle) {
                System.out.println("Pole: " + ((Circle) obj[i]).area());
            }
        }

    }
}
