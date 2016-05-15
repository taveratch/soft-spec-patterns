package example2;

import java.util.List;

/**
 * Created by TAWEESOFT on 4/21/16 AD.
 */
public class AreaCalculator {

    public static int calculateArea(Shape[] shapes) {
        int area = 0;
        for(int i =0;i<shapes.length;i++){
            area += shapes[i].getArea();
        }
        return area;
    }

    public static void main(String[] ar){
        Shape[] objs = new Shape[4];
        objs[0] = new Rectangle(3,4);
        objs[1] = new Rectangle(2,5);
        objs[2] = new Rectangle(1,5);
        objs[3] = new Circle(1);
        System.out.println(calculateArea(objs));
    }
}
