/**
 * Created by TAWEESOFT on 5/12/16 AD.
 */
public abstract class Fruit {
    public abstract void accept(Visitor visitor);
}

class Apple extends Fruit {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class Orange extends Fruit {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}



