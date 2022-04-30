package beverage;

public class Decaf extends Beverage {
    public Decaf() {
        super();
        this.cost = 1.05f;
        this.description = "디카페인 커피";
    }

    public double cost() {
        return this.cost;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
