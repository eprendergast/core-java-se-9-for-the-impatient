package ch04.q04;

import ch04.q01.Point;

public abstract class Shape {

    Point point;

    public Shape(Point point) {
        this.point = point;
    }

    public void moveBy(double dx, double dy) {
        this.point.setX(point.getX() + dx);
        this.point.setY(point.getY() + dy);
    };

    public abstract Point getCenter();

}
