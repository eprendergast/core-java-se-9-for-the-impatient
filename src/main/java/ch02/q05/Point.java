package ch02.q05;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate(double x, double y) {
        return new Point(this.x += x, this.y += y);
    }

    public Point scale(double factor) {
        return new Point(this.x *= factor, this.y *= factor);
    }


    // translate() as mutator method
//    public void translate(double x, double y) {
//        this.x += x;
//        this.y += y;
//    }

    // scale() as mutator method
//    public void scale(double factor) {
//        this.x *= factor;
//        this.y *= factor;
//    }

    public static void main (String[] args) {

//        Point point = new Point(3,4);
//        point.translate(1,3);
//        point.scale(0.5);

        Point point = new Point(3,4).translate(1,3).scale(0.5);

        System.out.println(point.x);
        System.out.println(point.y);

    }

}
