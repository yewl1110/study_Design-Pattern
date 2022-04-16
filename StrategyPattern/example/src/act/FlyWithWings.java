package act;

import act.impl.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날 수 있음");
    }
}
