package Game;

import Pawns.Guard;
import Pawns.Leader;
import Pawns.Turtles;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GameBoard extends JFrame{
    private ArrayList<Object> Pawns;

    public GameBoard(){

        this.setSize(500,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for(int row = 0; row < 5; row++){
            for(int col = 0; col < 5; col++){

                GameTile tile = new GameTile(row, col);
                tile.render(g);

                Guard p1 = new Guard(row, col);
                p1.render(g);

                Leader l1 = new Leader(row, col);
                l1.render(g);

                Turtles t1 = new Turtles();
               t1.render(g);
            }
        }
    }
}