package Game;
import java.awt.*;

public class GameTile {

    private int row;
    private int col;
    private int tileSize;

    public GameTile(int row, int col) {

        this.row = row;
        this.col = col;
        this.tileSize = 100;
    }

    public void render(Graphics g) {

        //дъската
        int tileX = this.col * this.tileSize;
        int tileY = this.row * this.tileSize;

        //чертаене на дъската
        if ((this.row == 0 && this.col == 0) || (this.row == 0 && this.col == 4) || (this.row == 4 && this.col == 1) || (this.row == 4 && this.col == 3)) {
            g.setColor(Color.RED);
        } else if ((this.row == 4 && this.col == 0) || (this.row == 4 && this.col == 4) || (this.row == 0 && this.col == 1) || (this.row == 0 && this.col == 3)) {
            g.setColor(Color.BLACK);
        } else if ((this.row == 1 && this.col == 0) || (this.row == 1 && this.col == 1) || (this.row == 1 && this.col == 3) || (this.row == 1 && this.col == 4) ||
                (this.row == 3 && this.col == 0) || (this.row == 3 && this.col == 1) || (this.row == 3 && this.col == 3) || (this.row == 3 && this.col == 4)) {
            g.setColor(Color.GRAY);
        } else {
            g.setColor(Color.WHITE);
        }
        g.fillRect(tileX, tileY, this.tileSize, this.tileSize);


        //сивата точка в средата
        g.setColor(Color.GRAY);
        g.fillOval(220, 220, 50, 50);
    }
}