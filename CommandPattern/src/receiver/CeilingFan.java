package receiver;

public class CeilingFan {
    private String name;
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    int speed;

    public CeilingFan(String name) {
        this.name = name;
        speed = OFF;
    }

    public void high() {
        System.out.println(name + " speed가 HIGH로 설정되었습니다.");
        speed = HIGH;
    }

    public void medium() {
        System.out.println(name + " speed가 MEDIUM로 설정되었습니다.");
        speed = MEDIUM;
    }

    public void low() {
        System.out.println(name + " speed가 LOW로 설정되었습니다.");
        speed = LOW;
    }

    public void on() {
        high();
    }

    public void off() {
        System.out.println(name + " CeilingFan off()");
        speed = OFF;
    }

    public int getSpeed() {
        return speed;
    }
}
