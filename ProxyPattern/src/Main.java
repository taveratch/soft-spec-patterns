import javax.swing.*;
import java.awt.*;

/**
 * Created by TAWEESOFT on 5/12/16 AD.
 */
public class Main extends JFrame{

    private JPanel panel;
    private JScrollPane jScrollBar;

    public Main() {
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //components
        panel = new JPanel();
        panel.setBackground(Color.blue);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        jScrollBar = new JScrollPane(panel);
        for (int i =0;i<500;i++) panel.add(new ListItem());
        add(jScrollBar);

    }
    public static void main(String[] ar){
        Main main = new Main();
        main.setVisible(true);
    }

}
