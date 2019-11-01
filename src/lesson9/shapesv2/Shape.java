package lesson9.shapesv2;

import TurtleGraphics.Pen;
import java.awt.Color;

//abstract = can't make direct instance of shape
public abstract class Shape
{
    protected double xPos, yPos;
    
    public Shape(double x, double y)
    {
        xPos = x;
        yPos = y;
    }
    
    public Shape()
    {
        xPos =  0;
        yPos = 0;
    }
    //like interface, children MUST implement it
    abstract double area();
    abstract void draw(Pen p);
    abstract void stretchBy(double factor);
    abstract void getPerimeter();
    
    public double getXPos()
    {
        return xPos;
    }

    public double getYPos()
    {
        return yPos;
    }

    public void move(double xloc, double yloc)
    {
        xPos = xloc;
        yPos = yloc;
    }
    
    public void erase(Pen p)
    {
        p.setColor(Color.white);
        draw(p);
        p.setColor(Color.blue);
    }
    
    
    public String toString()
    {
        String str = "";
        str += "\nxPos: " + xPos;
        str += "\nyPos: " + yPos;
        str += String.format("\nArea: %.2f", area());
        return str;
    }
}