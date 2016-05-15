package command;

import game.Player;

/**
 * Created by TAWEESOFT on 4/28/16 AD.
 */
public class CommandUp extends Command{

    public CommandUp(Player player, long timestamp) {
        super(player, timestamp);
    }

    @Override
    public void execute() {
        player.up();
    }
}
