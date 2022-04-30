package decorator;

import beverage.Beverage;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost() + 0.10f;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 우유";
    }
}

