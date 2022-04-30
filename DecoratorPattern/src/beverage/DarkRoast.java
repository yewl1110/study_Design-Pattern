package beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        super();
        this.cost = 0.99f;
        this.description = "다크로스트 커피";
    }

    public double cost() {
        double cost = this.cost;
        switch(getSize()) {
            case TALL: cost += 0f; break;
            case GRANDE: cost += 0.1f; break;
            case VENTI:  cost += 0.2f; break;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
