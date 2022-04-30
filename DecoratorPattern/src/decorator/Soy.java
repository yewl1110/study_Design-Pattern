package decorator;

import beverage.Beverage;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        double cost = beverage.cost();
        switch(getSize()) {
            case TALL: cost += 0.15f;break;
            case GRANDE: cost += 0.20f;break;
            case VENTI:  cost += 0.25f;break;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }
}
