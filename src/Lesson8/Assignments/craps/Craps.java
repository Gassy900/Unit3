package Lesson8.Assignments.craps;

import java.awt.Color;
import java.awt.Graphics;

public class Craps {

    private dice dice1, dice2;
    private int rollnum, point, total, newnum;
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
        total = dice1.getValue() + dice2.getValue();
        if (rollnum == 1) {
            point = getTotal();
        }
        dice1.draw();
        dice2.draw();
    }

    public int getTotal() {
        return total;
    }

    public boolean isNewGame() {
        return newGame;
    }

    public int getPoint() {
        return point;
    }

    public boolean hasWon() {
        if (rollnum == 1) {
            newnum = total;
            if (total == 7) {
                return true;
            } else if (total == 11) {
                return true;
            } else {
                return false;
            }
        } else {
            if (total == newnum) {
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean hasLost() {
        if (rollnum == 1) {
            if (total == 2) {
                return true;
            } else if (total == 3) {
                return true;
            } else if (total == 12) {
                return true;
            } else {
                return false;
            }
        } else {
            if (total == 7) {
                return true;
            } else {
                return false;
            }
        }
    }
}
