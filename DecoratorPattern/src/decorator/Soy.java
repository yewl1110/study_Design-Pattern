package decorator;

import beverage.Beverage;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost() + 0.15f;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }
}
