package store;

import pizza.*;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(Menu menu) {
        switch (menu) {
            case CHEESE -> {
                return new ChicagoStyleCheesePizza();
            }
            case VEGGIE -> {
                return new ChicagoStyleVeggiePizza();
            }
            case CLAM -> {
                return new ChicagoStyleClamPizza();
            }
            case PEPPERONI -> {
                return new ChicagoStylePepperoniPizza();
            }
            default -> {
                return null;
            }
        }
    }
}
