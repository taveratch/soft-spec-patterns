package example1;

/**
 * Created by TAWEESOFT on 4/21/16 AD.
 */

//1st way , extending
public class BetterEngine extends Engine{

    public BetterEngine(double power) {
        super(power);
    }

    public String getPowerWithUnit() {
        return getPower() + " HP";
    }

}
