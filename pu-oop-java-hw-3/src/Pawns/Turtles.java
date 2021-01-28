package Pawns;

import java.awt.*;
import java.util.Random;


public class Turtles {

    private int col;
    private int row;

    public void render(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(25, 225, 50, 50);
        g.fillOval(425,225,50,50);
        g.setColor(Color.RED);
        g.drawOval(25, 225, 50, 50);
        g.drawOval(425, 225, 50, 50);
    }

    private void randomPlaceForTurtles() {
        Random rand = new Random();
        int randRow = rand.nextInt();
        int randCol = rand.nextInt();
    }
}

