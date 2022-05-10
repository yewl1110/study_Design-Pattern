package factory;

import ingredient.cheese.Cheese;
import ingredient.cheese.MozzarellaCheese;
import ingredient.clam.Clams;
import ingredient.clam.FrozenClams;
import ingredient.dough.Dough;
import ingredient.dough.ThickCrustDough;
import ingredient.pepperoni.Pepperoni;
import ingredient.pepperoni.SlicedPepperoni;
import ingredient.sauce.PlumTomatoSauce;
import ingredient.sauce.Sauce;
import ingredient.veggie.BlackOlives;
import ingredient.veggie.EggPlant;
import ingredient.veggie.Spinach;
import ingredient.veggie.Veggies;

public class ChicagoIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] {new BlackOlives(), new Spinach(), new EggPlant()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
