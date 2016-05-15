import javax.swing.*;
import java.awt.*;

/**
 * Created by TAWEESOFT on 4/21/16 AD.
 */
public class LightButton extends JButton {

    public LightButton(String text) {
        super(text);
        setForeground(Color.red);
    }

    public void paint(Graphics g){
        g.setColor(Color.pink);
        g.fillRect(0, 0, getWidth(), getHeight());
        super.paint(g);
    }
}
