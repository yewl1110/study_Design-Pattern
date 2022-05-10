package factory;

import ingredient.cheese.Cheese;
import ingredient.cheese.ReggianoCheese;
import ingredient.clam.Clams;
import ingredient.clam.FreshClams;
import ingredient.dough.Dough;
import ingredient.dough.ThinCrustDough;
import ingredient.pepperoni.Pepperoni;
import ingredient.pepperoni.SlicedPepperoni;
import ingredient.sauce.MarinaraSauce;
import ingredient.sauce.Sauce;
import ingredient.veggie.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
