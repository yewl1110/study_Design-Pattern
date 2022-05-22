package receiver;

public class GarageDoor {
    private String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " on()");
    }

    public void off() {
        System.out.println(name + " off()");
    }
}
