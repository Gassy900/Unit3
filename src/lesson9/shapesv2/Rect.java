package lesson9.shapesv2;

import TurtleGraphics.Pen;
import java.awt.Color;

public class Rect extends Shape
{
    private double width, height;

    public Rect(double x, double y, double w, double h)
    {
        super(x, y);
        width = w;
        height = h;
    }
    
    public Rect(){
        super();
        width=10;
        height = 10;
    }

    @Override
    public double area()
    {
        return width * height;
    }

    @Override
    public void draw(Pen p)
    {
        p.up();
        p.move(xPos, yPos);
        p.down();
        p.move(xPos + width, yPos);
        p.move(xPos + width, yPos - height);
        p.move(xPos, yPos - height);
        p.move(xPos, yPos);
    }

    @Override
    public void stretchBy(double factor)
    {
        width *= factor;
        height *= factor;
    }
    
    public void getPerimeter(){
        double per;
        per = (width + height) + (width + height);
    }

    @Override
    public String toString()
    {
        String str = "Rectangle\n=========";
        str += "\nWidth: " + width;
        str += "\nHeight: " + height;
        str += super.toString();
        return str;
    }
}