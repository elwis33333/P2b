package house;

public class Room {

    private double height; //metry
    private double width;
    private double length;

    public Room() {
        this.height = 2;
        this.width = 3;
        this.length = 5;
    }

    public Room(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getCeilingArea() {
        return width * length;
    }

    public double getFloorArea() {
        return getCeilingArea();
    }

    public double getWalsArea() {
        return 2 * height * width + 2 * height * length;
    }

    public double getVolume() {
        return height * width * length;
    }

    @Override
    public String toString() {
        return "Pokój o wymiarach: szerokość: " + width +
                ", długość: " + length +
                ", wysokość: " +height;
    }
}
