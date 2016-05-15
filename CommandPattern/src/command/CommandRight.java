package command;

import game.Player;

/**
 * Created by TAWEESOFT on 4/28/16 AD.
 */
public class CommandRight extends Command {

    public CommandRight(Player player, long timestamp) {
        super(player, timestamp);
    }

    @Override
    public void execute() {
        player.right();
    }
}
