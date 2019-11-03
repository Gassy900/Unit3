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
         return Math.abs((xPos*y2-x2*yPos)+(x2*y3-x3*y2)+(x3*yPos-xPos*y3))/2;
    }

    @Override
    void draw(Pen p) {
        p.up();
        p.move(xPos, yPos);
        p.down();
        p.move(x2, y2);
        p.move(x3, y3);
        p.move(xPos, yPos);
    }

    @Override
    void stretchBy(double factor) {
        x2 = (x2-xPos) * factor + xPos;
        y2 = (y2-yPos) * factor + yPos;
        xPos = (xPos-x2) * factor + x2;
        yPos = (yPos-y2) * factor + y2;
        
    }

    @Override
    void getPerimeter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void move(double xloc, double yloc) {
        double x = xloc - xPos;
        double y = yloc - yPos;

        xPos = xloc;
        yPos = yloc;

        x2 += x;
        y2 += y;
        x3 += x;
        y3 += y;

    }

}
