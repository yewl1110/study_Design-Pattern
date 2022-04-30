package beverage;

public class Decaf extends Beverage {
    public Decaf() {
        super();
        this.cost = 1.05f;
        this.description = "디카페인 커피";
    }

    public double cost() {
        double cost = this.cost;
        switch(getSize()) {
            case TALL: cost += 0f;break;
            case GRANDE: cost += 0.1f;break;
            case VENTI:  cost += 0.2f;break;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
