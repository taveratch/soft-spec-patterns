package command;

import game.Player;

/**
 * Created by TAWEESOFT on 4/28/16 AD.
 */
public abstract class Command {
    protected Player player;
    private long timestamp;

    public Command(Player player , long timestamp) {
        this.player = player;
        this.timestamp = timestamp;
    }

    public abstract void execute();

    public long getTimestamp() {
        return timestamp;
    }

    public boolean shouldExecuted(long currentTime){
        return currentTime >= timestamp;
    }
    @Override
    public String toString() {
        return String.format("%d: %s" , timestamp , getClass().toString());
    }
}
