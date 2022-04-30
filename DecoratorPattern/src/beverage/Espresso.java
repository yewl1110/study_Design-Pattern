package beverage;

public class Espresso extends Beverage {
    public Espresso() {
        super();
        this.cost = 1.99f;
        this.description = "에스프레소 커피";
    }

    public double cost() {
        return this.cost;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
