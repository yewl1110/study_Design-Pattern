import beverage.Beverage;
import beverage.DarkRoast;
import beverage.Decaf;
import beverage.Espresso;
import decorator.Milk;
import decorator.Mocha;
import decorator.Soy;
import decorator.Whip;

public class Main {
    public static void main(String[] args ) {
        Beverage beverage = new DarkRoast();
        beverage = new Milk(beverage);
        beverage = new Mocha(beverage);
        beverage = new Milk(beverage);
        beverage = new Whip(beverage);
        beverage = new Soy(beverage);
        print(beverage);

        Beverage beverage1 = new Espresso();
        beverage1 = new Milk(beverage1);
        beverage1 = new Milk(beverage1);
        beverage1 = new Whip(beverage1);
        print(beverage1);

        Beverage beverage2 = new Decaf();
        beverage2 = new Soy(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2 = new Whip(beverage2);
        print(beverage2);

    }
    private static void print(Beverage beverage) {
        System.out.println(beverage.getDescription());
        System.out.println(String.format("$ %.2f",beverage.cost()));
    }
}
