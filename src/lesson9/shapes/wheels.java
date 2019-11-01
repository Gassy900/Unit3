
package lesson9.shapes;

import TurtleGraphics.Pen;

public class wheels extends Circle{
    
    private double spokes;
    
    
    public wheels(double x, double y, double r,double s) {
        super(x, y, r);
        spokes = s;
    }
    
    public void draw(Pen p){
        super.draw(p);
        
        for (int i = 1; i <= spokes; i++) {
            p.up();
            p.move(xPos,yPos);
            p.down();
            p.setDirection(i * (360/spokes));
            p.move(radius);
        }
    }
    
}
