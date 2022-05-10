package store;

import factory.NYPizzaIngredientFactory;
import factory.PizzaIngredientFactory;
import pizza.*;

public class NYStylePizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(Menu menu) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        switch (menu) {
            case CHEESE -> {
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("뉴욕 스타일 치즈피자");
            }
            case VEGGIE -> {
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("뉴욕 스타일 야채피자");
            }
            case CLAM -> {
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("뉴욕 스타일 조개피자");
            }
            case PEPPERONI -> {
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("뉴욕 스타일 페퍼로니피자");
            }
        }
        return pizza;
    }
}
