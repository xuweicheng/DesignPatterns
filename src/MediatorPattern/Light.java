package MediatorPattern;

/**
 * Created by WeichengXu on 2016/5/23.
 */
public class Light {

    private boolean isOn = false;

    private String location = "";

    public Light(String location) {
        this.location = location;
    }

    public boolean isOn() {
        return isOn;
    }

    public void on() {
        isOn = true;
        System.out.println(location + " light is on.");
    }

    public void off() {
        isOn = false;
        System.out.println(location + " light if off.");
    }

    public void toggle() {
        if (isOn) {
            off();
        } else {
            on();
        }

    }
}
