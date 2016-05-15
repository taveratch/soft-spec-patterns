/**
 * Created by TAWEESOFT on 5/5/16 AD.
 */
public class OrExpression implements Expression {

    private Expression left ,right;

    public OrExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret() {
        return left.interpret() || right.interpret();
    }

    @Override
    public String toString() {
        return String.format("(%s OR %s)" , left.toString() ,right.toString());
    }
}
