import act.*;
import animal.*;

public class Main {
    public static void main(String[] args) {
        Duck decoyDuck = new DecoyDuck();
        decoyDuck.setFlyBehavior(new FlyNoWay());
        decoyDuck.setQuackBehavior(new MuteQuack());
        behavior(decoyDuck);

        Duck mallardDuck = new MallardDuck();
        mallardDuck.setFlyBehavior(new FlyWithWings());
        mallardDuck.setQuackBehavior(new Quack());
        behavior(mallardDuck);

        Duck redheadDuck = new RedheadDuck();
        redheadDuck.setFlyBehavior(new FlyWithWings());
        redheadDuck.setQuackBehavior(new Quack());
        behavior(redheadDuck);

        Duck rubberDuck = new RubberDuck();
        rubberDuck.setFlyBehavior(new FlyNoWay());
        rubberDuck.setQuackBehavior(new Squeak());
        behavior(rubberDuck);
    }

    private static void behavior(Duck duck) {
        System.out.println("===============================");
        duck.display();
        duck.performFly();
        duck.performQuack();
        duck.swim();
        System.out.println("===============================");
    }
}
