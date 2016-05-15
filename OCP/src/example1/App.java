package example1;

/**
 * Created by TAWEESOFT on 4/21/16 AD.
 */
public class App {

    public static void main(String[] ar){
        oldSystem();
        newSystem();
    }

    public static void oldSystem() {
        Engine e1 = new Engine(10);
        Engine e2 = new Engine(20);
        System.out.println("example1.Engine e1 has power " + e1.getPower() + " HP");
        System.out.println("example1.Engine e2 has power " + e2.getPower() + " HP");
        System.out.println("Total power = " + (e1.getPower() + e2.getPower()) + " HP");
    }

    public static void newSystem() {

    }
}
