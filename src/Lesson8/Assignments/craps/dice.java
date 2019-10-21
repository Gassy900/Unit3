package Lesson8.Assignments.craps;


import java.awt.Color;
import java.awt.Graphics;

public class dice {

    private int value;
    private Graphics g;
    private Color c, dc;
    private int size, dotsize;
    private int pos1,pos2,pos3;

    public dice() {
        value = (int) (Math.random() * 6 + 1);
        g = null;
        c = null;
    }

    public dice(Graphics pg, int s) {
        value = (int) (Math.random() * 6 + 1);
        g = pg;
        c = Color.white;
        dc = Color.black;
        size = s;
        dotsize = (int)(0.167 * size);
        pos1 = (int)(.2 * size);
        pos2 = (int)(.4 * size);
        pos3 = (int)(.6 * size);
                
    }
    
    public void setColor(Color newc, Color newdc){
        c=newc;
        dc=newdc;
    }

    public void roll() {
        value = (int) (Math.random() * 6 + 1);
    }

    public int getValue() {
        return value;
    }

    public void draw() {
        if (g == null) {
            return;
        }
        g.setColor(c);
        g.fillRoundRect(dotsize, dotsize, (int)(.67 * size), (int)(.67 *  size), 20, 20);

        g.setColor(dc);
        if (value==1){
        draw4();
        } else if(value==2){
        draw1();
        draw7();
        } else if (value==3){
        draw1();
        draw4();
        draw7();
        } else if(value==4){
        draw1();
        draw2();
        draw6();
        draw7();
        
        } else if(value==5){
        draw1();
        draw2();
        draw4();
        draw6();
        draw7();
        }
        else if(value ==6){
        draw1();
        draw2();
        draw3();
        draw5();
        draw6();
        draw7();
        
        }
    }
    
    private void draw1(){
    g.fillOval(pos1, pos1, dotsize, dotsize);
    }
    private void draw2(){
    g.fillOval(pos3, pos1, dotsize, dotsize);
    }
    
    private void draw3(){
    g.fillOval(pos1, pos2, dotsize, dotsize);
    }
    
    private void draw4(){
    g.fillOval(pos2, pos2, dotsize, dotsize);
    }
    
    private void draw5(){
    g.fillOval(pos3, pos2, dotsize, dotsize);
    }
    
    private void draw6(){
    g.fillOval(pos1, pos3, dotsize, dotsize);
    }
    
    private void draw7(){
    g.fillOval(pos3, pos3, dotsize, dotsize);
    }
   
}
