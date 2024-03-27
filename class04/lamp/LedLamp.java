
public class LedLamp extends Lamp {

    public LedLamp() {
        super();
    }

    public LedLamp(boolean on) {
        super(on);
    }

    @Override
    public void print() {
        System.out.println("The led lamp is currently " + (this.isOn() ? "on" : "off"));
    } 
}
