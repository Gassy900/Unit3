package lesson9.shapes;

import TurtleGraphics.Pen;

public class Circle implements Shape {

    
    protected double xPos, yPos;
    protected double radius;
    
    public Circle(double x, double y, double r){
    xPos=x;
    yPos=y;
    radius = r;
    }
    
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw(Pen p) {
        double side = (2  * Math.PI * radius) / 120;
        p.up();
        p.setDirection(90);
        p.move(xPos + radius, yPos - side /2.0);
        p.down();
        p.turn(90);
        for (int i = 0; i < 120; i++) {
            p.move(side);
            p.turn(3);
        }
    }

    @Override
    public double getXPos() {
        return xPos;
    }

    @Override
    public double getYpos() {
        return yPos;
    }

    @Override
    public void move(double xLoc, double yLoc) {
        xPos = xLoc;
        yPos= yLoc;
    }

    @Override
    public void stretchBy(double factor) {
       radius = radius * factor;
    }
    
    public String toString(){
    String str = "Cirlce \n=========\n";
    str+= "Xpos: " + xPos + " Ypos:" + yPos;
    str+="\n Radius "+radius;
    str+="\nArea: "+ area();
    return str;
    }
    
}
