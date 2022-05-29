import adaptor.DuckAdaptor;
import adaptor.TurkeyAdaptor;
import entity.Duck;
import entity.MallardDuck;
import entity.Turkey;
import entity.WildTurkey;
public class Main {
    public static void main(String[] args) {
        System.out.println("진짜 오리");
        Duck duck1 = new MallardDuck();
        turkeyAdaptorTest(duck1);
        System.out.println("터키어댑터");
        Duck duck2 = new TurkeyAdaptor(new WildTurkey());
        turkeyAdaptorTest(duck2);
        System.out.println("진짜 칠면조");
        Turkey turkey1 = new WildTurkey();
        duckAdaptorTest(turkey1);
        System.out.println("오리어댑터");
        Turkey turkey2 = new DuckAdaptor(new MallardDuck());
        duckAdaptorTest(turkey2);
    }

    public static void turkeyAdaptorTest(Duck duck) {
        duck.quack();
        duck.fly();
    }

    public static void duckAdaptorTest(Turkey turkey) {
        turkey.gobble();
        turkey.fly();
    }
}
