package store;

import pizza.*;

public class NYStylePizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(Menu menu) {
        switch (menu) {
            case CHEESE -> {
                return new NYStyleCheesePizza();
            }
            case VEGGIE -> {
                return new NYStyleVeggiePizza();
            }
            case CLAM -> {
                return new NYStyleClamPizza();
            }
            case PEPPERONI -> {
                return new NYStylePepperoniPizza();
            }
            default -> {
                return null;
            }
        }
    }
}
