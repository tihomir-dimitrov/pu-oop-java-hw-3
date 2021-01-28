package Pawns;

import java.awt.*;

public class Guard {

    private int row;
    private int col;

    public Guard(int row, int col) {
        this.row = row;
        this.col = col;
    }

    //жълт отбор
    public void render(Graphics g) {
        g.setColor(Color.YELLOW);
        //разположението на Guard в дъската
        g.fillOval(25,35,50,50);
        g.fillOval(125,35,50,50);
        g.fillOval(225,35,50,50);
        g.fillOval(325,35,50,50);

        //зелен отбор
        g.setColor(Color.GREEN);
        g.fillOval(125,425,50,50);
        g.fillOval(225,425,50,50);
        g.fillOval(325,425,50,50);
        g.fillOval(425,425,50,50);
    }
    /*
    @Override
    public boolean isMoveValid(int moveRow, int moveCol) {
        return false;
    }

    public void move(int row, int col) {
        this.row = row;
        this.col = col;
    }
     */
}
