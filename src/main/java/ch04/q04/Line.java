package ch04.q04;

import ch04.q01.Point;

public class Line extends Shape {

    private Point to;

    public Line(Point from, Point to) {
        super(from);
        this.to = to;
    }

    public Point getFrom() {
        return this.point;
    }

    public Point getTo() {
        return this.to;
    }

    @Override
    public Point getCenter() {
        return null;
    }

    public double getLineLength() {
        return Math.sqrt(Math.pow(this.getHorizontalWidth(), 2) + Math.pow((this.getVerticalHeight()), 2) );
    }

    private double getHorizontalWidth() {
        return this.getTo().getX() - this.getFrom().getX();
    }

    private double getVerticalHeight() {
        return this.getTo().getY() - this.getFrom().getY();
    }


}
