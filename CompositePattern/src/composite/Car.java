package composite;

import composite.CompositeShape;
import shapes.*;

import java.awt.*;
import java.awt.Rectangle;

/**
 * Created by TAWEESOFT on 4/28/16 AD.
 */
public class Car extends CompositeShape{

    public Car(int x , int y ,Color color){
        this.x = x;
        this.y = y;
        add(new shapes.Rectangle(x+25, y-30, 80, 30, color));
        add(new shapes.Rectangle(x+0, y, 130, 40, color));
        add(new Circle(x+10, y+20, 40, Color.black));
        add(new Circle(x+80, y+20, 40, Color.black));
    }

}
