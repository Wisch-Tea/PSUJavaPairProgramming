package edu.pdx.cs410J.PAC;

public class Entity {

    private char marker;
    private int posX;
    private int posY;
    
    public Entity(int x, int y) {
        //Set initial x and y values
        this.posX = x;
        this.posY = y;
    }

    public void setX(int x) {
        //For updating x position
        this.posX = x;
    }

    public void setY(int y){
        //For updating y position
        this.posY = y;
    }

    public int getX() {
        //For returning ing x position
        return this.posX;
    }

    public int getY(){
        //For returning y position
        return this.posY;
    }

    public void setMarker(char m) {
        marker = m;
    }

    public char getMarker() {
        return marker;
    }

    public void tick(){

    }
}
