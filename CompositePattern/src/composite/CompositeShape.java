package composite;

import shapes.Shape;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by TAWEESOFT on 4/28/16 AD.
 */
public class CompositeShape extends Shape {

    private List<Shape> children =  new ArrayList<Shape>();

    public void add(Shape shape) {
        children.add(shape);
    }

    public void remove(Shape shape) {
        children.remove(shape);
    }

    @Override
    public void paint(Graphics g) {
        for(Shape shape : children){
            shape.paint(g);
        }
    }
}
