package edu.pdx.cs410J.PAC;

public class Wall extends Entity{
    public Wall(int x, int y, char marker){
        super(x,y);
        this.setMarker(marker);
    }
}
