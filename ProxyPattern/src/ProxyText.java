/**
 * Created by TAWEESOFT on 5/12/16 AD.
 */
public class ProxyText implements Text {

    private RemoteText remoteText;

    public String getText() {
        if(remoteText == null)
            remoteText = new RemoteText();
        return remoteText.getText();
    }
}
