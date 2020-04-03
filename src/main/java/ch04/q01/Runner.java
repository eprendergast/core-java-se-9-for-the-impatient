package ch04.q01;

import javax.swing.text.LayeredHighlighter;

public class Runner {

    public static void main(String[] args) {
        Point point = new Point(2.5, 7.5);
        System.out.println("X: " + point.x + ", Y: " + point.y);
        System.out.println("X: " + point.getX() + ", Y: " + point.getY());
        System.out.println(point.toString());

        LabeledPoint labeledPoint = new LabeledPoint("Labeled Point", 2.5, 7.5);
        System.out.println("X: " + labeledPoint.x + ", Y: " + labeledPoint.y);
        System.out.println("X: " + labeledPoint.getX() + ", Y: " + labeledPoint.getY());
        System.out.println(labeledPoint.toString());
    }

}
