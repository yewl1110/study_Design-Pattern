package beverage;

public abstract class Beverage {
    public String description;
    public double cost;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
