import java.util.ArrayList;
import java.util.List;

/**
 * Created by TAWEESOFT on 5/12/16 AD.
 */
public class FruitSeparator implements Visitor {

    List<Apple> apples = new ArrayList<Apple>();
    List<Orange> oranges = new ArrayList<Orange>();


    public void setApples(List<Apple> apples) {
        this.apples = apples;
    }

    public void setOranges(List<Orange> oranges) {
        this.oranges = oranges;
    }

    public List<Apple> getApples() {
        return apples;
    }

    public List<Orange> getOranges() {
        return oranges;
    }

    @Override
    public void visit(Apple apple) {
        apples.add(apple);
    }

    @Override
    public void visit(Orange orange) {
        oranges.add(orange);
    }
}
