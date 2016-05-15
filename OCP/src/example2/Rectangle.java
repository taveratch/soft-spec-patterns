package example2;

/**
 * Created by TAWEESOFT on 4/21/16 AD.
 */
public class Rectangle implements Shape{
    private int width, height;

    public Rectangle(int width , int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int getArea() {
        return getWidth() * getHeight();
    }
}
