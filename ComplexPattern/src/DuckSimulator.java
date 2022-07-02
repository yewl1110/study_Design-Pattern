import adaptor.GooseAdaptor;
import component.*;
import composite.Flock;
import decorator.QuackCounter;
import factory.AbstractDuckFactory;
import factory.CountingDuckFactory;
import factory.DuckFactory;
import observer.Observer;
import observer.QuackAudience;
import observer.Quackologist;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();
        AbstractDuckFactory duckFactory = new DuckFactory();

        duckSimulator.simulate(duckFactory, countingDuckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory, AbstractDuckFactory countingDuckFactory) {
        Quackable redheadDuck = countingDuckFactory.createRedheadDuck();
        Quackable duckCall = countingDuckFactory.createDuckCall();
        Quackable rubberDuck = countingDuckFactory.createRubberDuck();
        Quackable gooseDuck = duckFactory.createGoose();

        System.out.println("오리 시뮬레이션");

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallard = new Flock();

        Quackable mallardDuck = countingDuckFactory.createMallardDuck();
        Quackable mallardDuck1 = countingDuckFactory.createMallardDuck();
        Quackable mallardDuck2 = countingDuckFactory.createMallardDuck();
        Quackable mallardDuck3 = countingDuckFactory.createMallardDuck();

        flockOfMallard.add(mallardDuck);
        flockOfMallard.add(mallardDuck1);
        flockOfMallard.add(mallardDuck2);
        flockOfMallard.add(mallardDuck3);

        flockOfDucks.add(flockOfMallard);

        Observer quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);
        
        // 물오리만 보러 온 사람들
        Observer quackAudience = new QuackAudience();
        flockOfMallard.registerObserver(quackAudience);

        System.out.println("전체 오리");
        simulate(flockOfDucks);

        System.out.println("오리가 운 횟수: " + QuackCounter.getQuacks());

        System.out.println("mallard 오리");
        simulate(flockOfMallard);
        System.out.println("오리가 운 횟수: " + QuackCounter.getQuacks());

    }

    void simulate(Quackable quackable) {
        quackable.quack();
    }
}
