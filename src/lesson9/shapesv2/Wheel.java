package lesson9.shapesv2;

import TurtleGraphics.Pen;

public class Wheel extends Circle
{
    private double spokes;
    private double per;
    //wheel has 4 properties
    //it inherits x, y, r, from Circle
    
    public Wheel(double x, double y, double r, double s)
    {
        super(x, y, r); //call the parent calls constructor
        spokes = s;
    }
    
    //all methods from Circle are available to wheel by default
    //some methods -> area, getXPos, getYPos, stretchBy and move are fine as is from Circle
    //others -> draw - are a good start but need to be added on to (extended)
    //toString -> we will override completely
    
    public void draw(Pen p)
    {
        //call the parent version of draw
        super.draw(p);
        
        //draw the spokes
        for (int x = 0; x < spokes; x++)
        {
            p.up();
            p.move(xPos, yPos);
            p.down();
            p.setDirection((x * (360/spokes)) + 90);
            p.move(radius);
        }
    }
    
    //exclusive method only for wheels
    public void setSpokes(int s)
    {
        spokes = s;
    }
    
    public void getPerimeter(){
       per = Math.PI * (radius + radius);
    }
    
    public String toString()
    {
        String str = "Circle\n======";
        str += "\nxPos: " + xPos;
        str += "\nyPos: " + yPos;
        str += "\nRadius: " + radius;
        str += "\nSpokes: " + spokes;
        str += "\nCircumfrence: " + per;
        str += String.format("\nArea: %.2f", area());
        return str;
    }
}