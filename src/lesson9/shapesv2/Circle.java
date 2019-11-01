package lesson9.shapesv2;

import TurtleGraphics.Pen;
import java.awt.Color;

public class Circle extends Shape
{
    protected double radius;

    public Circle(double x, double y, double r)
    {
        super(x, y);
        radius = r;
    }
    
    public Circle(){
        super();
        radius = 10;
    }

    @Override
    public double area()
    {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw(Pen p)
    {
        double side = ( 2 * Math.PI * radius ) / 120;
        p.up();
        p.move(xPos, yPos);
        p.setDirection(0);
        p.move(radius);
        p.down();
        p.turn(90);
        for (int x = 0; x < 120; x++)
        {
            p.move(side);
            p.turn(3);
        }
    }

    @Override
    public void stretchBy(double factor)
    {
        radius *= factor;
    }
    
    @Override
    public void getPerimeter(){
        
    }
    

    @Override
    public String toString()
    {
        String str = "Circle\n======";
        str += "\nRadius: " + radius;
        str += super.toString();
        return str;
    }
}