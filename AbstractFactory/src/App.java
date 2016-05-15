import javax.swing.*;
import java.awt.*;

/**
 * Created by TAWEESOFT on 4/21/16 AD.
 */
public class App extends JFrame {
    private String theme = "light";
    public App() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        add(new LightButton("Light"));
        ComponentFactory factory = getFactory(theme);
        add(factory.createJButton("light"));
        pack();
        setVisible(true);
    }

    public static void  main(String []ar ){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                App app = new App();
            }
        });
    }

    public ComponentFactory getFactory(String name) {
        if(name.equalsIgnoreCase("light"))
            return new LightComponentFactory();
        else if(name.equalsIgnoreCase("dark"))
            return new DarkComponentFactory();
        return null;
    }
}
