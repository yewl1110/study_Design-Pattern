package factory;

import ingredient.cheese.Cheese;
import ingredient.clam.Clams;
import ingredient.dough.Dough;
import ingredient.pepperoni.Pepperoni;
import ingredient.sauce.Sauce;
import ingredient.veggie.Veggies;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
