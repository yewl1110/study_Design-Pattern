package beverage;

public abstract class Beverage {
    public enum Size {TALL,GRANDE,VENTI};
    public double cost;
    Size size = Size.TALL;
    String description = "제목 없음";

    public Beverage() {}

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
