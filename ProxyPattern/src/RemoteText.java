/**
 * Created by TAWEESOFT on 5/12/16 AD.
 */
public class RemoteText implements Text{

    private String text;

    public RemoteText() {
        try {
            //delay while loading from server.
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        text = "TEXT FROM SERVER";
    }

    public String getText() {
        return text;
    }
}
