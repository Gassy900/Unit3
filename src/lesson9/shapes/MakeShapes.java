
package lesson9.shapes;

import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;

public class MakeShapes {


    public static void main(String[] args) {
       Circle c = new Circle(50,50,100);
       Shape c1 = new Circle(50,50,100);
       Rect r = new Rect(100,100,150,50);
       Shape r1 = new Rect(100,100,150,50);
       
       wheels w = new wheels(10,10,30,6);
       
       
       Shape shapes[] = new Shape[10];
        for (int i = 0; i < 10; i++) {
            shapes[i] = i % 2==0? new Circle(10,10,10) : new Rect(10,10,10,10);
            System.out.println(""+c.area());
        }
            
            Shape silly = new Circle(0,0,0);
            silly = new Rect(50,50,200,100);
            
            Pen p = new StandardPen(new SketchPadWindow(640,480));
            silly.draw(p);
            silly = new Circle(0,0,100);
            silly.draw(p);
            System.out.println(silly);
            w.draw(p);
        }
    }
    

