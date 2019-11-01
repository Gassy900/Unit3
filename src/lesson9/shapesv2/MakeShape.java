package lesson9.shapesv2;

import TurtleGraphics.*;
import java.util.Scanner;

public class MakeShape {

    public static void main(String[] args) {
        Pen p = new StandardPen(new SketchPadWindow(800, 600));

        Shape s;
        Circle c;
        Wheel w;

        s = new Rect(10, 10, 10, 10);
        s = new Wheel(10, 10, 10, 10);
        c = new Circle(10, 10, 10);
        c = new Wheel(10, 10, 10, 10);
        w = new Wheel(10, 10, 10, 10);

        Shape actual = new Rect(0, 0, 200, 100);
        actual.draw(p);
        Scanner scan = new Scanner(System.in);
        System.out.println("Press any key to make it a circle");
        scan.nextLine();
        actual.erase(p);
        actual = makeShapeFromAnother(actual, 'c');
        actual.draw(p);

        System.out.println("Press any key to make it a Wheel");
        scan.nextLine();
        actual.erase(p);
        actual = makeShapeFromAnother(actual, 'w');
        actual.draw(p);

    }

    public static Shape makeShapeFromAnother(Shape s, char type) {
        double x = s.getXPos();
        double y = s.getYPos();
        double area = s.area();

        if (type == 'r') {
            double width = Math.sqrt(area);
            double height = Math.sqrt(area);
            return new Rect(x, y, width, height);
        } else if (type == 'c') {
            double radius = Math.sqrt(area / Math.PI);
            return new Circle(x, y, radius);
        } else {
            double radius = Math.sqrt(area / Math.PI);
            return new Wheel(x, y, radius, 6);
        }
    }
}
