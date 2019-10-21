package Lesson8.Assignments.craps;

import java.awt.Color;
import java.awt.Graphics;

public class Craps {

    private dice dice1, dice2;
    private int rollnum, point;
    private boolean newGame;

    Craps(Graphics g1, Graphics g2, int size1, int size2) {
        dice1 = new dice(g1, size1);
        dice2 = new dice(g2, size2);

        dice1.setColor(Color.red, Color.white);
        dice2.setColor(Color.red, Color.white);
        rollnum = 0;
        point = 0;
        newGame = true;
    }

    public void roll() {
        newGame = false;
        rollnum++;
        dice1.roll();
        dice2.roll();
        if (rollnum == 1) {
            point = getTotal();
        }
        dice1.draw();
        dice2.draw();
    }

    public int getTotal() {
        return dice1.getValue() + dice2.getValue();
    }

    public boolean isNewGame() {
        return newGame;
    }

    public int getPoint() {
        return point;
    }
}
