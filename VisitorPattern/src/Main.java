import java.util.ArrayList;
import java.util.List;

/**
 * Created by TAWEESOFT on 5/12/16 AD.
 */
public class Main {
    public static void main(String[] ar){
        List<Fruit> fruits = new ArrayList<Fruit>();
        fruits.add(new Apple());
        fruits.add(new Orange());
        fruits.add(new Orange());
        fruits.add(new Apple());
        fruits.add(new Apple());


        FruitSeparator separator = new FruitSeparator();
        for (Fruit f : fruits) {
            f.accept(separator);
        }

        System.out.println("Apples: " + separator.getApples().size());
        System.out.println("Oranges: " + separator.getOranges().size());
    }
}
