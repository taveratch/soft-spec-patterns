import java.util.ArrayList;
import java.util.List;

/**
 * Created by TAWEESOFT on 5/12/16 AD.
 */
public class Main {

    public static void main(String[] ar){
        List<Text> l = new ArrayList<Text>();
        int i  = 0;
        byte[] fontStyle = new byte[1024 * 1024];
        while(true) {
            l.add(new Text('X',fontStyle));
            i++;
            System.out.println(i);
        }
    }
}
