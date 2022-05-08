import factory.SimplePizzaFactory;
import store.PizzaStore;

public class Main {
    static public void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        pizzaStore.orderPizza("clam");
        System.out.println("----------");
        pizzaStore.orderPizza("veggie");
        System.out.println("----------");
        pizzaStore.orderPizza("cheese");
        System.out.println("----------");
        pizzaStore.orderPizza("pepperoni");
    }
}
