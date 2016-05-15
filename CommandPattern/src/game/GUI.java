package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by TAWEESOFT on 4/28/16 AD.
 */
public class GUI extends JFrame implements Observer,KeyListener {

    private Game game;
    private JPanel gamePanel;

    public GUI() {
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        game = new Game();
        game.addObserver(this);
        game.startGame();
        gamePanel = new JPanel(){
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                g.setColor(Color.black);
                g.fillOval(game.getPx(), game.getPy(), 30, 30);
                g.setColor(Color.red);
                g.fillOval(game.getEx() , game.getEy(),30,30);
            }
        };
        add(gamePanel);
        addKeyListener(this);
    }

    public static void main(String [] ar) {
        GUI gui = new GUI();
        gui.setVisible(true);
    }

    @Override
    public void update(Observable o, Object arg) {
        gamePanel.repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP :
                game.turnUp();
                break;
            case KeyEvent.VK_DOWN:
                game.turnDown();
                break;
            case KeyEvent.VK_LEFT :
                game.turnLeft();
                break;
            case KeyEvent.VK_RIGHT :
                game.turnRight();
                break;
            case KeyEvent.VK_R :
                game.startReplay();
                break;
            default:
                break;
        }
    }
}
