/**
 * Created by TAWEESOFT on 5/5/16 AD.
 */
public class EqualExpression implements Expression{

    private Expression left ,right;


    public EqualExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret() {
        return left.interpret() == right.interpret();
    }

    @Override
    public String toString() {
        return String.format("( %s EQ %s )" , left.toString(), right.toString());
    }
}
