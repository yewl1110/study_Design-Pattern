package pizza;

import factory.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;
    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println(name + " 준비중");
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        pepperoni = ingredientFactory.createPepperoni();
    }
}
