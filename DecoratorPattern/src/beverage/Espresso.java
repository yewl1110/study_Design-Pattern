package beverage;

public class Espresso extends Beverage {
    public Espresso() {
        super();
        this.cost = 1.99f;
        this.description = "에스프레소 커피";
    }

    public double cost() {
        double cost = this.cost;
        switch(getSize()) {
            case TALL: cost += 0f;break;
            case GRANDE: cost += 0.2f;break;
            case VENTI:  cost += 0.4f;break;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
