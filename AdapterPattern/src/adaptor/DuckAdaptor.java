package adaptor;

import entity.Duck;
import entity.Turkey;

public class DuckAdaptor implements Turkey {
    Duck duck;
    public DuckAdaptor(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        int flag = (int) (Math.random() * 100000f);
        if(flag % 5 == 0) {
            duck.fly();
        }
    }
}
