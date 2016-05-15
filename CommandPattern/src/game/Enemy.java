package game;

/**
 * Created by TAWEESOFT on 4/28/16 AD.
 */
public class Enemy {
    private int px , py;

    public Enemy() {
        px = 100;
        py = 100;
    }

    public boolean hitPlayer(Player player) {
        int dx = player.getPx() - px;
        int dy = player.getPy() - py;
        double distance = Math.sqrt(dx*dx + dy *dy);
        return distance < 30;
    }

    public int getPx() {
        return px;
    }

    public int getPy() {
        return py;
    }
}
