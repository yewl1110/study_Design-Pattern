package beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        super();
        this.cost = 0.89f;
        this.description = "하우스블렌드 커피";
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
