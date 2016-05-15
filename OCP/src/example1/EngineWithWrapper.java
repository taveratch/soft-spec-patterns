package example1;

/**
 * Created by TAWEESOFT on 4/21/16 AD.
 */

// 2nd way , creating a wrapper.
public class EngineWithWrapper {
    private Engine engine;

    public EngineWithWrapper(Engine e) {
        this.engine = e;
    }

    public String getPowerWithUnit() {
        return engine.getPower() + " HP";
    }

}
