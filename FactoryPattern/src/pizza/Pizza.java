package pizza;

import ingredient.cheese.Cheese;
import ingredient.clam.Clams;
import ingredient.dough.Dough;
import ingredient.pepperoni.Pepperoni;
import ingredient.sauce.Sauce;
import ingredient.veggie.Veggies;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    public abstract void prepare();
    public void bake() {
        System.out.println("175도에서 25분 굽기");
    }
    public void cut() {
        System.out.println("사선으로 자르기");
    }
    public void box() {
        System.out.println("포장하기\n");
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}
