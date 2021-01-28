package Pawns;

import java.awt.*;

public class Leader {

    private int col;
    private int row;

    public Leader(int row, int col){
        this.row =row;
        this.col =col;
    }
    public void render(Graphics g){

        //жълт отбор
        g.setColor(Color.YELLOW);
        //разположението на Leader в дъската
        g.fillRect(425, 35, 50, 50);

        //зелен отбор
        g.setColor(Color.GREEN);
        g.fillRect(25, 425, 50, 50);
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