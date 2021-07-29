package edu.pdx.cs410J.PAC;

public class Ghost extends Entity{
    public Boolean alive;
    public final char render = 'O';

    public Ghost(int x, int y){
        super(x,y);
        this.alive = true;
    }

    public Boolean isAlive(){
        if(alive)
            return true;
        else
            return false;
    }
    public void followPac(){

    }

}
