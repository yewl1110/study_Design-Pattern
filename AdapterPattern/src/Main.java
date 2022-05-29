import adaptor.DuckAdaptor;
import adaptor.EnumerationIterator;
import adaptor.TurkeyAdaptor;
import entity.Duck;
import entity.MallardDuck;
import entity.Turkey;
import entity.WildTurkey;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        example1();
        example2();
    }

    public static void example1() {
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

    public static void example2() {
        List<String> foodList = List.of("치킨", "피자", "라면", "삼겹살", "갈비");

        System.out.println("enumeration 어댑터");
        Iterator iterator = new EnumerationIterator<>(Collections.enumeration(foodList));
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
