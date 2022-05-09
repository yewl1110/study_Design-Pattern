import factory.SimplePizzaFactory;
import store.ChicagoStylePizzaStore;
import store.NYStylePizzaStore;
import store.PizzaStore;

public class Main {
    static public void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        nyStore.orderPizza(PizzaStore.Menu.VEGGIE);
        nyStore.orderPizza(PizzaStore.Menu.CHEESE);

        PizzaStore chicagoStore = new ChicagoStylePizzaStore();
        chicagoStore.orderPizza(PizzaStore.Menu.PEPPERONI);
        chicagoStore.orderPizza(PizzaStore.Menu.CLAM);
    }
}
