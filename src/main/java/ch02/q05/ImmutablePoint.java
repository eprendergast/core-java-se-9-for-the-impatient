package ch02.q05;

public class ImmutablePoint {

    public static void main (String[] args) {
        ImmutablePoint point = new ImmutablePoint(3,4).translate(1,3).scale(0.5);
        System.out.println(point.x);
        System.out.println(point.y);
    }

    private double x;
    private double y;

    public ImmutablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public ImmutablePoint() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public ImmutablePoint translate(double x, double y) {
        return new ImmutablePoint(this.x += x, this.y += y);
    }

    public ImmutablePoint scale(double factor) {
        return new ImmutablePoint(this.x *= factor, this.y *= factor);
    }
}
