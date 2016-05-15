package game;

import command.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by TAWEESOFT on 4/28/16 AD.
 */
public class Game extends Observable {

    private Player player;
    private Enemy enemy;
    private boolean running;
    private long startTime;
    private final int DELAY = 20;
    private List<Command> commands;

    public Game() {
        enemy = new Enemy();
        player = new Player();
        running = false;
    }

    public void startGame() {
        commands = new ArrayList<Command>();
        startTime = System.currentTimeMillis();
        player.reset();
        running = true;
        Thread thread = new Thread() {
            @Override
            public void run() {
                super.run();
                while(running) {
                    delay();
                    //game.Game logic
                    player.move();
                    if(enemy.hitPlayer(player)) running = false;
                    // Update observers
                    setChanged();
                    notifyObservers();
                }
            }
        };
        thread.start();
    }

    public void turnUp() {
        Command up = new CommandUp(player,currentTimeInGame());
        storeAndExecute(up);
    }

    public void turnDown() {
        Command down = new CommandDown(player, currentTimeInGame());
        storeAndExecute(down);
    }

    public void turnLeft() {
        Command left = new CommandLeft(player , currentTimeInGame());
        storeAndExecute(left);
    }

    public void turnRight() {
        Command right = new CommandRight(player , currentTimeInGame());
        storeAndExecute(right);
    }

    public int getPx() {
        return player.getPx();
    }

    public int getPy() {
        return player.getPy();
    }

    public int getEx() {
        return enemy.getPx();
    }

    public int getEy() {
        return enemy.getPx();
    }

    public void delay(){

        try {
            Thread.sleep(DELAY);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public long currentTimeInGame() {
        return System.currentTimeMillis() - startTime;
    }

    public void storeAndExecute(Command command) {
        commands.add(command);
        System.out.println(command);
        command.execute();
    }

    public void startReplay() {
        System.out.println("Replay starts");
        final List<Command> replayCommands = new ArrayList<>();
        replayCommands.addAll(commands);

        Thread thread = new Thread() {
            @Override
            public void run() {
                super.run();
                while (!replayCommands.isEmpty()) {
                    Command c = replayCommands.get(0);
                    if (c.shouldExecuted(currentTimeInGame())) {
                        c.execute();
                        replayCommands.remove(0);
                    }
                    delay();
                }
            }
        };
        thread.start();
        startGame();
    }

}
