package receiver;

public class Stereo {
    private String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " Stereo on()");
    }

    public void off() {
        System.out.println(name + " Stereo off()");
    }

    public void setCd() {
        System.out.println("cd 넣음");
    }

    public void setDvd() {
        System.out.println("dvd 넣음");
    }

    public void setRadio() {
        System.out.println("라디오 주파수 조정");
    }

    public void setVolume(int volume) {
        System.out.println("볼륨 설정 " + volume);
    }
}
