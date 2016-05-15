/**
 * Created by TAWEESOFT on 5/5/16 AD.
 */
public class ValueExpression implements Expression{
    private String value;

    public ValueExpression(String value) {
        this.value = value;
    }

    @Override
    public boolean interpret() {
        return value.equalsIgnoreCase("TRUE");
    }

    @Override
    public String toString() {
        return value;
    }
}
