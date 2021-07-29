package edu.pdx.cs410J.PAC;

import java.util.Scanner;
import java.awt.event.KeyListener;

public class Game {
    public int dotsEaten = 0;
    public int levelsCompleted = 0;
    public int currentLevel = 0;

    private PacMan player;

    private Scanner inputScanner;

    private Grid grid;

    public Game() {
        player = new PacMan(5, 5);
        inputScanner = new Scanner(System.in);
        grid = new Grid(32, 32);


    }

    private void start() {
        while(true) {
            tick();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        }
    }

    private void tick() {
        // todo get input
        player.changeDirection();
        player.move(grid);
    }
}
