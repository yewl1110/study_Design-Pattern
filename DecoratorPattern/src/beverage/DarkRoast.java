package beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        super();
        this.cost = 0.99f;
        this.description = "다크로스트 커피";
    }

    public double cost() {
        return this.cost;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
