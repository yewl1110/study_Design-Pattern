package decorator;

import beverage.Beverage;

public abstract class CondimentDecorator extends Beverage { //형식을 맞추기 위해 상속받음
    Beverage beverage;
    public abstract String getDescription();
}
