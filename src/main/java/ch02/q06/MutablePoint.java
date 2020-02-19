package ch02.q06;

public class MutablePoint {

    public static void main (String[] args) {
        MutablePoint point = new MutablePoint(3,4).translate(1,3).scale(0.5);
        System.out.println(point.x);
        System.out.println(point.y);
    }

    private double x;
    private double y;

    public MutablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public MutablePoint() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public MutablePoint translate(double x, double y) {
        this.x += x;
        this.y += y;
        return this;
    }

    public MutablePoint scale(double factor) {
        this.x *= factor;
        this.y *= factor;
        return this;
    }
}
