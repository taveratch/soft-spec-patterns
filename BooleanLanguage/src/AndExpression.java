/**
 * Created by TAWEESOFT on 5/5/16 AD.
 */
public class AndExpression implements Expression {

    private Expression left , right;

    public AndExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret() {
        return left.interpret() && right.interpret();
    }

    @Override
    public String toString() {
        return String.format("(%s AND %s)" , left.toString() ,right.toString());
    }
}
