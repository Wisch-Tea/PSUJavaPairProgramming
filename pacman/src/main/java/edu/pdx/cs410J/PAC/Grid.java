package edu.pdx.cs410J.PAC;
import java.util.ArrayList;

public class Grid {

    //For grid dimiensionality
    private int gridWidth;
    private int gridHeight;
    private final Entity [][] grid;

    //Character and ghosts
    private PacMan pacman;
    private Ghost [] ghost;

    public Grid(int width, int height) {
        gridWidth = width;
        gridHeight = height;

        grid = new Entity[gridHeight][gridWidth];
        for (int i = 0; i < gridHeight; i++) {
            for (int j = 0; j < gridWidth; j++) {

                //How are we representing dots/empty?
                grid[i][j].setMarker(' '); ' ';
            }
        }

        //Top walls
        for (int i = 0; i < gridWidth; i++) {
            grid[0][i] = new Wall(0, i, '-');
        }

        //Bottom walls
        for (int i = 0; i < gridWidth; i++) {
            grid[gridHeight - 1][i] = new Wall(0, i, '-');
        }

        //Left walls
        for (int i = 0; i < gridWidth; i++) {
            grid[i][0] = new Wall(0, i, '|');
        }

        //Right walls
        for (int i = 0; i < gridWidth; i++) {
            grid[i][gridWidth - 1] = new Wall(0, i, '|');
        }
    }


    public char getTile(int x, int y) {
        Entity temp = grid[x][y];
        return temp.getMarker();
    }

}
