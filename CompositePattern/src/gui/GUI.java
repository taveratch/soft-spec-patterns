package gui;


import composite.Car;
import composite.CarWithSpoiler;
import shapes.Shape;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by TAWEESOFT on 4/28/16 AD.
 */
public class GUI extends JFrame {

    List<Shape> shapes = new ArrayList<Shape>();
    public GUI() {
        shapes.add(new Car(200,200,Color.red));
        shapes.add(new CarWithSpoiler(100,100,Color.pink));
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void paint(Graphics g) {
        super.paint(g);
        if(shapes != null) {
            for(Shape c : shapes) {
                c.paint(g);
            }
        }
    }

    public static void main(String[] ar) {
        GUI gui = new GUI();
        gui.setVisible(true);
    }
}
