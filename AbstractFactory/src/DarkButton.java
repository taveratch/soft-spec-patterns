import javax.swing.*;
import java.awt.*;

/**
 * Created by TAWEESOFT on 4/21/16 AD.
 */
public class DarkButton extends JButton {

    public DarkButton(String text) {
        super(text);
    }

    public void paint(Graphics g){
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0 , 0 , getWidth() , getHeight());
        super.paint(g);
    }
}
