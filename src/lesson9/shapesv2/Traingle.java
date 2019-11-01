package lesson9.shapesv2;

import TurtleGraphics.Pen;

public class Traingle extends Shape { //{extends Shape {

    protected double x2, y2, x3, y3;

    public Traingle(double x, double y, double x22, double y22, double x33, double y33) {
        super(x, y);
        x2 = x22;
        y2 = y22;
        x3 = x33;
        y3 = y33;

    }

    @Override
    double area() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void draw(Pen p) {
        p.up();
        p.move(xPos, yPos);
        p.down();
        p.move(x2, y2);
        p.move(x3, y3);
        p.move(xPos,yPos);
    }

    @Override
    void stretchBy(double factor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
