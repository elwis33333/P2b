package sda.jrafalko;

import points.Point;

public class TestPunktow {
    public static void main(String[] args) {

        Point p1 = new Point();
//        p1.x = 4;
//        p1.y = 7;
//        System.out.println("wsp. x = " + p1.x);
//        System.out.println("wsp. y = " + p1.y);

        System.out.println("wsp. x = " + p1.getX());
        System.out.println("wsp. y = " + p1.getY());

        p1.setX(8);
        p1.setY(7);
        System.out.println("wsp. x = " + p1.getX());
        System.out.println("wsp. y = " + p1.getY());

        p1.setXY(12, 34);
        System.out.println("wsp. x = " + p1.getX());
        System.out.println("wsp. y = " + p1.getY());
        p1.printXY();

        Point p2 = new Point();
        p2.setXY(p1);
        p2.printXY();

        Point p3 = new Point(3, 7);
        p3.printXY();
        Point p4 = new Point(100);
        p4.printXY();

        Point p5 = new Point(p4);
        p5.printXY();

        Point p6 = p3.createPoint();
        p6.printXY();

        Point p7;
        p7 = new Point();

        if (p4 == p5) System.out.println("true");
        else System.out.println("false");

        System.out.println("Punkt p4 = " + p4);
        System.out.println("Punkt p5 = " + p5);

        if (p4.equals(p5)) System.out.println("true");
        else System.out.println("false");

        p6.add(p5);
        System.out.println(p6);

        System.out.println("Wszystkich punktów: " + Point.getNumber());

        System.out.println("Nr: " + p5.serialNumber);


    }
}
