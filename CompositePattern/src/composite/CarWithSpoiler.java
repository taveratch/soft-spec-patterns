package composite;

import shapes.*;
import shapes.Rectangle;

import java.awt.*;

/**
 * Created by TAWEESOFT on 4/28/16 AD.
 */
public class CarWithSpoiler extends CompositeShape {

    public CarWithSpoiler(int x , int y , Color color) {
        add(new Car(x,y,color));
        add(new Rectangle(x,y-10,10,10,color));
    }
}
