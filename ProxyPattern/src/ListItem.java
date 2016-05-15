import javax.swing.*;
import java.awt.*;

/**
 * Created by TAWEESOFT on 5/12/16 AD.
 */
public class ListItem extends JComponent{

    private ProxyText text;

    public ListItem() {
        setPreferredSize(new Dimension(200,25));
        text = new ProxyText();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        System.out.println("XXX");
        g.setColor(Color.white);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.black);
        g.drawString(text.getText() , 25,25);
    }
}
