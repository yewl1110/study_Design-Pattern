package beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        super();
        this.cost = 0.89f;
        this.description = "하우스블렌드 커피";
    }

    public double cost() {
        return this.cost;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
