package act;

import act.impl.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("---------정적---------");
    }
}
