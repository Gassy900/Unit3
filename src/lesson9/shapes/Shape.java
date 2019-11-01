package lesson9.shapes;

import TurtleGraphics.Pen;
public interface Shape {
    public double area();
    public void draw(Pen p);
    public double getXPos();
    public double getYpos();
    public void move(double xLoc, double Yloc);
    public void stretchBy(double factor);
    public String toString();
}
