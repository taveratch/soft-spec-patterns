package example2;

/**
 * Created by TAWEESOFT on 4/21/16 AD.
 */
public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public int getArea() {
        return (int) Math.PI * getRadius() * getRadius();
    }
}
