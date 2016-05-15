import javax.swing.*;

/**
 * Created by TAWEESOFT on 4/21/16 AD.
 */
public class LightComponentFactory implements ComponentFactory{
    @Override
    public JButton createJButton(String msg) {
        return new LightButton(msg);
    }

    @Override
    public JTextField createJTextField() {
        return null;
    }
}
