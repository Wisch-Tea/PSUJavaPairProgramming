package edu.pdx.cs410J.PAC;

/**
 * From kata instructions:
 * pacman is on a grid filled with dots
 * pacman has a direction
 * pacman moves on each tick
 */
public class PacMan extends Entity{
    public enum directions {
        UP,
        DOWN,
        LEFT,
        RIGHT
    };

    public final char renderUp = '<';
    public final char renderDown = '^';
    public final char renderLeft = '>';
    public final char renderRight = '<';

    public directions currentDirection;

    public PacMan(int x, int y) {
        super(x,y);
    }
    public int[] tellGhost(){
        int[] pos = {this.getX(),this.getY()};
        return pos;
    }
    public void changeDirection(directions newDirection) {
        currentDirection = newDirection;
        // change display character
        switch(newDirection)
        {
            case UP: {
                setMarker(renderUp);
                break;
            }
            case DOWN: {
                setMarker(renderDown);
                break;
            }
            case LEFT: {
                setMarker(renderLeft);
                break;
            }
            case RIGHT: {
                setMarker(renderRight);
                break;
            }
        }
    }

    public boolean move(Grid grid) {
        Entity tileToMoveTo = null;
        switch(currentDirection) {
            case UP: {
                tileToMoveTo = grid.getTile(getX(), getY()-1);
                break;
            }
            case DOWN: {
                tileToMoveTo = grid.getTile(getX(), getY()+1);
                break;
            }
            case LEFT: {
                tileToMoveTo = grid.getTile(getX()-1, getY());
                break;
            }
            case RIGHT: {
                tileToMoveTo = grid.getTile(getX()+1, getY());
                break;
            }
        }
        if(tileToMoveTo instanceof Wall) {
            return false;
        } else if(tileToMoveTo instanceof Ghost) {
            // kill
            return false;
        } else {
            setX(tileToMoveTo.getX());
            setY(tileToMoveTo.getY());
            return true;
        }
    }

}
