package game;

/**
 * Created by TAWEESOFT on 4/28/16 AD.
 */
public class Player {

    private int px,py,vx,vy;

    private final int SPEED = 5;

    public Player() {
        reset();
    }
    public void reset() {
        px = 200;
        py = 200;
        vx = 0;
        vy = -SPEED;
    }

    public void move() {
        px += vx;
        py += vy;
    }

    public void up() {
        vx = 0;
        vy = -SPEED;
    }

    public void down() {
        vx = 0;
        vy = SPEED;
    }

    public void left() {
        vx = -SPEED;
        vy = 0;
    }

    public void right() {
        vx = SPEED;
        vy = 0;
    }

    public int getPx() {
        return px;
    }

    public int getPy() {
        return py;
    }
}
