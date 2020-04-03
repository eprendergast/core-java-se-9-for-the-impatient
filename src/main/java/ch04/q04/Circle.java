package ch04.q04;

import ch04.q01.Point;

public class Circle extends Shape {

    double radius;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return this.point;
    }
}
