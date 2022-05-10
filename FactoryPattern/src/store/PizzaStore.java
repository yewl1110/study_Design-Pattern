package store;

import pizza.Pizza;

public abstract class PizzaStore { //client
    public enum Menu {CHEESE, VEGGIE, CLAM, PEPPERONI}

    public Pizza orderPizza(Menu menu) {
        Pizza pizza;

        pizza = createPizza(menu);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(Menu menu);
}
