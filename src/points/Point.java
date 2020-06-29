package points;

import java.util.Objects;

public class Point {

    //Pola - właściwości
    private int x;
    private int y;

    private static int number = 0;
    public final int serialNumber;

    public static final int MAX_NUM_POINTS = 100; //stała

    //Konstruktory
    public Point(){
        x = 0;
        y = 0;
        number++;
        serialNumber = number;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
        number++;
        serialNumber = number;
    }

    public Point(int w){
        this.x = this.y = w;
        number++;
        serialNumber = number;
    }

    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
        number++;
        serialNumber = number;
    }

    //Metody - funkcjonalność

    public static int getNumber() {
        return number;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setXY(Point p){
        this.x = p.x;
        this.y = p.y;
    }

    public Point createPoint(){
        return new Point(this);
    }

    public void printXY(){
        System.out.println("Wsp. punktu: x = " + x + ", y = " + y);
    }

    public void add(Point p){
        this.x += p.x;
        this.y += p.y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return getX() == point.getX() &&
                getY() == point.getY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY());
    }
}
